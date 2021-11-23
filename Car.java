public class Car {

  private int numDoors;
  private int mpg;
  private String color;
  private static int numCars;

  public Car() {
    this.numDoors = 2;
    mpg = 20;
    color = "silver";
    numCars++;
  }

  public Car(int numDoors) {
    this.numDoors = numDoors;
    mpg = 20;
    color = "silver";
     numCars++;
  }

  public Car(int n, int m, String c) {
    numDoors = n;
    mpg = m;
    color = c;
     numCars++;
  }

  public String getColor() {
    return color;
  }

  public int getDoors() {
    return numDoors;
  }

  public void setColor(String s) {
    color = s;
  }

  public int getNumcars(){
    return numCars;
  }

 public boolean isSame(Car tempCar){
   return this.getColor().equals(tempCar.getColor());

 }

}