import java.util.Scanner;
public class maxnumberinarray {
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
        float maximum = number[0];
        for (float element:number){
            if (element>maximum){
                maximum = element;
            }
        }
        System.out.print("Maximum number in array is : "+maximum);
    }
}