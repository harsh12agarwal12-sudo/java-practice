import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.print("Enter number of match in series : ");
        int number = sc.nextInt();
        sc.nextLine();
        int i = number;
        int iwin = 0;
        int rwin = 0;
        for (i=number;i>0;i--){
            System.out.print("Choices \n1.Rock \n2.Paper \n3.Scissor \nEnter your choice : ");
            String choice = sc.nextLine();
            int rnumber = ra.nextInt(0,3);
            if (choice.equalsIgnoreCase("Rock")){
                if (rnumber==0){
                    System.out.println("It's an tie");
                }
                else if (rnumber==2){
                    System.out.println("You win");
                    iwin = iwin + 1;
                }
                else if (rnumber==1){
                    System.out.println("Robot win");
                    rwin = rwin + 1;
                }}
            else if (choice.equalsIgnoreCase("Paper")){
                if (rnumber==2){
                    System.out.println("Robot win");
                    rwin = rwin + 1;
                }
                else if (rnumber==1){
                    System.out.println("It's an tie");
                }
                else if (rnumber==0){
                    System.out.println("You win");
                    iwin = iwin + 1;
                }
            }
            else if (choice.equalsIgnoreCase("Scissor")){
                if (rnumber==1){
                    System.out.println("You win");
                    iwin = iwin + 1;
                }
                else if (rnumber==0){
                    System.out.println("Robot win");
                    rwin = rwin + 1;
                }
                else if (rnumber==2){
                    System.out.println("It's an tie");
                }
            }
            else{
                System.out.println("Write some thing from the options");
                break;
            }
            System.out.println("Matches you win : "+iwin+"\nMatches robot win : "+rwin);
        }
        if (iwin>rwin){
            System.out.println("You win series");
        }
        else if (iwin<rwin){
            System.out.println("Robot win series");
        }
        else{
            System.out.println("It's an tie of series");
        }
    }
}