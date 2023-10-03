import java.util.*;

class Circle
{
    int radius;
    double PI=3.14;
    
    Circle(int radius)
    {
        this.radius=radius;
    }
    
    double getArea()
    {
        return this.PI*this.radius*this.radius;
    }
    
    double getPerimeter()
    {
        return 2*this.PI*this.radius;
    }
};

class TestCircle
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        
        /*
        Circle c1=new Circle(5);
        System.out.println("Area of the Circle With Radius=5: "+c1.getArea());
        System.out.println("Perimeter of the Circle Radius=5: "+c1.getPerimeter());
        
        Circle c2=new Circle(10);
        System.out.println("Area of the Circle Radius=10: "+c2.getArea());
        System.out.println("Perimeter of the Circle Radius=10: "+c2.getPerimeter());
        
        Circle c3=new Circle(15);
        System.out.println("Area of the Circle Radius=15: "+c3.getArea());
        System.out.println("Perimeter of the Circle Radius=15: "+c3.getPerimeter()); */
    }
};
