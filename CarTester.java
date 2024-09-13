
import java.util.Scanner;
public class CarTester{
    public static Car addCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the car's miles: ");
        int miles = scanner.nextInt();
        System.out.println("Enter the car's gallons: ");
        int gallons = scanner.nextInt();
        return new Car(name,miles,gallons);
    }
    public static void main(String[] args){
        Car car1 = addCar();
        System.out.println("----NEXT CAR-------");
        Car car2 = addCar();
        System.out.println(car2.toString());
    }
}
