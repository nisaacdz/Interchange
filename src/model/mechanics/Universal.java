package model.mechanics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastReaderB {

	BufferedReader br = null;

	StringTokenizer str = null;

	protected FastReaderB() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		if (str == null || !str.hasMoreTokens()) {
			try {
				str = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return str.nextToken();
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	int nextInt() {
		return Integer.parseInt(next());
	}
}

public class Universal {

	public static void main(String[] args) {
		FastReaderB sc = new FastReaderB();

		int t = sc.nextInt();

		while (t-- > 0) {
			long x = sc.nextLong();
			long y = sc.nextLong();

			long a = Math.min(x, y);
			long z = Math.max(x, y);

			if (a == 0) {
				System.out.println(-1);

			} else if (a == z) {
				System.out.println(z);
			} else {
				double val = log2((double) z / a);

				long ans = 0;

				if ((int) Math.ceil(val) == (int) Math.floor(val)) {
					ans = ((long) val) + z;
				} else {
					ans = -1;
				}
				System.out.println(ans);
			}
		}
	}

	private static double log2(double val) {
		return Math.log(val) / Math.log(2);
	}

}