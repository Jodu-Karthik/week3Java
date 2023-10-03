import java.util.*;

class Order
{
    int id,quantity;
    double price,sum=0;
    String name;
    
    Order(int id,int quantity,double price,String name)
    {
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    
    void display()
    {
        System.out.println("Employee id: "+this.id);
        System.out.println("Employee name: "+this.name);
        System.out.println("Employee price: "+this.price);
        System.out.println("Employee Quantity: "+this.quantity);
    }
    
    int calculatePrice(int id,int quantity)
    {
        switch(id)
        {
            case 1:
                this.sum=quantity*99.90; 
            case 2:
                this.sum=quantity*20.20; 
            case 3:
                this.sum=quantity*6.87.90;
            case 4:
                this.sum=quantity*45.50; 
        }
    }
    
    public static void main(String args[])
    {
        ArrayList<Order> ord=new Arraylist<>();     
        for(int i=0;i<4;i++)
        {
        System.out.println("Enter Id,Name,Price,Quantity  of the Product: "+(i+1));
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            double price=sc.nextDouble();
            sc.nextLine();
            int quantity=sc.nextInt();
            sc.nextLine();
            
            ord.add(new (Order(id,name,price,quantity));
        }
        System.out.println();
        
        System.out.print("Enter the product Id: ");
        int proId=sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter the Quantity of the Product ");
        int proQuantity=sc.nextInt();
        sc.nextLine();
        
        int flag=0;
        
        for(Order o:ord)
        {
            if(o.id==proId)
            {
                flag=1;
                o.display();
                break;
            }
        }   
        if(flag==0) System.out.println("Id not Found");
    }
}
























