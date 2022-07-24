import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().checkInclusion("hello", "ooolleoooljleh"));
	}

	Map<Character, Integer> a1 = new HashMap<>();
	Map<Character, Queue<Integer>> z2 = new HashMap<>();
	String s2;

	public boolean checkInclusion(String s1, String s2) {
		int z = s2.length();

		this.s2 = s2;

		int sizeA = s1.length();
		int sizeB = 0;

		for (char c : s1.toCharArray()) {
			a1.put(c, a1.containsKey(c) ? a1.get(c) + 1 : 1);
		}

		boolean found = false;

		int begin = 0;

		for (int i = 0; i < z && !found; i++) {
			char b = s2.charAt(i);

			if (!a1.containsKey(b)) {
				begin = i + 1;
				z2.clear();
				sizeB = 0;
			} else if (z2.containsKey(b)) {

				Queue<Integer> q = z2.get(b);

				int val = z2.get(b).size() + 1;

				if (val > a1.get(b)) {
					int prev = q.peek();

					remove(begin, prev);

					begin = prev + 1;

					q = z2.get(b);

					q.add(i);

					z2.put(b, q);

				} else {
					q.add(i);
					z2.put(b, q);
				}

			} else {
				Queue<Integer> q = new LinkedList<>();
				q.add(i);

				z2.put(b, q);
			}

			sizeB = i - begin + 1;

			if (sizeB == sizeA)
				found = true;
		}

		return found;
	}

	private void remove(int begin, int endInclusive) {
		while (begin <= endInclusive) {
			z2.get(s2.charAt(begin)).remove();
			begin++;
		}
	}

}
