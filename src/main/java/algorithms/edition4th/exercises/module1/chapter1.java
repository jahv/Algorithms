package algorithms.edition4th.exercises.module1;

public class chapter1 {

	public static void main(String[] args) {
		//1.1.1
		System.out.println("____");
		System.out.println((0+15)/2); //7
		System.out.println(2.0e-6 * 100000000.1); //200.0000002
		System.out.println(true && false || true && true); //true
		
		//1.1.2
		System.out.println("____");
		System.out.println((1 + 2.236)/2); //1.618
		System.out.println(1 + 2 + 3 + 4.0); //10.0
		System.out.println(4.1 >= 4); //true
		System.out.println(1 + 2 + "3"); //33
		
		//1.1.3
		System.out.println("____");
		int a, b, c;
		a = 2; b = 2; c = 2;
		if(a == b && a == c && b == c) {
			System.out.println("Iguales");
		} else {
			System.out.println("Diferentes");
		}
		
		//1.1.4
		System.out.println("____");
		//if (a > b) then c = 0; //"then" does not exist
		//if a > b { c = 0; } //missing ( )
		if (a > b) c = 0;
		//if (a > b) c = 0 else b = 0; //missing ; before else
		
		//1.1.5
		System.out.println("____");
		double d, e;
		d = 0; e = 1;
		System.out.println((d >= 0 && d <= 1) && (e >= 0 && e <= 1));
		
		//1.1.6
		System.out.println("____");
		int f = 0; int g = 1; 
		for (int i = 0; i <= 15; i++) {
			System.out.print(f + ", "); //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
			f = f + g;
			g = f - g; 
		}
		
		// 1.1.7
		System.out.println("\n____");
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001)
			t = (9.0 / t + t) / 2.0;
		System.out.printf("%.5f\n", t);
		
		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			for(int j = 0; j < i; j++) {
				sum++;
			}
		}
		System.out.println(sum); // Sumatoria de 999
		
		// 1.1.8
		System.out.println("____");
		System.out.println('b'); //b
		System.out.println('b' + 'c'); //197
		System.out.println((char) ('a' + 4)); //e
		
		// 1.1.9
		String s = "";
		for(int n = 9; n > 0; n /= 2) {
			s = (n % 2) + s;
		}
		System.out.println(s);
		
		// 1.1.10
		
		// 1.1.11
		System.out.println("____");
		boolean [][]matrix = new boolean[][]{{true, false, true},{true, true, false},{false, false, false}};
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]: " + (matrix[i][j] ? "*" : "#") + ", ");
			}
		}
		System.out.println();
		
		// 1.1.12
		System.out.println("____");
		int []a12 = new int[10];
		for(int i = 0; i < 10; i++) {
			a12[i] = 9 - i;
		}
		for(int i = 0; i < 10; i++) {
			a12[i] = a12[a12[i]];
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// 1.1.13
		System.out.println("____");
		int[][] m13 = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int n = m13.length;
		int m = m13[0].length;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(m13[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpuesta");
		for(int j = 0; j < m; j++) {
			for(int i = 0; i < n; i++) {
				System.out.print(m13[i][j] + " ");
			}
			System.out.println();
		}
		
		// 1.1.16
		System.out.println("____");
		System.out.println(exR1(6));
		
		// 1.1.18
		System.out.println("____");
		System.out.println(mystery(2, 25));
		System.out.println(mystery(3, 11));
		System.out.println(mysteryStar(2, 25));
		System.out.println(mysteryStar(3, 11));
		
	}
	
	public static String exR1(int n) {
		if(n <= 0) {
			return "-";
		} else {
			return exR1(n-3) + n + exR1(n-2) + n;
		}
	}
	
	public static int mystery(int a, int b) {
		if(b == 0) return 0;
		if(b % 2 == 0) return mystery(a + a, b / 2);
		return mystery(a + a, b / 2) + a;
	}
	
	public static int mysteryStar(int a, int b) {
		if(b == 0) return 1;
		if(b % 2 == 0) return mysteryStar(a + a, b / 2);
		return mysteryStar(a + a, b / 2) * a;
	}
}
