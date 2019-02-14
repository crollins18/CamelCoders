import java.util.*;
import static java.lang.System.*;

public class PostFix {

  private String exp;
  private String modExp;

  public PostFix(String inExp) {

    exp = inExp;
  }

  public int evaluate() {
	 	Stack<Integer> s = new Stack<Integer> ();
		Scanner tokens = new Scanner(exp);
		
		while (tokens.hasNext()) {

			if (tokens.hasNextInt()) 
      {
				s.push(tokens.nextInt());
			} 

      else
      {
        String op = tokens.next();

        if (!op.equals(".")) {
				  int num2 = s.pop();
				  int num1 = s.pop();
				
				
          if (op.equals("+")) {
            s.push(num1 + num2);
          } 
          else if (op.equals("-")) {
            s.push(num1 - num2);
          } 
          else if (op.equals("*")) {
            s.push(num1 * num2);
          } 
          else if (op.equals("/")){
            s.push(num1 / num2);
          }

        }

        else {

          break;

        }
        
			}
		}
		return s.pop();
    }

    public String getExpression() {

      for (int i=0; i<exp.length(); i++) {

        if (exp.substring(i,i+1).equals(".")) {

          modExp = exp.substring(0, i);

        }

      }

      return modExp;

    }
    
}