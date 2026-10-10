import java.util.Scanner;
public class sortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to input in array : ");
        int tnumber = sc.nextInt();
        float [] number = new float[tnumber];
        int i,j = 0;
        boolean issorted = true;
        for (i=0; i<tnumber; i++){
            System.out.print("Enter value of number "+(i+1)+" : ");
            float value = sc.nextFloat();
            number[i] = value;
        }
        for (j=0; j<(number.length-1); j++){
            if (number[j]>number[j+1]){
                issorted = false;
                break;
            }
        }
        if (issorted){
            System.out.print("Array is sorted");
        }
        else{
            System.out.print("Array is not sorted");
        }
    }
}