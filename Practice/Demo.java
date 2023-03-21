package Practice;

public class Demo {
    class Vehicle{
        static void move() {
            System.out.println("Vehicle moves!");
        }
    }
    class Bike extends Vehicle{
        static void move()  {
            System.out.println("Bike moves!");
        }
    }
    public class OverrideDemo {
        public static void main(String[] args) throws Exception {
           // Vehicle v=new Bike();
           // v.move();
        }
    }





}
