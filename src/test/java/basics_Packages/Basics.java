package basics_Packages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics {

	public static void main(String[] args) {
		/*
		 * given() - all inputs are required when() - submit the API Then() - validate
		 * the response https://rahulshettyacademy.com/maps/api/place/add/json?key=
		 * qaclick123
		 */

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.addPlace()).when().post("maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).headers("Content-Length", "194").extract().response().asString();

		JsonPath js = new JsonPath(response);
		String place_id = js.getString("place_id");
		System.out.println("Place id is " + place_id);

		String putResponse = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Payload.updatePlace(place_id)).when().put("maps/api/place/update/json").then().assertThat()
				.statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response().asString();

		String getResponse = given().queryParam("key", "qaclick123").queryParam("place_id", place_id)
				.header("Content-Type", "application/json").when().get("maps/api/place/get/json").then().assertThat()
				.statusCode(200).extract().response().asString();

		jsonPath(getResponse, "address");
		jsonPath(Payload.complexJson(), "dashboard.purchaseAmount");
		jsonPath(Payload.complexJson(), "courses[0].title");
	}

	public static void jsonPath(String response, String getValue) {
		JsonPath js = new JsonPath(response);
		String keyValue = js.getString(getValue);
		System.out.println(keyValue);
	}
}
