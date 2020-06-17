/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
public class CircuitTester
{
    public static void main(String[] args)
    {
    Circuit mycircuit = new Circuit(0,0,0);
    System.out.println("The initial state of the first switch is: "+mycircuit.getFirstSwitchState());
    System.out.println("The initial state of the lamp is: "+mycircuit.getLampState());   
    System.out.println("The expected state of the first switch after toggling is 1");
    System.out.println("The expected state of the lamp after toggling is 1");        
    mycircuit.toggleFirstSwitch();  
    System.out.println("The actual state of the first switch after toggling is: "+mycircuit.getFirstSwitchState());
    System.out.println("The actual state of the lamp after toggling is: "+mycircuit.getFirstSwitchState());
    
    System.out.println("The initial state of the second switch is: "+mycircuit.getSecondSwitchState());
    System.out.println("The initial state of the lamp is: "+mycircuit.getLampState());   
    System.out.println("The expected state of the second switch after toggling is 0");
    System.out.println("The expected state of the lamp after toggling is 0");        
    mycircuit.toggleSecondSwitch();  
    System.out.println("The actual state of the second switch after toggling is: "+mycircuit.getFirstSwitchState());
    System.out.println("The actual state of the lamp after toggling is: "+mycircuit.getFirstSwitchState());
    }
}// print out after every test