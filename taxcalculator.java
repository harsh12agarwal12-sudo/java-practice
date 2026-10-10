import java.util.Scanner;
public class taxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        float income = sc.nextFloat();
        int tax = 0;
        if (income<=250000){
            System.out.print("No tax");
        }
        else if (income>250000 && income<=500000){
            System.out.print("Tax amount : "+5*(income-250000)/100);
        }
        else if (income>500000 && income<=1000000){
            System.out.print("Tax amount : "+((5*250000/100)+(20*(income-500000)/100)));
        }
        else {
            System.out.print("Tax amount : "+((5*250000/100)+(20*500000/100)+(30*(income-1000000)/100)));
        }
    }
}