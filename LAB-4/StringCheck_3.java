import java.util.Scanner;
public class StringCheck_3{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=input.nextLine();
        System.out.print("Enter n: ");
        int n=input.nextInt();
        for(int i = 0; i <str.length(); i++){
            char ch=str.charAt(i);
            int count=0;

            int flag=0;
            for(int k=0; k<i; k++){
                if(str.charAt(k) ==ch){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                continue;
            }
            for(int j=0; j<str.length(); j++){
                if (str.charAt(j)==ch){
                    count++;
                }
            }
            if (count>n){
                System.out.println(ch+"="+count);
            }
        }
    }
}