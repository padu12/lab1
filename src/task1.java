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
        }while(userCount<2); // the cycle ask user for the length of the array until he writes the correct number

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

        boolean j = true;
        for (int i = 0; i < userCount-1; i++){ // the for type cycle checks is it true that each element of the array is bigger or equal than the previous one
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