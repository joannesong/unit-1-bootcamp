/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {

    Cat garfield = new Cat();
    Cat pinkPanther = new Cat();
    Cat catWoman= new Cat();
    garfield.setName("Garfield");
    pinkPanther.setName("Pink Panther");
    catWoman.setName("Catwoman");

    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("Sushi");
    catWoman.setFavoriteFood("McDonalds");

    garfield.setAge(1);
    pinkPanther.setAge(2);
    catWoman.setAge(3);

    System.out.println(isOlder(garfield, catWoman));


  }
  public static boolean isOlder(Cat cat1, Cat cat2){
    if(cat1.getAge() > cat2.getAge()){
      return true;
    }
    return false;
  }
  public void makeBestFriends(Cat cat1, Cat cat2){
    cat1.setFavoriteFood("fish");
    cat2.setFavoriteFood("fish");
  }
  public String makeKitten(Cat cat1, Cat cat2){
   String str = "";
   str += cat1.getName() + cat2.getName() + " with age 0";
   return str;
  }
  public void adoption(Cat cat, Person person){
    String str = "";
    if(cat.getName() != "Catwoman"){
      cat.setOwner(person);
      str += cat.getOwner() + " is now " + cat.getName() + "'s owner!";
      System.out.println(str);
    }
    else{
      System.out.println("Catwoman will never be anyone's pet!");
    }
  }
  public boolean isFree(Cat cat){
    if(cat.getOwner() == null){
      return false;
    }
    return true;
  }
  public boolean isSibling (Cat cat1, Cat cat2){
    if(cat1.getOwner() == cat2.getOwner()){
      return true;
    }
    return false;
  }
}
