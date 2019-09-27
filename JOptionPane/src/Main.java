import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        String ageString;
        ageString = JOptionPane.showInputDialog(null, "What is your age?");
        int age = Integer.parseInt(ageString);
        JOptionPane.showMessageDialog(null, "Hello, " + age + " year old.");
        System.exit(0);
    }
}