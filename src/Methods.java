/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

  }

  public int calculateSquare(int num){
    int square = num * num;
    return square;
  }
  public double calculateSquareRoot(int num){
    double sqrt = Math.sqrt(num);
    return sqrt;
  }
  public String toLowerCase(String str){
    String newStr = str.toLowerCase();
    return newStr;
  }
  public boolean isMultiple(int a, int b){
    if(b % a == 0){
      return true;
    }
    else{
      return false;
    }
  }
  public static void prettyInteger(int num){
    String str = "";
    for (int i = 0; i < num ; i++) {
      str += "*";
    }
    str += " " + String.valueOf(num) + " ";

    for (int i = 0; i < num ; i++) {
      str += "*";
    }
    System.out.println(str);
  }
  public static int random(int a, int b){
    return (int) (Math.random() * ((b - a) + 1) + a);

  }
}


