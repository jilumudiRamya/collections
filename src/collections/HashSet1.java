package collections;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of matches:");
		int n = sc.nextInt();
		
		HashSet h = new HashSet();
		h.add("virat kohil");
		h.add("Ms dhoni");
		h.add("rohit sharma");
		h.add("virat kohil");
		h.add("gautam gambir");
		System.out.println(h);
		
		System.out.println(h.size());
		
		
		
		
		

	}

}
