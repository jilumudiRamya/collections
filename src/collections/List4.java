package collections;
import java.util.ArrayList;

public class List4 {

	public static void main(String[] args) {
		
		System.out.println("Ënter the top 5 scores of IPL season8\n");
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		a1.add("David Warner");
		a1.add("AM Rahane");
		a1.add("LMPSimmons");
		a1.add("ÄB devilliers");
		a1.add("ViratKohil");
		System.out.println(a1);
		
		System.out.println("Ënter the top 5 scores of IPL season9\n");
		a2.add("David Warner");
		a2.add("Shikhar Dhawan");
		a2.add("Gautam Gambhir");
		a2.add("ÄB devilliers");
		a2.add("ViratKohil");
		System.out.println(a2);
		// finding common elements
		a1.retainAll(a2);
		System.out.println(a1);
		
		

	}

}
