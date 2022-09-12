import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args){
        fizzBuzz();
    }
    static void fizzBuzz(){
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int n;
        int r;

        while (true){
            n = in.nextInt();
            r = rand.nextInt(101);
            if (r % 3 == 0){
                System.out.print("Fizz");
            }
            if (r % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.print("\n" + r + "\n");
        }
    }
}
