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
        }while(userCount<2);

        a = new int[userCount];

        for (int i = 0; i < userCount; i++){
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

        int sum1 = 0;
        for (int i = 0; i < firstPart; i++){
            sum1 += a[i];
        }
        int sum2 = 0;
        for (int i = firstPart; i < firstPart+secondPart; i++){
            sum2 += a[i];
        }

        boolean firstResult = false;
        if (sum1 == sum2){firstResult = true;}

        int sum3 = 0, sum4 = 0;
        for (int i = 0; i < secondPart; i++){
            sum3 += a[i];
        }
        for (int i = secondPart; i < firstPart + secondPart; i++){
            sum4 += a[i];
        }

        boolean secondResult = false;
        if (sum3 == sum4){secondResult = true;}

        if (firstResult || secondResult){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}
