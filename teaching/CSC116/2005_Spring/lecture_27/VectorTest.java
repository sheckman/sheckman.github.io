import java.util.*;

public class VectorTest {

   public static void main(String [] args) {

      Vector songs = new Vector();
      songs.add("asdf");
      songs.add("qwerty");
      songs.add("zxcv");

      System.out.println("Vector after three items are added.");
      for(int i = 0; i < songs.size(); i++) {
         System.out.println(i + " " + songs.get(i));
      }
      System.out.println("Size = " + songs.size() + "\n");

      songs.remove(0);

      System.out.println("Vector after element 0 has been removed.");
      for(int i = 0; i < songs.size(); i++) {
         System.out.println(i + " " + songs.get(i));
      }
      System.out.println("Size = " + songs.size() + "\n");

      songs.add("hjkl");

      System.out.println("Vector after another element has been added.");
      for(int i = 0; i < songs.size(); i++) {
         System.out.println(i + " " + songs.get(i));
      }
      System.out.println("Size = " + songs.size() + "\n");

   }
}
