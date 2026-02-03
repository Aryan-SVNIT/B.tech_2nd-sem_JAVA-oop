import java.util.Scanner;
class Value{
    float M;
    float T1;
    float T2;
    double energy(){
         return  (1.0)*M*(T2-T1)*4184 ;
    }
}

public class Energy2 {
    public static void main (String []args){
        Value v =new Value();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kg: ");
        v.M = input.nextFloat();
        System.out.print("Enter the initial Temperature: ");
        v.T1 = input.nextFloat();
        System.out.print("Enter the final Temperature: ");
        v.T2 = input.nextFloat();
        System.out.print("The energy needed is "+v.energy());

    }
}