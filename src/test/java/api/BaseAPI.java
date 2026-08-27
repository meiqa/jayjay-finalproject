package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseAPI {

    public static String appID = "63a804408eb0cb069b57e43a";

    public static Response response;

    public void apiSetup(){
        RestAssured.baseURI = "https://dummyapi.io/data/v1";
    }
}