/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {
    //printEven(10);
    printSum3();
    printNTimes(-2, "h");
  }
  public void printNum(){
    for (int i = 1; i <11 ; i++) {
      System.out.println(i);
    }
  }
  public void printNum2(){
    int num = 1;
    while(num < 11){
      System.out.println(num);
      num++;
    }
  }
  public void  printNum3(int n){
    int num = 1;
    while (num < n + 1){
      System.out.println(num);
      num++;
    }
  }
  public static void printEven(int n){
    for (int i = 2; i <= n ; i+=2) {
      System.out.println(i);
    }
  }
  public static void printSum(){
    int sum = 0;
    for (int i = 1; i < 11; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
  public static void printSum2(int n){
    int sum = 0;
    for (int i = 1; i < n +1; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
  public static void printSum3(){
    int sum = 0;
    for (int i = 1; i < 10001; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
  public static void printNTimes(int n, String s){
    String str = "";
    while(n > 0){
      str += s;
      n--;
    }
    System.out.println(str);
    if(n < 0){
      System.out.println("");
    }
  }
  public static void printFirst10Fib(){

  }

}

//        > 9. Modify the method to print out the string concatenated with itself n times.
//        >10. Write a method that prints the first ten Fibonnaci numbers.
//        >11. Modify the method to sum the first ten Fibonnaci numbers.
//        >12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,




















