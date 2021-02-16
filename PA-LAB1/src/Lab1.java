
public class Lab1 {

	static int sumaCif(int nr) {
		int sum = 0;
		while (nr != 0) {
			sum = sum + nr % 10;
			nr = nr / 10;
		}
		return sum;
	}

	static int sumaFin(int nr) {

		while (sumaCif(nr) >= 10) {
			nr = sumaCif(nr);
		}
		return nr = sumaCif(nr);
	}

	static int addition(int nr1, int nr2) {
		return nr1 + nr2;
	}

	static int mutiply(int nr1, int nr2) {
		return nr1 * nr2;
	}

	public static void main(String args[]) {
		System.out.println("Hello World!");
		String[] languages = { "C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java" };

		int n = (int) (Math.random() * 1_000_000);
		n = mutiply(n, 3);
		n = addition(n, Integer.parseInt("10101", 2));
		n = addition(n, Integer.parseInt("FF", 16));
		n = mutiply(n, 6);
		System.out.println(n);
		System.out.println(sumaCif(n));
		System.out.println(sumaFin(n));

		System.out.println("Willy-nilly, this semester I will learn" + " " + languages[sumaFin(n)]);
	}
}
