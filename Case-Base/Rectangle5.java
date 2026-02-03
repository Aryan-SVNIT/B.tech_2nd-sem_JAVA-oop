import java.util.Scanner;

public class Rectangle5{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r1 center x, y, width, height: ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float w1 = sc.nextFloat();
        float h1 = sc.nextFloat();

        System.out.print("Enter r2 center x, y, width, height: ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float w2 = sc.nextFloat();
        float h2 = sc.nextFloat();

        double left1 = x1-w1/2;
        double right1 = x1+w1/2;
        double top1 = y1+h1/2;
        double bottom1 = y1-h1/2;

        double left2 = x2-w2/2;
        double right2 = x2+w2/2;
        double top2 = y2+h2/2;
        double bottom2 = y2-h2/2;
        if (left2>=left1 && right2<=right1 && top2<=top1 && bottom2>=bottom1) 
        {
            System.out.println("Rectangle 2 is inside Rectangle 1");
        }
        else if (left2<right1 && right2>left1 && top2>bottom1 && bottom2<top1) 
        {
            System.out.println("Rectangle 2 overlaps Rectangle 1");
        }
        else 
        {
            System.out.println("Rectangle 2 does not overlap Rectangle 1");
        }
        sc.close();
    }
}
