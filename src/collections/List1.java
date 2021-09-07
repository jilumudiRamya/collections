package collections;
import java.util.*;
public class List1 {
public static void main(String[] args) {
List<Integer> list =  Arrays.asList(200,210,180,176,192);
int sum=0;
for(int i:list) {
	sum = sum+ i;
	}
System.out.println("sum "+ sum);
System.out.println("average "+ (float)sum/list.size());
		}

	
	
	
	}


		
		
	



