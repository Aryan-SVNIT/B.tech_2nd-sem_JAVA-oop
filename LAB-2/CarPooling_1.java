import java.util.Scanner;

class Variab {
float totalMile , cost, avg, tolls , perGallon;
float fuel(){
    return (totalMile/perGallon)*cost ;
}
float sum(){
    return fuel()+avg+tolls ;
    }
}

class CarPooling_1 {
    public static void main ( String[]args){
    Variab V = new Variab();
        Scanner sc = new Scanner(System.in);
        System.out.print("total miles driven per day : ");
        V.totalMile = sc.nextFloat();
        System.out.print("cost per gallon of gasoline: ");
        V.cost = sc.nextFloat();
        System.out.print("average fees per day: ");
        V.avg = sc.nextFloat();
        System.out.print("tolls per day: ");
        V.tolls = sc.nextFloat();
        System.out.print("Gasoline per Gallon: ");
        V.perGallon = sc.nextFloat();
        float Total = V.sum();
        System.out.println("total fuel: "+V.fuel());
        System.out.print("total cost: "+Total);
    }
}