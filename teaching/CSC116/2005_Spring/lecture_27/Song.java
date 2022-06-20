/**
 * CSC116 Example class that demonstrates a container
 * class that may be used instead of parallel arrays
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class Song {

    private String title;
    private String artist;
    
    /**
     * Creates a song object
     * @param title of the song
     * @param artist of the song
     */
    public Song(String title, String artist) {
        super();
        this.title = title;
        this.artist = artist;
    }

    /**
     * Returns the artist of the song
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }
    
    /**
     * Sets the artist of the song
     * @param artist of the song
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    /**
     * Returns the title of the song
     * @return title of the song
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the title of the song
     * @param title of the song
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns a string with the song title and artist
     * @return song title and artist
     */
    public String toString() {
       return title + " by " + artist;
    }
}
