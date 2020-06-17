/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
public class Car
{
    double Efficiency, Gas;
    
    public Car(double Efficiency)
    {
        this.Efficiency = Efficiency;
        Gas = 0;
    }
    public void addGas(double Gas)
    {
        this.Gas = this.Gas + Gas;
    }
    public void drive(double distance)
    {
        this.Gas = Gas - (distance/Efficiency);
    }
    public double getGasInTank()
    {
        return Gas;
    }
}