public class averageofnumbers {
    static float average(float ... arr){
        float sum = 0;
        float percentage = 0;
        for (float element : arr){
            sum += element;
        }
        percentage = sum/5f;
        return percentage;
    }
    public static void main(String[] args) {
        System.out.print("average is : "+average(10,20,30,40,50));
    }
}