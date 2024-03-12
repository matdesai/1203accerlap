package method;

public class p {
	
	public static void main(String[] args) {
		

	int star=1;
	int space=10;
	int count=1;
	
	for(int i=1; i<=7; i++) {
		
		
		for(int j=1; j<=space; j++) {
			
			System.out.print(" ");
		}
		
		for(int j=1; j<=star; j++) {
			
			System.out.print(count+++" ");
		}
		System.out.println();
		star=star+1;
		space--;
		

	}

		}
		
	}
