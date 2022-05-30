package com.herokuapp.booker_restful.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SearchJsonPath {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        response = given().log().all()
                .when()
                .get("/booking")
                .then().statusCode(200);
    }

    @Test
    public void responsbodyTest() {
        System.out.println("status code is : " + response.extract().statusCode());
        System.out.println("status code is : " + response.extract().time());
        System.out.println("status ok is: " + response.extract().statusLine());

    }

}
