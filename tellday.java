import java.util.Scanner;
public class tellday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of day : ");
        float number = sc.nextFloat();
        float rnumber = number%7;
        if (rnumber==0){
            System.out.print("Day is Sunday");
        }
        else if (rnumber==1){
            System.out.print("Day is Monday");
        }
        else if (rnumber==2){
            System.out.print("Day is Tuesday");
        }
        else if (rnumber==3){
            System.out.print("Day is Wednesday");
        }
        else if (rnumber==4){
            System.out.print("Day is Thrusday");
        }
        else if (rnumber==5){
            System.out.print("Day is Friday");
        }
        else if (rnumber==6){
            System.out.print("Day is Saturday");
        }
        else {
            System.out.print("Invalid input");
        }
    }
}