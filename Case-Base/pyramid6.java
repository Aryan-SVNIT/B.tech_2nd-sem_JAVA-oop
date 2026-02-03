import java.lang.Math;
public class pyramid6 {
    public static void main(String[] args) {
        for(int i=0 ; i<8 ;i++)
        {
            for(int j=0 ; j<7-i ;j++)
            {
                System.out.print(" \t");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print(Math.pow(2, j)+"\t");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(Math.pow(2, i-1-j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
