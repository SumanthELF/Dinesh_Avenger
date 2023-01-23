package basics;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		int ocount = 0;
		int ecount = 0;
		for (int c = 0; c < a.length; c++) {
			if (a[c] % 2 == 0) {
				ecount++;
				a1.add(a[c]);
			} else {
				ocount++;
				a2.add(a[c]);
			}
		}
		System.out.println(ecount+" "+a1);
		System.out.println(ocount+" "+a2);
	}
}