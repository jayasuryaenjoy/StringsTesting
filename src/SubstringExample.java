
public class SubstringExample {

	public static void main(String[] args) {
		   String mainString = "PQMSP";
	        String subString = "pqm";

	        
	        int index = mainString.toString().toLowerCase().indexOf("pqmsp".toLowerCase());

	        if (index != -1) {
	            System.out.println("The substring is present ");
	        } else {
	            System.out.println("The substring is not present");
	        }

	}

}
