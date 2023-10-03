import java.util.*;

class Tv
{
    int channel,volumeLevel;
    boolean on;
    
    Tv()
    {
        this.channel=1;
        this.volumeLevel=1;
        this.on=false;
    }
    
    void turnOn()
    {
        this.on=true; 
    }
    
    void turnOff()
    {
        this.on=false;
    }
    
    void setChannel(int newChannel)
    {
        if(this.on==false) 
        {
            System.out.println("You cannot Set Channel when Tv is off");
        }
        else
        {
            if(newChannel<1)
            {
                System.out.println("Channel Limit Deceeded");
                this.channel=1;
            }
            else if(newChannel>40) 
            {
                System.out.println("Channel Limit Exceeded");
                this.channel=40;
            }
            else this.channel=newChannel;
        }
    }
    
    void setVolume(int newVolume)
    {
        if(this.on==false) 
        {
            System.out.println("You cannot Set volume when Tv is off");
        }
        else
        {
            if(newVolume<1)
            {
                System.out.println("Volume limit Deceeded");
                this.volumeLevel=1;
            }
            if(newVolume>7) 
            {
                System.out.println("Volume Limit Exceeded");
                this.volumeLevel=7;
            }
            else this.volumeLevel=newVolume;
        }
    }
    
    void channelUp()
    {
        if(this.on==false) 
        {
            System.out.println("You cannot Increase Channel when Tv is off");
        }
        else this.channel+=1;
    }
    
    void channelDown()
    {
        if(this.on==false) 
        {
            System.out.println("You cannot Decrease Channel when Tv is off");
        else this.channel-=1;
    }
    
    void volumeUp()
    {
        setVolume(this.volumeLevel+1);
    }
    
    void volumeDown()
    {
        setVolume(volumeLevel-=1);
    } 
    
    void getStatus()
    {
        System.out.println("Tv is : "+this.on);
        System.out.println("Channel is : "+this.channel);
        System.out.println("Volume is : "+this.volumeLevel);
    }  
};

class TestTv
{
    public static void main(String args[])
    {
        Tv t1=new Tv();
        System.out.println(t1.on);
        
        t1.turnOn();
        System.out.println(t1.on);
        
        t1.setChannel(45);
        System.out.println(t1.channel);
        
        t1.setVolume(8);
        System.out.println(t1.volumeLevel);
        
        
    }
};
