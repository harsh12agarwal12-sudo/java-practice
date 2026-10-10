import java.util.Scanner;
class employe{
    float salary;
    String name;
    public float getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String iname){
        name = iname;
    }
    public void setsalary(float isalary){
        salary = isalary;
    }
}
public class employee {
    public static void main(String[] args){
        employe em = new employe();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String iname = sc.nextLine();
        em.setname(iname);
        System.out.print("Enter salary : ");
        float isalary = sc.nextFloat();
        em.setsalary(isalary);
        System.out.println("Name is : "+em.getname());
        System.out.print("Salary is : "+em.getsalary());
    }
}