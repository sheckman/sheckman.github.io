import java.io.*;

public class IO_Example {

   public static void main(String [] args) {

     try {
     PrintWriter out = new PrintWriter(new FileWriter("out.txt"));
     
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();
        out.println(line);
     }
     catch (IOException e) {
        System.out.println("Exception: " + e);
     }
   }
}
