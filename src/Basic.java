import java.util.UUID;
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Basic {
	
	  private static int counter = 0;

	    public static int generatePK() {
	        return ++counter;
	    }


	public static void main(String[] args) {
//		
//		
//		  int pK = generatePK();
//		  System.out.println(pK);
//
//		UUID uuid = UUID.randomUUID();
//		String pK_ID = uuid.toString();
//
//		System.out.println("Generated pK_ID: " + pK_ID);
		
		String Key="ZZREQ_ID";
		Object value1 = null;

		value1 = "PQMSP";

		String s = value1.toString().toLowerCase();
		System.out.println("after convert into string : " + s);

		if (Key.equalsIgnoreCase("ZZREQ_ID")&&((value1.toString().toLowerCase()).contains("pqm".toLowerCase()))) {
			System.out.println("hello world");
		}

		System.out.println("132456");

		String inputString = "YourString04092MoreText";

		Pattern pattern = Pattern.compile("04092");
		Matcher matcher = pattern.matcher(inputString);
		while (matcher.find()) {
			String extractedValue = matcher.group();
			System.out.println("Extracted Value: " + extractedValue);
		}

		String jsonResponse = "{ \"data\": \"NO_RATING_POSSIBLE\" }";
		int httpStatusCode = 400;

		if (httpStatusCode == 404) {
			try {
				// Remove leading and trailing curly braces
				String jsonString = jsonResponse.substring(1, jsonResponse.length() - 1);

				// Split the key-value pair
				String[] keyValue = jsonString.split(":");
				if (keyValue.length == 2) {
					String key = keyValue[0].trim();
					String value = keyValue[1].trim();

					if ("\"data\"".equals(key)) {
						// Remove leading and trailing double quotes
						String quoteStatus = value.substring(1, value.length() - 1);
						System.out.println("Quote Status: " + quoteStatus);
					}
				}
			} catch (Exception e) {
				System.out.println("Error parsing JSON response: " + e.getMessage());
			}
		} else {
			if (httpStatusCode == 400) {
				try {
					// Remove leading and trailing curly braces
					String jsonString = jsonResponse.substring(1, jsonResponse.length() - 1);

					// Split the key-value pair
					String[] keyValue = jsonString.split(":");
					if (keyValue.length == 2) {
						String key = keyValue[0].trim();
						String value = keyValue[1].trim();

						if ("\"data\"".equals(key)) {
							// Remove leading and trailing double quotes
							String quoteStatus = value.substring(1, value.length() - 1);
							System.out.println("Quote Status: " + quoteStatus);
						}
					}
				} catch (Exception e) {
					System.out.println("Error parsing JSON response: " + e.getMessage());
				}
			}
		}
	}

}
