public class Main {

    public static void main(String[] args) {

	int a = 121;
	if (a % 2 == 0) System.out.println("a is even");
	else System.out.println("a is odd");

	System.out.println(2 == 3 | true);

	for (int i = 1; i <= 5; i++) {
		System.out.println(i);
	}

	int j = 1;
	int k = 7;
	while (j <= 5) {
		System.out.print(k);
		System.out.print(" * ");
		System.out.print(j);
		System.out.print(" = ");
		System.out.println(j * k);
		j++;
	}

	do {
		System.out.println("This loop will run once");
	} while(false);

	int[] values = {2, 5, 6, 7, 20};
	for (int i = 0; i < values.length; i++){
		System.out.println(values[i]);
	}

	float sum = 0.0f;
	for (float v: values) {
		sum += v;
	}
	System.out.print("The sum of all the values is: ");
	System.out.println(sum);

    }
}
