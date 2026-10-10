import java.util.Scanner;
public class isinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to input in array : ");
        int tnumber = sc.nextInt();
        float [] number = new float[tnumber];
        boolean inarray = false;
        for (int i=0; i<tnumber; i++){
            System.out.print("Enter value of number "+(i+1)+" : ");
            float value = sc.nextFloat();
            number[i] = value;
        }
        System.out.print("Enter number you want to check in array : ");
        float fnumber = sc.nextFloat();
        for (float element:number){
            if (fnumber==element){
                inarray = true;
                break;
            }
        }
        if (inarray){
            System.out.print(fnumber+" is in this array");
        }
        else {
            System.out.print(fnumber+" is not in array");
        }
    }
}