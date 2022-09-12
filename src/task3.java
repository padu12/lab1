import java.util.Scanner;
import java.lang.Math;



public class task3 {
    public static void main(String[] args){
        meth();
    }
    static void meth(){
        int userCount;
        int[] a;
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Enter the length of the array (>=2): ");
            userCount = in.nextInt();
        }while(userCount<2);// the cycle ask user for the length of the array until he writes the correct number

        a = new int[userCount];

        for (int i = 0; i < userCount; i++){ //user input numbers in the array
            System.out.print("Enter the number: ");
            a[i] = in.nextInt();
        }

//        System.out.print("a[] = {");
//        for (int i = 0; i < userCount; i++){
//            System.out.print(a[i] + ", ");
//        }
//        System.out.print("\b\b}");

        float aLength = (float)a.length/2;
        int firstPart = (int)Math.ceil(aLength);
        int secondPart = (int)Math.floor(aLength);
        //defining the length of the first part of the array and the second one

        int sum1 = 0;
        for (int i = 0; i < firstPart; i++){ // the cycle summarize the first part
            sum1 += a[i];
        }
        int sum2 = 0;
        for (int i = firstPart; i < firstPart+secondPart; i++){ // summarizing the second part
            sum2 += a[i];
        }

        boolean firstResult = false;
        if (sum1 == sum2){firstResult = true;} // defining is it true that both amounts are equal

        int sum3 = 0, sum4 = 0;
        for (int i = 0; i < secondPart; i++){ // summarizing the first part but with one more
            sum3 += a[i];
        }
        for (int i = secondPart; i < firstPart + secondPart; i++){
            sum4 += a[i];
        }//summarizing the second part but without one element which is already located in the first part

        boolean secondResult = false;
        if (sum3 == sum4){secondResult = true;} // defining is it true that both new amount are equal

        if (firstResult || secondResult){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
        // defining is it true that at least the one of results is true
    }
}
