package testCase;

import WebDriver.Web;
import io.restassured.response.ValidatableResponse;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class getClass {

    String token = "sample key 1234567890";

    @Test
    public void testGet(){
                given()
                .param("id","2")
                .when()
                .get("https://gorest.co.in/public-api/users")
                .then()
                .assertThat().statusCode(200);
        System.out.println(toString());
    }
}
