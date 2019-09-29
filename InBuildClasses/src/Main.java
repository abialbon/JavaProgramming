import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Main {

    public static void main(String[] args) {
	    // String comparision
        String firstName = "Abi";
        String newName = new String("Abi");
        String name = "Abi";

        System.out.println(firstName == name);
        // True because strings are created with string literals
        System.out.println(firstName == newName);
        // False because newString is created with new keyword
        // Now firstName and newName point to different references in memory
        // The == checks if the references are safe. They do not check the string literals themselves.
        System.out.println(firstName.equals(newName));

        // Output is zero is equal, negative if the first string is lesser
        // positive if the first string is greater
        System.out.println(firstName.compareTo("Abe"));

        // Case-insensitive comparisons
        System.out.println(firstName.equalsIgnoreCase(name));
        System.out.println(firstName.compareToIgnoreCase(name));

        double a = 10, b = 6;
        System.out.printf("%.3f", a/b);


        double number = 1.6666666667;
        DecimalFormat formatter = new DecimalFormat("##0.00");
        JOptionPane.showMessageDialog(null, formatter.format(number));

        System.exit(0);
    }
}
