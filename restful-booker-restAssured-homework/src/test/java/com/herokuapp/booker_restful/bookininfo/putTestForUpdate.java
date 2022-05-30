package com.herokuapp.booker_restful.bookininfo;

import com.herokuapp.booker_restful.model.BookingPojo;
import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class putTestForUpdate extends TestBase {
    @Test
    public void updateRecord(){
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("kiya");
        bookingPojo.setLastname("Brown");
        bookingPojo.setDepositpaid(false);
        bookingPojo.setTotalprice(111);
        HashMap<String,String> dates= new HashMap<>();
        dates.put("checkin","2018-01-01");
        dates.put("checkout","2019-01-01");
        bookingPojo.setBookingdates(dates);
        bookingPojo.setAdditionalneeds("Breakfast");


        Response response = given()
                .header("Authorization","Bearer 4f1f803f9e68094")
                .header("Cookie","token=4f1f803f9e68094")
                .header("Content-Type","application/json")
                .body(bookingPojo)
                .when()
                .put("/booking/3037");
       response.then().statusCode(200);
        response.prettyPrint();
    }
}
