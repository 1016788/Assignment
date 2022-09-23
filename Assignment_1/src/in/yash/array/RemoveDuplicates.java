package in.yash.array;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		int []ar= {1,2,3,3,2,4,5,6};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<ar.length;i++) {
			set.add(ar[i]);
		}
		for (Integer integer : set) {
			System.out.println(integer);
			
		}
	}

}
