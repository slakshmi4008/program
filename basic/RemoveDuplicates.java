package basic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(5);
		primes.add(2);
		Set<Integer> set = new LinkedHashSet(primes);
		primes.clear();
		primes.addAll(set);
		System.out.println(primes);
	}
}
