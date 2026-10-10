import java.util.Scanner;
class square{
    float side ;
    float area;
    float perimeter;
    public void setside(float iside){
        side = iside;
    }
    public float area(){
        area = side*side;
        return area;
    }
    public float perimeter(){
        perimeter = side*4;
        return perimeter;
    }
}
public class squareareaperameter {
    public static void main(String[] args) {
        square sq = new square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square : ");
        float iside = sc.nextFloat();
        sq.setside(iside);
        System.out.println("Area of square is : "+sq.area());
        System.out.print("Perimeter of square is : "+sq.perimeter());
    }
}