import java.util.*;

class Employee
{
     String name,gender,role,address;
     int id,age;
     double salary;
    
/*    Employee()
    {
        this.id=0;
        this.name=null;
        this.age=0;
        this.gender=null;
        this.designation=null;
        this.salary=0;
        this.address=null;
    } */

    Employee(int id,String name,int age,String gender,String role,double salary,String address)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.role=role;
        this.salary=salary;
        this.address=address;
    }
    
    void display()
    {
        System.out.println("Employee id: "+this.id);
        System.out.println("Employee name: "+this.name);
        System.out.println("Employee age: "+this.age);
        System.out.println("Employee Gender: "+this.gender);
        System.out.println("Employee Designation: "+this.role);
        System.out.println("Employee Salary: "+this.salary);
        System.out.println("Employee Address: "+this.address);

    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee> emp=new ArrayList<>();
        
        System.out.print("Enter the No.of Employees: ");
        int n=sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter id,name,age,gender,role,salary(float),address of Person: "+(i+1));
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int age=sc.nextInt();
            sc.nextLine();
            String gender=sc.nextLine();
            String role=sc.nextLine();
            double salary=sc.nextFloat();
            sc.nextLine();
            String address=sc.nextLine();   
            
            emp.add(new Employee(id,name,age,gender,role,salary,address));         
        }
        System.out.println();
        
        /* for(Employee e:emp)
        {
            e.display();
            System.out.println();
        } */
        
        System.out.print("Enter id to display: ");
        int searchId=sc.nextInt();
        System.out.println();
        
        int flag=0;
        for(Employee e:emp)
        {
            if(e.id==searchId)
            {
                flag=1;
                e.display();
                break;
            }            
        }
        if(flag==0) System.out.println("Id not Found");
        

            
    }
};
























