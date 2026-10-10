import java.util.Scanner;
class circle{
    float radius;
    float area;
    float perimeter;
    public void setradius(float iradius){
        radius = iradius;
    }
    public float area(){
        area = (22/7f)*(radius*radius);
        return area;
    }
    public float perimeter(){
        perimeter = 2*(22/7f)*radius;
        return perimeter;
    }
}
public class circleareaperimeter {
    public static void main(String[] args) {
        circle ci = new circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        float iradius = sc.nextFloat();
        ci.setradius(iradius);
        System.out.println("Area of circle is : "+ci.area());
        System.out.print("Perimeter of circle is : "+ci.perimeter());
    }
}