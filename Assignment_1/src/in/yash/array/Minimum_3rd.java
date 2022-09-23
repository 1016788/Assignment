package in.yash.array;

public class Minimum_3rd {
	public static void main(String[] args) {
		
		int []ar= {1,2,3,4,5,6,7};
		int k=3;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(k+" th smalest number is "+ar[i]);
			}
		}
		
	}

}
