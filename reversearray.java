import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want to input in array : ");
        int tnumber = sc.nextInt();
        float [] number = new float[tnumber];
        float [] reverse = new float[tnumber];
        for (int i=0; i<tnumber; i++){
            System.out.print("Enter value of number "+(i+1)+" : ");
            float value = sc.nextFloat();
            number[i] = value;
        }
        for (int j=0; j<tnumber; j++){
            reverse[j]=number[number.length-1-j];
        }
        System.out.println("Array in reverse : ");
        for (int k=0; k<tnumber; k++){
            number[k]=reverse[k];
            System.out.println(number[k]);
        }
    }
}