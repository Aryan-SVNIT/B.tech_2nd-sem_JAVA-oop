import java.util.Scanner;
import java.lang.Math;
class Q4_Circle {
    public static void main(String[]args){

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int radius = Sc.nextInt();
        int diameter = 2*radius ;
        double perimeter = 2*(Math.PI*radius);
        double Area = Math.PI * radius * radius ;
        System.out.println("Diameter : "+diameter);
        System.out.println("Perimeter : "+perimeter);
        System.out.println("Area : "+Area);
    }
}