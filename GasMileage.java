import java.util.Scanner;
 class  Input{
     double miles , gallons;
     int c;
     double mpg(){
         return miles / gallons ;
     }
 }

public class GasMileage {
    public static void main(String[] args){
        Input A = new Input();
        Scanner input = new Scanner(System.in);
        double totalmiles=0,fule=0;
        A.c=1;
        while (A.c != 0) {
            System.out.println("Enter miles driven: ");
            A.miles = input.nextDouble();
            System.out.println("Enter gallons : ");
            A.gallons = input.nextDouble();
            System.out.println("Miles per gallon for this trip: " + A.mpg());
            System.out.println("for continue 1/0 : ");
            A.c = input.nextInt();

            totalmiles += A.miles;
            fule += A.gallons;
        }
        System.out.println("Combined miles per gallon: " + (totalmiles/fule));


    }
}
