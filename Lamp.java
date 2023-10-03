import java.util.*;

class Lamp
{
    boolean isOn;
    String lampType;
    
    Lamp(String lampType,boolean isOn)
    {
        this.lampType=lampType;
        this.isOn=isOn;
    }
    
    String turnOn()
    {
        if(this.isOn==true)
        {
            return " is Already On";
        }
        this.isOn=true;
        return " is On";
    }
    
    String turnOff()
    {
        this.isOn=false;
        return " is Off";
    }
};

class TestLamp
{
    public static void main(String args[])
    {
        Lamp l1=new Lamp("Led",true);
        System.out.println(l1.lampType+l1.turnOn()); 
        System.out.println(l1.lampType+l1.turnOff());
        
        Lamp l2=new Lamp("Halogen",false);
        System.out.println(l2.lampType+l2.turnOn());
        System.out.println(l2.lampType+l2.turnOff());
    }
};
