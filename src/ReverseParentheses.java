import java.util.Arrays;
import java.util.Stack;

public class ReverseParentheses {

	public static void main(String[] args) {
		System.out.println(reverseParentheses("(jayasurya)"));     
        System.out.println(reverseParentheses("(u(love)i)"));    
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
        
        
        String input = "jayasurya";
        String result = convertToAlphabeticalOrder(input);
        System.out.println("Original string: " + input);
        System.out.println("Alphabetical order: " + result);
        String result1 = convertToReversAlphabeticalOrder(input);
        System.out.println("Original string: " + input);
        System.out.println("Alphabetical order: " + result1);
        
//        
//        Solution S=new Solution();
//        S.sortEvenOdd(new int[4,1,2,3])
	}
	  public static String reverseParentheses(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            if (c == ')') {
	                StringBuilder sb = new StringBuilder();
	                while (!stack.isEmpty() && stack.peek() != '(') {
	                    sb.append(stack.pop());
	                }
	                if (!stack.isEmpty() && stack.peek() == '(') {
	                    stack.pop(); // Pop '('
	                }
	                for (char reversedChar : sb.toString().toCharArray()) {
	                    stack.push(reversedChar);
	                }
	            } else {
	                stack.push(c);
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        while (!stack.isEmpty()) {
	            result.append(stack.pop());
	        }

	        return result.reverse().toString();
	    }
	  public static String convertToAlphabeticalOrder(String input) {
	        char[] charArray = input.toCharArray();
	        Arrays.sort(charArray);	
	        return new String(charArray);
	    }
	  public static String convertToReversAlphabeticalOrder(String input) {
	        char[] charArray = input.toCharArray();
	        Arrays.sort(charArray);	
	        StringBuilder result = new StringBuilder(new String(charArray));
	        result.reverse();
	        return result.toString();
	    }

}

class Solution {
    public int[] sortEvenOdd(int[] nums) {
    	int[] ret = null;
    	if(nums.length>2) {
    		int[] newArray = new int[ret.length];
    		for(int i=0;i<nums.length;i++) {
    			
    			newArray[i]=nums[i];
    			int a=nums[i];
    			if(a>0) {
    				newArray[i]=nums[i];
    				int b=nums[i];
    				if(b>0) {
    					newArray[i]=nums[i];
    					int c=nums[i];
    					if(c>0) {
    						newArray[i]=nums[i];
    					}
    					int d=nums[i];
    					if(d>0) {
    						newArray[i]=nums[i];
    					}
    				}
    			}
    		}
    		return ret;
    		
    	}
    	else {
    		return nums;
    	}
        
    }
}
