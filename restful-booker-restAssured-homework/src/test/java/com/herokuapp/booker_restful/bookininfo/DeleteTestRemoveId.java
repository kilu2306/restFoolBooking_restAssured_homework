package com.herokuapp.booker_restful.bookininfo;

import com.herokuapp.booker_restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteTestRemoveId extends TestBase {
    @Test
    public void deleteRecord(){
        Response response = given()
                .header("Authorization","Bearer 4f1f803f9e68094")
                .header("Cookie","token=4f1f803f9e68094")
                .header("Content-Type","application/json")
                .when()
                .delete("/booking/3038");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
