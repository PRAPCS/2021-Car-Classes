class Main {
  public static void main(String[] args) {
    

    Car c1 = new Car();
    System.out.println(c1.getColor());

    Car c2 = new Car(4);
    System.out.println(c2.getDoors());
    System.out.println(c1.getDoors());

    c1.setColor("pink");
    System.out.println(c1.getColor());

    Car c4 = new Car(4,10,"red");
     c1.setColor("silver");
    
    System.out.println(c1.isSame(c2));
    
    System.out.println(c1.getNumcars());
    System.out.println(c2.getNumcars());
    System.out.println(c4.getNumcars());
    
  }
}