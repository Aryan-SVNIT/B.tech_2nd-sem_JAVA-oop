import java.util.Scanner;
class Q5_Remainder {
    public static void main (String [] args) {
        int num, digit , temp=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter 5 digit Number : ");
        num = sc.nextInt();
        for(int i=0 ; i<5; i++){
            digit= num%10;
            temp=(temp*10) +digit ;
            num=num/10;
        }
        for(int i=0 ; i<5; i++){
            digit = temp %10;
            temp =temp /10;
            System.out.print(digit+"  ");
        }
    }
}
