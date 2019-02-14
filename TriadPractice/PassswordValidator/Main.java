import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Main {
  public static void main(String[] args) throws IOException {
    
    Scanner file = new Scanner(new File("password.txt"));  
		int size = file.nextInt();
    file.nextLine();
    
		for(int i = 0; i<size; i++) {

      Password p = new Password(file.nextLine());
      System.out.println(p.checkPassword());

    }

  
  }
}