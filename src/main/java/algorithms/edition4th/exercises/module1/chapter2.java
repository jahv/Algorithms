package algorithms.edition4th.exercises.module1;

import algorithms.edition4th.exercises.module1.utils.Point2D;

public class chapter2 {

	public static void main(String[] args) {
		// 1.2.1
		System.out.println("_____");
		Point2D p1 = new Point2D(1, 1);
		Point2D p2 = new Point2D(3, 3);
		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(p1));
		
		// 1.2.4
		System.out.println("_____");
		String s1 = "hello";
		String s2 = s1;
		s1 = "world";
		System.out.println(s1);
		System.out.println(s2);
		
		// 1.2.5
		System.out.println("_____");
		String s = "Hello World";
		s.toUpperCase();
		s.substring(6, 11);
		System.out.println(s);
		
		// 1.2.6
		System.out.println("_____");
		String base =   "actgacgttt";
		String verify = "tgacgtttac";
		System.out.println(circularRotation(verify, base) ? "Ciclic" : "Not ciclic");
		System.out.println(circularRotation(base, verify) ? "Ciclic" : "Not ciclic");
		
		// 1.2.7
		System.out.println("_____");
		System.out.println(mystery("abcdef"));
		
		
	}
	
	public static String mystery(String s) {
		int N = s.length();
		if(N<=1) return s;
		String a = s.substring(0, N/2);
		String b = s.substring(N/2, N);
		return mystery(b) + mystery(a);
	}
	
	public static boolean  circularRotation(final String base, final String verify) {
		String b = base+base;
		return (b.contains(verify));
//		boolean result = false;
//		
//		System.out.println(verify + " -> " + base);
//		
//		if(base.length() == verify.length()) {
//			int i = 0;
//			int j = base.indexOf(verify.charAt(0));
//			int counter = 0;
//			boolean breakk = false;
//			while(i < verify.length()) {
//				while(j < base.length() && i < verify.length()) {
//					System.out.print("\t" + verify.charAt(i) + " -> " + base.charAt(j));
//					if(verify.charAt(i) == base.charAt(j)) {
//						System.out.println(" Match!");
//						breakk = false;
//						counter++;
//						i++;
//						j++;
//						if(j == base.length()) {
//							j = 0;
//						}
//					} else {
//						System.out.println(" Wrong!");
//						counter = 0;
//						breakk = true;
//						j++;
//						break;
//					}
//				}
//				if(breakk) {
//					i=-1;
//					System.out.println("---");
//					System.out.println(verify + " -> " + base);
//				}
//				i++;
//			}
//			System.out.println(counter);
//			if(counter == verify.length()) {
//				result = true;
//			}
//		}
//		return result;
	}
}
