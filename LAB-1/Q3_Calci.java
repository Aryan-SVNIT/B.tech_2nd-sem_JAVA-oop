import java.util.Scanner;
class Variable{
    int num1 , num2 , num3;
    float sum(){
        return (num1 + num2 + num3);
    }
    int prod(){
        return (num1 * num2 * num3);
    }
    float avg(){
        return (sum()/3) ;
    }
}
class Q3_Calci {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        Variable V = new Variable();
        System.out.print("Enter 1st Num : ");
        V.num1= Sc.nextInt();
        System.out.print("Enter 2nd Num : ");
        V.num2= Sc.nextInt();
        System.out.print("Enter 3rd Num : ");
        V.num3= Sc.nextInt();
        float Sumation = V.sum();
        int Product = V.prod();
        float Average = V.avg();
        System.out.println("Sum : "+Sumation);
        System.out.println("Product : "+Product);
        System.out.println("Average : "+Average);
        if(V.num1>V.num2){
           if(V.num1>V.num3) {
               System.out.println("Max = "+V.num1);
           }
            else  {
                System.out.println("Max = "+V.num3);
            }
        }
        else if(V.num2>V.num1){
            if(V.num2>V.num3) {
                System.out.println("Max = "+V.num2);
            }
            else  {
                System.out.println("Max = "+V.num3);
            }
        }
        else
            System.out.println("Max = "+V.num3);
        if(V.num1<V.num2){
            if(V.num1<V.num3) {
                System.out.println("Min = "+V.num1);
            }
            else  {
                System.out.println("Min = "+V.num3);
            }
        }
        else if(V.num2<V.num1){
            if(V.num2<V.num3) {
                System.out.println("Min = "+V.num2);
            }
            else  {
                System.out.println("Min = "+V.num3);
            }
        }
        else
            System.out.println("Min = "+V.num3);




    }
}
