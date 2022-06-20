/**
 * CSC116 Example class demonstrating arrays of objects
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class SongCollection {

    private Song [] songCollection;
    private int counter;
    
    /**
     * Constructor for SongCollection.  Initilizes
     * the Song array
     */
    public SongCollection() {
        songCollection = new Song[100];
        counter = 0;
    }
    
    /**
     * Adds a new song to the colleciton
     * @param newSong to add to collection
     */
    public void addSong(Song newSong) {
        if(counter < songCollection.length) {
            songCollection[counter] = newSong;
            counter++;
        }
        else {
            increaseSize();
            addSong(newSong);
        }
    }
    
    /**
     * Increases the size of the array when it becomes full
     */
    public void increaseSize() {
        Song [] temp = new Song[songCollection.length * 2];
        System.arraycopy(songCollection, 0, temp, 0, songCollection.length);
        songCollection = temp;
    }
    
    /**
     * Starts the program
     * @param args Array of command line arugments
     */
    public static void main(String[] args) {
        SongCollection sc = new SongCollection();
        Song s1 = new Song("Candy Shop", "50 Cent featuring Olivia");
        Song s2 = new Song("Since U Been Gone", "Kelly Clarkson");
        Song s3 = new Song("Hate It Or Love It", "The Game featuring 50 Cent");
        sc.addSong(s1);
        sc.addSong(s2);
        sc.addSong(s3);
        System.out.println("The size is " + sc.songCollection.length);
        sc.increaseSize();
        System.out.println("The size is " + sc.songCollection.length);
    }
}
