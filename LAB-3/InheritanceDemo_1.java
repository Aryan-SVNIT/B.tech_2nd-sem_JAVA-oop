// class Figure {
//     double r; 
//     double a; 
//     double v; 
//     void dispArea() {
//         System.out.println("Area is: " + a);
//     }
//     void dispVolume() {
//         System.out.println("Volume is: " + v);
//     }
// }
// class con extends Figure {
//     double h;
//     double s;
//     double r;
//     public con(double radius, double height, double slantHeight) {
//         this.r = radius;
//         this.h = height;
//         this.s = slantHeight;
//     }
//     public void calcArea() {
//         a = (Math.PI*r*s)+(Math.PI*r*s);
//     }
//     public void calcVolume() {
//         v = (Math.PI*r*s)/3;
//     }
// }
// public class InheritanceDemo {
//     public static void main(String[] args) {
//         con fig = new con (5,6,7);
//         fig.calcArea();
//         fig.calcVolume();
//         fig.dispArea();
//         fig.dispVolume();
//     }
// }
class Figure {
    double r;
    double a;
    double v;

    void dispArea() {
        System.out.println("Area is: " + a);
    }

    void dispVolume() {
        System.out.println("Volume is: " + v);
    }
}

class Cone extends Figure {
    double h;
    double s;

    public Cone(double radius, double height, double slantHeight) {
        this.r = radius;
        this.h = height;
        this.s = slantHeight;
    }

    public void calcArea() {
        a = (Math.PI * r * s) + (Math.PI * r * r);
    }

    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3;
    }
}

public class InheritanceDemo_1 {
    public static void main(String[] args) {
        Cone fig = new Cone(5, 6, 7);
        fig.calcArea();
        fig.calcVolume();
        fig.dispArea();
        fig.dispVolume();
    }
}
