import java.util.HashMap;
import java.util.Map;

public class MapCoddingBat {

	public static void main(String[] args) {
		// mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
		// mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
		// mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d":
		// "hi"}
		// mapShare({"a": "aaa", "c": "meh", "d": "hi"})
		//
		// mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
		// mapAB({"a": "Hi"}) → {"a": "Hi"}
		// mapAB({"b": "There"}) → {"b": "There"}

		// Map<String, String> map = new HashMap<>();
		// map.put("a", "aaa");
		// map.put("b", "asdf");
		// map.put("c", "ccc");
		// map.put("d", "hi");
		// Map<String, String> result = new HashMap<>();
		//
		// if (map.containsKey("c")) {
		// map.remove("c");
		// }
		// if (map.containsKey("a")) {
		// map.put("b", map.get("a"));
		// }
		//
		// System.out.println(map);
		//

		//
		// Map<String, String> map = new HashMap<>();
		// map.put("a", "HI");
		// map.put("b", "THERE");
		//
		// if (map.containsKey("a") && map.containsKey("b")) {
		// map.put("ab", map.get("a").toString() + map.get("b").toString());
		// }
		//
		// System.out.println(map);
		//
		// topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream":
		// "cherry"}
		// topping1({}) → {"bread": "butter"}
		// topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

		// Map<String, String> map = new HashMap<>();
		// map.put("ice cream", "peanuts");
		//
		// if (map.containsKey("ice cream")) {
		// map.remove("ice cream");
		// map.put("ice cream","cherry");
		// }
		// map.put("bread", "butter");
		// System.out.println(map);

		//
		// topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream":
		// "cherry"}
		// topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry",
		// "spinach": "nuts", "ice cream": "cherry"}
		// topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
		//
		// Map<String, String> map = new HashMap<>();
		// map.put("spinach", "dirt");
		// map.put("ice cream", "peanuts");
		//
		// if (map.containsKey("ice cream")) {
		//
		// map.put("yogurt", map.get("ice cream"));
		// }
		// if (map.containsKey("spinach")) {
		// map.put("spinach", "nuts");
		// }
		// System.out.println(map);

		//
		// topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
		// topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
		// topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad":
		// "oil", "potato": "ketchup", "fries": "ketchup"}

		// Map<String, String> map = new HashMap<>();
		// // map.put("potato", "ketchup");
		// // map.put("potato", "butter");
		// map.put("salad", "oil");
		// map.put("potato", "ketchup");
		//
		// if (map.containsKey("potato")) {
		// map.put("fries", map.get("potato"));
		//
		// }
		// if (map.containsKey("salad")) {
		// map.put("spinach", map.get("salad"));
		// }
		// System.out.println(map);
		//
		// mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
		// mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
		// mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c":
		// "aaa"}

		// Map<String, String> map = new HashMap<>();
		//// map.put("a", "aaa");
		//// map.put("b", "aaa");
		//// map.put("c", "cake");
		//// map.put("a", "aaa");
		//// map.put("b", "bbb");
		// map.put("a", "aaa");
		// map.put("b", "bbb");
		// map.put("c", "ccc");
		//
		// if (map.containsKey("a") && map.containsKey("b")) {
		// if (map.get("a").toString().equalsIgnoreCase(map.get("b").toString())) {
		// map.remove("a");
		// map.remove("b");
		// }
		//
		// }
		//
		// System.out.println(map);
		//

		//
		// mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
		// mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
		// mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c":
		// "cake"}
		//
		// Modify and return the given map as follows:
		// if exactly one of the keys "a" or "b" has a value in the map (but not both),
		// set the other to have that same value in the map.
		// Map<String, String> map = new HashMap<>();
		// map.put("a", "aaa");
		//// map.put("b", "aaa");
		// map.put("c", "cake");
		// // map.put("a", "aaa");
		// // map.put("b", "bbb");
		// // map.put("a", "aaa");
		// // map.put("b", "bbb");
		//// map.put("c", "ccc");

		// if (map.containsKey("a")) {
		// if (map.containsKey("b")) {
		//
		// } else {
		// map.put("b", map.get("a"));
		// }
		// }
		// if (map.containsKey("b")) {
		// if (map.containsKey("a")) {
		//
		// } else {
		// map.put("a", map.get("b"));
		// }
		// }
		//
		// System.out.println(map);

		//
		// mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
		// "aaa"}
		// mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c":
		// "bbb"}
		// mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
		Map<String, String> map = new HashMap<>();
		map.put("a", "aaaaa");
		map.put("b", "bbbbb");
		map.put("c", "cake");
		// map.put("a", "aaa");
		// map.put("b", "bbb");
		// map.put("a", "aaa");
		// map.put("b", "bbb");
		// map.put("c", "ccc");
		// (num1>num2) ? (num1+num2):(num1-num2)
//		if (map.containsKey("a") && map.containsKey("b")) {
//			String s=null;
//			if(map.get("a").toString().length() > (map.get("b").toString().length()) ){
//				s=map.get("a").toString();
//			}else {
//				s=map.get("b");
//			}
//					
//			System.out.println(s);
//			if (map.containsKey("c")) {
//
//				map.put("c", s);
//			}
//		}
		
		
		if(map.get("a")!=null && map.get("b")!=null){
			  if(map.get("a").length() != map.get("b").length()){
			      map.put("c", map.get("a").length()>map.get("b").length()?map.get("a"):map.get("b"));
			  }

			  if(map.get("a").length() == map.get("b").length()){
			      map.put("a","");
			      map.put("b","");
			  }
			  }
//			  return map;

		System.out.println(map);
//
//		stringYak("yakpak") → "pak"
//		stringYak("pakyak") → "pak"
//		stringYak("yak123ya") → "123ya"
		
		String str="yakpak";
		String str1="pakyak";
		String str2="yak123ya";
		System.out.println(str.replace("yak", ""));
		System.out.println(str1.replace("yak", ""));
		System.out.println(str2.replace("yak", ""));
//		array667([6, 6, 2]) → 1
		int[] nums= {6, 6, 2};
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==6) {
				count+=1;
			}
		}
		System.out.println(count-1);
	}

}
