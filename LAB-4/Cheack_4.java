import java.util.Scanner;
public class Cheack_4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str=input.nextLine();
        int flag=1;
        for (int i=0; i<str.length(); i++){
            for (int j=i+1; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)){
                    flag = 0;
                    break;
                }
            }
            if (flag==0)
                break;
        }
        if (flag == 1)
            System.out.println("Perfect String");
        else
            System.out.println("Not a Perfect String");
    }
}