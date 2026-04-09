import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int A = kb.nextInt();
        int B = kb.nextInt();
        double C = (double)A/B;
        System.out.println(C);
    }
}