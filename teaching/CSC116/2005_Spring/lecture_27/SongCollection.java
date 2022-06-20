import java.util.*;

/**
 * CSC116 Example class demonstrating arrays of objects
 * @author Sarah E. Smith (sarah_smith@ncsu.edu)
 * @version 1.0
 */
public class SongCollection {

    private Vector songCollection;
    
    /**
     * Constructor for SongCollection.  Initilizes
     * the Song vector
     */
    public SongCollection() {
        songCollection = new Vector(2); //Initilizes vector to size 10
    }
    
    /**
     * Adds a new song to the colleciton
     * @param newSong to add to collection
     */
    public void addSong(Song newSong) {
       songCollection.add(newSong);
    }
    
    /**
     * Removes the specified song
     * @param Song to remove
     */
    public void removeSong(Song toRemove) {
       songCollection.remove(toRemove);
    }

    /**
     * Prints the song collection to the terminal window
     */
    public void printCollection() {
       for(int x = 0; x < songCollection.size(); x++) {
          Song current = (Song)songCollection.get(x);
          System.out.println(current.toString());
       }
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
        System.out.println("The size is " + sc.songCollection.size());
        sc.addSong(s2);
        sc.addSong(s3);
        System.out.println("The size is " + sc.songCollection.size());
        sc.removeSong(s2);
        System.out.println("The size is " + sc.songCollection.size());
        sc.printCollection();
    }
}
