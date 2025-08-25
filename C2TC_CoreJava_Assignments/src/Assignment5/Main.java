package Assignment5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter Hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter Cost per Hour: ");
        double costPerHour = sc.nextDouble();

        Airfare airfare;

        switch(choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        airfare.display();
        sc.close();
    }
    
}
