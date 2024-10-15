package jsExecutor;

import io.restassured.RestAssured;

public class RestAssuredDemo {
public static void main(String[] args) {
	int code=RestAssured.get("https://mvnrepository.com/artifact/io.rest-assured/rest-assured/5.5.0").statusCode();
	System.out.println(code);
}
}
