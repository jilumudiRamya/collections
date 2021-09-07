package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class List2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList a = new ArrayList();
		a.add(101);
		a.add(78);
		a.add(90);
		a.add(59);
		a.add(77);
		a.add(67);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		
		

	}

}
