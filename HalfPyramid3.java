public class HalfPyramid3 {
    public static void main(String[] args) {
        //outer loop
        for(int i = 1; i <= 10; i++){
            //inner loop 1
            for(int j = 1; j <= 10 - i; j++){
                System.out.print(" ");
            }
            //inner loop 2
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
