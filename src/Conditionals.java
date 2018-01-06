import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {


  }
  public boolean isOdd(int n){
    if(n % 2 == 0){
      return true;
    }else{
      return false;
    }
  }
  public boolean isMultipleOfThree(int n){
    if(n % 3 == 0){
      return true;
    }
    return false;
  }
  public boolean isOddAndIsMultipleOfThree(int n){
    if(n % 3 == 0 && n % 2 == 0){
      return true;
    }
    return false;
  }
  public boolean isOddAndIsMultipleOfThree2(int n){
    if(isMultipleOfThree(n) == true && isOdd(n) == true){
      return true;
    }
    return false;
  }
  public void fizzMultipleofThree(int n){
    if(isMultipleOfThree(n)== true){
      System.out.println("Fizz");
    }
    System.out.println(n);
  }
  public boolean fromLondon(Person person){
    if(person.getCity() == "London"){
      return true;
    }
    return false;
  }
  public void nameLongerThan5(Person person){
    if(person.getName().length() > 5){
      System.out.println(person.getName());
    }else{
      System.out.println("Name is too short!");
    }
  }
  public boolean cigarParty(int cigars, boolean isWeekend){
    if(39 < cigars && cigars < 61 && isWeekend == false){
      return true;
    }
    else if (39 < cigars && isWeekend == true) {
    return true;

    }
    return false;
  }
  public int caughtSpeeding(int speed, boolean birthday){
    int newSpeed = speed;
    if(birthday){
      newSpeed = speed - 5;
    }
    if(newSpeed <= 60){
      return 0;
    }
    else if(61 <= newSpeed && newSpeed <= 80){
      return 1;
    }
    else {
      return 2;
    }
  }
  public String alarmClock(int day, boolean onVacation){
    if(day < 6 && onVacation == false){
      return "7:00";
    }
    else if(day > 5 && onVacation == false){
      return "10:00";
    }
    else if(day < 6 && onVacation == true){
      return "10:00";
    }
    else {
      return "off";
    }
  }
  public int areNumsSame(int a, int b, int c){
    if( a == b && a == c){
      return 20;
    }
    else if(a != b && a != c && b != c){
      return 0;
    }
    else{
      return 10;
    }
  }
  public int blackJack(int a, int b){
    if(a > b && a < 21){
      return a;
    }
    else if(b > a && b < 21){
      return b;
    }
    else if(b > 21 && a < 21){
      return a;
    }
    else if(a > 21 && b < 21){
      return b;
    }
    else {
      return 0;
    }
  }
  public static boolean evenlySpaced(int a, int b, int c){
    List<Integer> numList = new ArrayList();
    numList.add(a);
    numList.add(b);
    numList.add(c);
    Collections.sort(numList);

    if(numList.get(2) - numList.get(1) == numList.get(1) - numList.get(0)){
      return true;
    }
    return false;

  }
}

