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


    }
}
