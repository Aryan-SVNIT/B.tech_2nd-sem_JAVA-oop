import java.util.Scanner;
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter range: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("Enter pattern: ");
        String pattern = input.next();
        int count = 0;
        for (int i=x;i<=y;i++){
            String num = String.valueOf(i);
            if (num.contains(pattern)){
                count++;
            }
        }
        System.out.println("The number of times "+pattern+" occurred between "+ x+" to "+y+": "+count);
    }
}