import java.util.Scanner;
public class addmatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in matrices : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of colums in matrices : ");
        int columns = sc.nextInt();
        float [][] matrice1 = new float[rows][columns];
        float [][] matrice2 = new float[rows][columns];
        float [][] sum = new float[rows][columns];
        int i,j,k,m,n,o=0;
        for (i=0; i<rows; i++){
            for (j=0; j<columns; j++){
                System.out.print("Enter value in matrices 1 on position "+(i+1)+","+(j+1)+" : ");
                float number = sc.nextFloat();
                matrice1[i][j] = number;
            }
        }
        for (k=0; k<rows; k++){
            for (m=0; m<columns; m++){
                System.out.print("Enter value in matrices 2 on position "+(k+1)+","+(m+1)+" : ");
                float number = sc.nextFloat();
                matrice2[k][m] = number;
            }
        }
        System.out.println("Sum of these 2 matrices is : ");
        for (n=0; n<rows; n++){
            for (o=0; o<columns; o++){
                System.out.print(matrice1[n][o] + matrice2[n][o]+"  "); 
            }
            System.out.print("\n");
        }
    }
}