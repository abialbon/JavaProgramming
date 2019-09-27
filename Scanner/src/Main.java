import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        short sh = scan.nextShort();
        // The previous methods only read the token and keep the /n character in the buffer,
        // so the next nextLine() will be empty. We need to flush it.
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("Int: "+i);
        System.out.println("Double: "+d);
        System.out.println("Short: "+sh);
        System.out.println("String: "+s);
    }
}
