package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bowlers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers of bowlers:");
		int n = sc.nextInt();
		ArrayList a = new ArrayList();
		a.add("Brett lee");
		a.add("Muttiah muralitharan");
		a.add("Glenn mc grath");
		a.add("Dalesteyn");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		
	}

}
