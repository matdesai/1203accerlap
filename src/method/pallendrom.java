package method;

public class pallendrom {
	
	public static void main(String[] args) {
		
		String name="ICICI";
		
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			rev= rev+name.charAt(i);
			
		}
		System.out.println(rev);
//		
//		if(name.equals(rev)) {
//			
//			System.out.println("given String is Pallendrom");
//		}
//		else {
//			
//			System.out.println("given String don't pallendram");
		}
	}


