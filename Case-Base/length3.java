import java.util.Scanner;
class Value{
    float v;
    float a;
    double length(){
         return (1.0*(v*v))/(2*a) ;
    }
}

public class length3{
    public static void main (String []args){
        Value v =new Value();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Speed and acceleration: ");
        v.v = input.nextFloat();
        v.a = input.nextFloat();
        System.out.println("The minimum runway length for this airplane is "+v.length());
    }
}