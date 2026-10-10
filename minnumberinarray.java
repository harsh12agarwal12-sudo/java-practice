import java.util.Scanner;
public class minnumberinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to input in array : ");
        int tnumber = sc.nextInt();
        float [] number = new float[tnumber];
        for (int i=0; i<tnumber; i++){
            System.out.print("Enter value of number "+(i+1)+" : ");
            float value = sc.nextFloat();
            number[i] = value;
        }
        float minimum = number[0];
        for (float element:number){
            if (element<minimum){
                minimum = element;
            }
        }
        System.out.print("Minimum value in array is : "+minimum);
    }
}