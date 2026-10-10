import java.util.Scanner;
class rectangle{
    float length;
    float breadth;
    float area;
    float perimeter;
    public void setlength(float ilength){
        length = ilength;
    }
    public void setbreadth(float ibreadth){
        breadth = ibreadth;
    }
    public float area(){
        area = length*breadth;
        return area;
    }
    public float perimeter(){
        perimeter = 2*(length+breadth);
        return perimeter;
    }
} 
public class rectangleareaperimeter {
    public static void main(String[] args) {
        rectangle re = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        float ilength = sc.nextFloat();
        re.setlength(ilength);
        System.out.print("Enter breadth of rectangle : ");
        float ibreadth = sc.nextFloat();
        re.setbreadth(ibreadth);
        System.out.println("Area of rectangle is : "+re.area());
        System.out.print("Perimeter of rectangle is : "+re.perimeter());
    }
}