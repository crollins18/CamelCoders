import java.util.ArrayList; 

public class Butterfly {

  private int n;
  private int cycleLength;
  private ArrayList<Integer> list = new ArrayList<Integer>();
  public Butterfly (int inN) {
    n = inN;
  }

  public int getN() {

    return n;

  }

  public int sequenceNums() {

    list.add(n);

    for (int i=0; i<list.size(); i++) {

      if (list.get(i) != 1) {

        if (list.get(i) % 2 == 0) {

            list.add(list.get(i)/2);

        }

        else {

          list.add(list.get(i)*3 + 1);

        }

      }

      else {

        break;

      }


    }
    
    cycleLength = list.size();


    return cycleLength;
  }
}
