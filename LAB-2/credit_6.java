import java.util.Scanner;
class balance {
    int acc, bal, charge, credit, limit;

    int checklimit() {
        return (bal + charge - credit);
    }
}
public class credit_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        balance V = new balance();
        System.out.println("Enter Account number: ");
        V.acc = input.nextInt();
        System.out.println("Enter balance at the begining of the month:");
        V.bal = input.nextInt();
        System.out.println("Enter total of all items charged by the customer this month : ");
        V.charge = input.nextInt();
        System.out.println("Enter total of all credits applied to the customer this month :  ");
        V.credit = input.nextInt();
        System.out.println("Enter credit limit : ");
        V.limit = input.nextInt();
        int newbal = V.checklimit();
        if (newbal > V.limit) {
            System.out.println("Credit limit exceeded.");
        } else {
            System.out.println("Remaining balance : " + (V.limit - newbal));
        }
    }
}
