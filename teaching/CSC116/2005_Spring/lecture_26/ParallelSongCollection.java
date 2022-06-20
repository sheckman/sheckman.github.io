/**
 * CSC116 Example class demonstrating parallel arrays
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class ParallelSongCollection {

    private String [] title;
    private String [] artist;
    private int counter;
    
    /**
     * Constructor for ParallelSongCollection.  Initilizes
     * the title and artist parallel arrays
     */
    public ParallelSongCollection() {
        title = new String[100];
        artist = new String[100];
        counter = 0;
    }
    
    /**
     * Adds a new song to the colleciton
     * @param newTitle of the song
     * @param newArtist of the song
     */
    public void addSong(String newTitle, String newArtist) {
        if(counter < title.length && counter < artist.length) {
            title[counter] = newTitle;
            artist[counter] = newArtist;
            counter++;
        }
        else {
            increaseSize();
            addSong(newTitle, newArtist);
        }
    }
    
    /**
     * Increases the size of the array when it becomes full
     */
    public void increaseSize() {
        String [] tempTitle = new String[title.length * 2];
        String [] tempArtist = new String[artist.length * 2];
        System.arraycopy(title, 0, tempTitle, 0, title.length);
        System.arraycopy(artist, 0, tempArtist, 0, artist.length);
        title = tempTitle;
        artist = tempArtist;
    }

    /**
     * Starts the program
     * @param args Array of command line arugments
     */
    public static void main(String[] args) {
        ParallelSongCollection sc = new ParallelSongCollection();
        sc.addSong("Candy Shop", "50 Cent featuring Olivia");
        sc.addSong("Since U Been Gone", "Kelly Clarkson");
        sc.addSong("Hate It Or Love It", "The Game featuring 50 Cent");
        System.out.println("The size for title is " + sc.title.length);
        System.out.println("The size for artist is " + sc.artist.length);
        sc.increaseSize();
        System.out.println("The size for title is " + sc.title.length);
        System.out.println("The size for artist is " + sc.artist.length);
    }
}
