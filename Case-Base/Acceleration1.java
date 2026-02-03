import java.util.Scanner;
class Value{
    float v1;
    float v2;
    float t;
    double acc(){
         return (1.0*(v2-v1))/t ;
    }
}

public class Acceleration1 {
    public static void main (String []args){
        Value v =new Value();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter v1, v2 and t: ");
        v.v1 = input.nextFloat();
        v.v2 = input.nextFloat();
        v.t = input.nextFloat();
        System.out.println("Acceleration: "+v.acc());

    }
}