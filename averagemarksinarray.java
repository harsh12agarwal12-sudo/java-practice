import java.util.Scanner;
public class averagemarksinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many student marks you want to input : ");
        int students = sc.nextInt();
        float sum = 0;
        float [] marks = new float[students];
        for (int i=0; i<students; i++){
            System.out.print("Enter marks of student "+(i+1)+" : ");
            float mark = sc.nextFloat();
            marks[i] = mark;
            sum += mark;
        }
        System.out.print("average : "+(sum/students));
    }
}