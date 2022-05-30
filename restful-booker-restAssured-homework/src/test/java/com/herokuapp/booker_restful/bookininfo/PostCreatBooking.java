package com.herokuapp.booker_restful.bookininfo;

import com.herokuapp.booker_restful.model.BookingPojo;
import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostCreatBooking extends TestBase {
    @Test
    public void creatBooking(){
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("jim");
        bookingPojo.setLastname("Brown");
        bookingPojo.setDepositpaid(true);
        bookingPojo.setTotalprice(111);
        HashMap<String,String> dates= new HashMap<>();
        dates.put("checkin","2018-01-01");
        dates.put("checkout","2019-01-01");
        bookingPojo.setBookingdates(dates);
        bookingPojo.setAdditionalneeds("Breakfast");
        Response response =given()
                .header("Content-Type","application/json")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
