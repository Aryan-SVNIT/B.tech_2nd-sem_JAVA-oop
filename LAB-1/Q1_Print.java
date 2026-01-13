import java.util.Scanner ;
class variable{
    int num1;
    int num2;
}
    class Q1_Print {
        public static void main(String[] args) {
            variable V =new variable();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 1st num : ");
            V.num1 = sc.nextInt();
            System.out.print("Enter 2nd num : ");
            V.num2 = sc.nextInt();
            System.out.println("Add : " + (V.num1 + V.num2));
            System.out.println("Sub : " + (V.num1 - V.num2));
            System.out.println("Multiply : " + (V.num1 * V.num2));
            System.out.println("Quotient : " + (V.num1 % V.num2));

        }
    }