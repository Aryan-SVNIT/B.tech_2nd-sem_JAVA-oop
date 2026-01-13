import java.util.Scanner;
class calc
{
    int num1;
    int num2;
}
class Q2_Inequility
{
    public static void main (String [] args)
    {
         calc c = new calc ();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter 1st Num : ");
         c.num1= sc.nextInt();
        System.out.print("Enter 2nd Num : ");
        c.num2= sc.nextInt();
        if(c.num1>c.num2){
            System.out.print(c.num1+" is larger");
        }
        else if(c.num1==c.num2){
            System.out.print("the number are equal");
        }
        else{
            System.out.print(c.num2+" is larger");
        }
    }
}
