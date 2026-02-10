import java.util.Scanner;
public class password_2{
    static boolean isValid(String str){
        int l= str.length();

        if (l< 5 || l > 12)
            return false;

        int lowercase = 0;
        int digit = 0;

        for (int i=0; i<l; i++) {
            char ch=str.charAt(i);

            if(ch>='a' && ch<='z'){
                lowercase=1;
            }
            else if (ch >= '0' && ch <= '9'){
                digit = 1;
            }
            else{
                return false;
            }
        }

        if (lowercase == 0 || digit == 0)
            return false;

        for (int i=0; i<l-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                return false;
        }

        for (int i = 0; i < l-3; i++) {
            if (str.charAt(i) == str.charAt(i + 2) &&
                    str.charAt(i + 1) == str.charAt(i + 3))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String str = scanner.nextLine();
        if (isValid(str))
            System.out.println("Accepted");
        else
            System.out.println("Rejected");
    }
}