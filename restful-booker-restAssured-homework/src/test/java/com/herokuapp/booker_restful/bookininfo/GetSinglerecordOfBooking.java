package com.herokuapp.booker_restful.bookininfo;

import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSinglerecordOfBooking extends TestBase {
    @Test
    public void readSingleBookingrecord(){
        Response response =  given()
                .when()
                .get("/booking/1252");
        response.then().statusCode(200);
    }
}
