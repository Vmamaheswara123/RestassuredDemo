package basics_Packages;

public class Payload {
	
	public static String addPlace() {
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}";
	}
	
	public static String updatePlace(String placeid) {
		return "{\r\n"
				+ "\"place_id\":\""+placeid+"\",\r\n"
				+ "\"address\":\"70 Summer walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}";
	}
	
	public static String complexJson() {
		return "{\r\n"
				+ "\r\n"
				+ "	\"dashboard\": {\r\n"
				+ "\r\n"
				+ "	\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "	\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "	},\r\n"
				+ "\r\n"
				+ "	\"courses\": [\r\n"
				+ "\r\n"
				+ "	{\r\n"
				+ "\r\n"
				+ "	\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "	\"price\": 50,\r\n"
				+ "\r\n"
				+ "	\"copies\": 6\r\n"
				+ "\r\n"
				+ "	},\r\n"
				+ "\r\n"
				+ "	{\r\n"
				+ "\r\n"
				+ "	\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "	\"price\": 40,\r\n"
				+ "\r\n"
				+ "	\"copies\": 4\r\n"
				+ "\r\n"
				+ "	},\r\n"
				+ "\r\n"
				+ "	{\r\n"
				+ "\r\n"
				+ "	\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "	\"price\": 45,\r\n"
				+ "\r\n"
				+ "	\"copies\": 10\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "	]\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "";
	}

	//Json used in this Section with Queries to solve
	
	/*
	1. Print No of courses returned by API

	2.Print Purchase Amount

	3. Print Title of the first course

	4. Print All course titles and their respective Prices

	5. Print no of copies sold by RPA Course

	6. Verify if Sum of all Course prices matches with Purchase Amount
	*/
}
