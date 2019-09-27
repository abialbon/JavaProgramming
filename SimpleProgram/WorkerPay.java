import java.util.Scanner;

public class WorkerPay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many hours did you work?");
        double hrs = scan.nextDouble();
        System.out.println("How much do you get paid per hour?");
        double pay = scan.nextDouble();
        System.out.println("Your pay is: $"+ hrs*pay);
        scan.close();
    }
}