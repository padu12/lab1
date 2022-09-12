import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        check();

    }

    static boolean check(){
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

        boolean j = true;
        for (int i = 0; i < userCount-1; i++){
            if (a[i]<a[i+1]){
                System.out.print("FALSE");
                j = false;
                break;
            }
        }

        if (j == true) {System.out.print("TRUE");}
        return true;
    }
}