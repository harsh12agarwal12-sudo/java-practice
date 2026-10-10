import java.util.Scanner;
public class tellurl {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter URL : ");
        String url = sc.nextLine();
        if (url.endsWith(".com")){
            System.out.print("URL indigates Commertial website");
        }
        else if (url.endsWith(".org")){
            System.out.print("URL indigates Organization website");
        }
        else if (url.endsWith(".in")){
            System.out.print("URL indigates Indian website");
        }
        else{
            System.out.print("Unknown URL");
        }
    }
}