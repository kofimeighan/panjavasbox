/**
*
* @author: KOFI MEIGHAN
* @date: 2/16/20
*
*/
public class Circuit
{
    public int FirstSwitchState,SecondSwitchState,LampState;
    
    public Circuit(int FirstSwitchState, int SecondSwitchState, int LampState)
    {
        this.FirstSwitchState = FirstSwitchState;
        this.SecondSwitchState = SecondSwitchState;
        this.LampState = LampState;
    }
    public void toggleFirstSwitch()
    {
        if(FirstSwitchState == 0)
            FirstSwitchState=1;
        else
            FirstSwitchState=0;
        if(LampState == 0)
            LampState=1;
        else
            LampState=0;
        
    }
    public void toggleSecondSwitch()
    {
        if(SecondSwitchState == 0)
            SecondSwitchState=1;
        else
            SecondSwitchState=0;
        if(LampState == 0)
            LampState=1;
        else
            LampState=0;
    }
    public int getFirstSwitchState()
    {
        return FirstSwitchState;
    }
    public int getSecondSwitchState()
    {
        return SecondSwitchState;
    }
    public int getLampState()
    {
        return LampState;
    }
    
}
