package collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class SetRevenueMangeer {

	public static void main(String[] args) {
		String category,option;
		int amount,total=0;
		Scanner sc = new Scanner(System.in);
		TreeSet<Revenue> t = new TreeSet<Revenue>(new MyComparator());
				do {
					System.out.println("enter revenue category");
					category = sc.nextLine();
					sc.nextLine();
					System.out.println("enter revenue amount");
					amount=sc.nextInt();
					sc.nextLine();
					t.add(new Revenue(category,amount));
					System.out.println("Do you want to continue?(y/n)");
					option = sc.next();
				}
				while(option.equals("y"));
				System.out.println(t);
				
				
		System.out.println(String.format("%-15s%-15s","category","amount"));
		for(Revenue e:t) {
			total=total+e.getAmount();
			System.out.println(String.format("%-15s%-15s",e.getRevenueCategory(),e.getAmount()));
		}
		System.out.println(total);
			
	}
}
		 class MyComparator implements Comparator<Revenue>{
			 public int compare(Revenue o1,Revenue o2) {
				 if(o1.getAmount()<o2.getAmount())
					 return 1;
				 else
					 return -1;
				 
				 
				 
				 
			 }
		 }
		
		
		
		
		
		
		
		
	
