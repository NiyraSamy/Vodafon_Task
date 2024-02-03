
package RestAssured.restassured;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.*;


public class ScriptClass {
	
	private static RequestSpecification requestSpec;
	
	@BeforeClass
    public static void createRequestSpecification() {

        requestSpec = new RequestSpecBuilder().
            setBaseUri("https://api.zippopotam.us").
            build();
    }
	
	@DataProvider(name = "data")
    public static Object[][] getData() {
        return new Object[][]{
            { "us", "90210", "Beverly Hills" },
            { "us", "12345", "Schenectady" },
            { "ca", "B2R", "Waverley"}
        };
    }
	
	@Test(priority=1 , dataProvider = "data")
    public void Verify_API_Response_StatusCode(String countryCode, String zipCode, String  expectedPlaceName) 
	{
		
	      
        given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then()
            .assertThat()
            .statusCode(200);
        
    }
	
	
	@Test(priority=2 , dataProvider = "data")
    public void Verify_Invalid_Request_Handling(String countryCode, String zipCode, String  expectedPlaceName) 
	{
		
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then().assertThat().header("vary", "Accept-Encoding");
                
    }
	
	@Test(priority=3 , dataProvider = "data")
    public void Verify_ParameterKey_HasValue(String countryCode, String zipCode, String  expectedPlaceName) {
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then().assertThat()
            .body("places[0].'place name'", equalTo(expectedPlaceName));
    }
	
	@Test(priority=4 , dataProvider = "data")
    public void Verify_Response_Time(String countryCode, String zipCode, String  expectedPlaceName) {
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then().assertThat().time(lessThan(9000L));
        
    }
	
	@Test(priority=5 , dataProvider = "data")
    public void Verify_Status_Code_Handling(String countryCode, String zipCode, String  expectedPlaceName) {
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then().assertThat().statusCode(
                    anyOf(
                        is(200),
                        is(404),
                        is(500),
                        is(422)
                    )
                );
        
    }
	
	@Test(priority=6 , dataProvider = "data")
    public void Verify_StatusCode_and_Parms_notNull(String countryCode, String zipCode, String  expectedPlaceName) {
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then()
            .assertThat()
        .statusCode(200)
        .body("places[0].'place name'", notNullValue()); 
	}
	
	
	
	@Test(priority=7 , dataProvider = "data")
    public void Verify_ResponseBody_Object(String countryCode, String zipCode, String  expectedPlaceName) {
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then()
            .assertThat()
        .statusCode(200)
        .body("places", hasSize(1));
        
    }
	
	@Test(priority=8 , dataProvider = "data")
    public void Verify_API_contentType(String countryCode, String zipCode, String  expectedPlaceName) 
	{
		
	      
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then()
            .assertThat()
            .contentType(ContentType.JSON);
        
    }
	
	@Test(priority=9 , dataProvider = "data")
    public void Verify_Response_Encoding(String countryCode, String zipCode, String  expectedPlaceName) 
	{
		
		given().spec(requestSpec).
        pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).
        when().
        get("{countryCode}/{zipCode}")
            .then().assertThat().header("charset", "UTF-8");
                
    }
	
}
