package model.mechanics;

/* package codechef; // don't place package name! */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastReaderA {

	BufferedReader br = null;

	StringTokenizer str = null;

	protected FastReaderA() {
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
}

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here

		FastReaderA sc = new FastReaderA();

		long t = sc.nextLong();

		while (t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			long diff = Math.abs(a - b);

			long ans = 0;

			for (int x = 1; x <= Math.sqrt(diff); x++) {
				if (diff % x == 0) {
					if (diff / x == x) {
						ans += 1;
					} else {
						ans += 2;
					}
				}
			}

			System.out.println(ans);
		}
	}
}
