import java.util.Scanner;

class decimalToBinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long decimal = 0, p = 0;
		while (n > 0) {
			int bit = n & 1;
			decimal = (long) (bit * Math.pow(10, p) + decimal);
			n >>= 1;
			p += 1;
		}
		System.out.print(decimal);
	}
}
