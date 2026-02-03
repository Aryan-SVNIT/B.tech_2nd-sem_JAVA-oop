import java.lang.Math;
public class MonteCarlo7 {
    public static void main(String[] args) {
        int n = 1000000;
        int count=0;

        for (int i=0; i<n; i++) 
        {

            double x = Math.random()*2-1;
            double y = Math.random()*2-1;

            if (x<0 || (x>=0 && y>=0 && y<x)) 
            {
                count++;
            }
        }

        double probability = (double) count/n ;
        System.out.println("Probability of 1st amd 3rd region is : " + probability);
    }
}
