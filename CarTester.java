/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
public class CarTester
{
    public static void main(String[] args)
    {
        Car mycar = new Car(50);
        System.out.println("Your car initially has "+mycar.getGasInTank()+" miles in it's tank.");
        mycar.addGas(20);
        mycar.drive(100);
        double gasLeft = mycar.getGasInTank();
        System.out.println("Now, your car has "+mycar.getGasInTank()+" miles in it.");
    }
}