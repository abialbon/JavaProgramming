public class Hanoi {
    // The move function simple gives instruction to move from postition to the to position
    public static void move(char from, char to) {
        System.out.println("Move disc from " + from + " to " + to);
    }

    // Move the (n-1) discs to via using to as the helper
    // Move the nth disc from to
    // Move back the (n-1) discs from the via to the to position
    public static void hanoi(int n, char from, char to, char via) {
        if (n==0) return;
        else {
            hanoi(n-1, from, via, to);
            move(from, to);
            hanoi(n-1, via, to, from);
        }
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        hanoi(N, 'A', 'C', 'B');
    }
}