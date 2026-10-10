import java.util.Scanner;
public class passorfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum marks you can get in 1st exam : ");
        float tmarka = sc.nextFloat();
        System.out.print("Enter marks you can get in 1st exam : ");
        float marka = sc.nextFloat();
        System.out.print("Enter maximum marks you can get in 2nd exam : ");
        float tmarkb = sc.nextFloat();
        System.out.print("Enter marks you can get in 1st exam : ");
        float markb = sc.nextFloat();
        System.out.print("Enter maximum marks you can get in 3rd exam : ");
        float tmarkc = sc.nextFloat();
        System.out.print("Enter marks you can get in 1st exam : ");
        float markc = sc.nextFloat();
        float percentagea = marka*100/tmarka;
        float percentageb = markb*100/tmarkb;
        float percentagec = markc*100/tmarkc;
        float tpercentage = (marka+markb+markc)*100/(tmarka+tmarkb+tmarkc);
        if (percentagea>=33 && percentageb>=33 && percentagec>=33 && tpercentage>=40){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}