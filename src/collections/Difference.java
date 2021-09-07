package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of best bowlers in season4");
		int n1 = sc.nextInt();
		System.out.println("Enter the name of players:");
		ArrayList a1=new ArrayList();
		a1.add("zaheerkhan");
		a1.add("AnilKumble");
		a1.add("Bhuvaneshwar kumar");
		a1.add("Ravichandran Ashwin");
		System.out.println(a1);
		
		System.out.println("Enter the number of best bowlers in season5");
		int n2 = sc.nextInt();
		System.out.println("Enter the name of players:");
		
		ArrayList a2=new ArrayList();
		a2.add("Ravichandran Ashwin");
		a2.add("Kapil Dev");
		a2.add("Mohit Sharma");
		System.out.println(a2);
		System.out.println("playerset1:");
		System.out.println(a1);
		System.out.println("playerset2:");
		System.out.println(a2);
		a1.removeAll(a2);
		System.out.println(a1);
		
		
		
		
		
	}

}
