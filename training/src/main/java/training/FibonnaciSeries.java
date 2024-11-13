package training;

public class FibonnaciSeries {
	public static void main(String[] args) {
		int n1,n2,n3,count;
		n1=0;
		n2=1;
		count=10;
		System.out.print(n1+"" +n2);//just printing the n1 and n2 value
		for (int i = 2; i<count;++i) {///y here i =2 means here already we printed 0 and 1 so i start wit 2
			n3 = n1 + n2;
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
		}
		
		
		
	}

}
