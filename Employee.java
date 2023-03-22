import java.util.Scanner ;
public class Employee
{
    double net;
    String name;
    int eno, age;
    double basic;
//    Constructor 
    Employee(){
        name="";
        eno=0; age=0;
        basic=0.0; net=0.0;
    }
    Scanner sc=new Scanner(System.in);
    void accept(){
        System.out.print("Enter name=");
        name=sc.nextLine();

        System.out.print("enter employee number=");
        eno=sc.nextInt();

        System.out.print("enter age=");
        age= sc.nextInt();

        System.out.print("enter salary=");
        basic=sc.nextDouble();
    }

//    Calculation Block
    void calculate(){
        double hra, da;
        hra= (18.5/100)*basic;
        da=(17.45/100)*basic;
        double pf=(8.10/100)*basic;
        net=(basic+hra+da)-pf;
        if(age>50){
            net=net+5000;
        }
    }
// Printing Values of Employee
    void print(){
        System.out.println("Employee number is ="+eno);
        System.out.println("Name of employee is ="+name);
        System.out.println("Age "+age);
        System.out.println("Basic Salary ="+basic);
        System.out.println("Net Value = "+net);
    }

    public static void main(String[] args) {

        Employee ac = new Employee();
        ac.accept();
        ac.calculate();
        ac.print();
    }
}