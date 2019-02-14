import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Main {
  
    public static void main(String[] args) throws IOException {

    Scanner file = new Scanner(new File("butterfly.txt"));  
		int size = file.nextInt();
		for(int i = 0; i<size; i++)
		  {
        Butterfly b = new Butterfly(file.nextInt());
        System.out.println(String.valueOf(b.getN()) + " " + String.valueOf(b.sequenceNums()));

      }
    }
}