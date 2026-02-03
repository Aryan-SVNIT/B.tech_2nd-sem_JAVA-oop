import java.util.Scanner;
class Value{
    float mass;
    float height;
    double BMI(){
         return (1.0*0.45359237*mass)/(height*height*0.0254*0.0254) ;
    }
}

public class BMI4{
    public static void main (String []args){
        Value v =new Value();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        v.mass = input.nextFloat();
        System.out.print("Enter height in inches: ");
        v.height = input.nextFloat();
        System.out.println("BMI is "+v.BMI());
    }
}