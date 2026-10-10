import java.util.Scanner;
public class arrayinreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many subject marks you want to input : ");
        int number = sc.nextInt();
        float [] marks = new float[number];
        for (int i=0; i<number; i++){
            System.out.print("Enter marks of subject number "+(i+1)+" : ");
            float mark = sc.nextFloat();
            marks [i] = mark;
        }
        for (int j=number; j>0; j--){
            System.out.println("Marks of subject number "+j+" : "+marks[j-1]);
        }
    }
}