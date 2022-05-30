package com.herokuapp.booker_restful.bookininfo;

import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingList extends TestBase {
    @Test
    public void readBookingList(){
        Response response = given().log().all()
                .when()
                .get("/booking");
                response.then().statusCode(200);
                response.prettyPrint();
    }
}
