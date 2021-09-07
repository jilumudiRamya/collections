package collections;
import java.util.ArrayList;
import java.util.Collections;

public class List5 {

	public static void main(String[] args) {
		ArrayList a =new ArrayList();
		a.add("Sunrisers hyderabad");
		a.add("Gujarat lions");
		a.add("Royalchallengers Bangalore");
		a.add("Kolkata knight riders");
		a.add("Mumbai Indians");
		System.out.println(a);
		//swapping first,second arguments  are index
		Collections.swap(a, 1, 3);
		System.out.println(a);
		
		
	}

}
