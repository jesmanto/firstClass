class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int num = 4;
    char alph = 'A';
    String name = "Jesse";
    boolean food = true;
    float dec = 23.233f;
    double precision = 123.234535;
    Jesse.haveEaten(null);
  }
}
class Jesse{
  public boolean eaten(){
    String myArray[] = {};
    Main.main(myArray);
    return true;
  }
  // Create a static function called haveEaten that returns a boolean
  // The function takes a string argument, food
  // The function returns false if the input is empty or null, and returns true if otherwise.
  
  public static boolean haveEaten(String food){
    if(food == "" || food == null){
      return false;
    }
    System.out.print("Yes, I have eaten " + food);
    return true;
  }
}
