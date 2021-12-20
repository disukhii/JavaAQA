package api;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import Api.Client;
import Api.Request;
import Api.RequestRepo;
import Api.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class APITests {

    ResponseSpecification checkStatusCodeAndContentType =
            new ResponseSpecBuilder().
                    expectStatusCode(200).
                    expectContentType(ContentType.JSON).
                    build();

    @Test
    public void Home(){

        //prepare
        given()

                //execute
                .when().
                get("http://localhost/catalog/view/javascript/common.js").

                //validate
                        then().
                assertThat()
                .and()
                .spec(checkStatusCodeAndContentType);
    }

    @Test
    public void amazonMainPage(){
        // prepare
        Request request = RequestRepo.getMainPage();

        //execute
        Response response=new Client().send(request);

        //validate
        Assert.assertEquals(response.getStatusCode().intValue(),200,"invalid code");
    }
    @Test
    public void amazonCem(){
        // prepare
        Request request = RequestRepo.postAmazonCem();

        //execute
        Response response=new Client().send(request);

        //validate
        Assert.assertEquals(response.getStatusCode().intValue(),200,"invalid code");
    }
    @Test
    public void amazonSuggestions(){
        // prepare
        Request request = RequestRepo.headSuggestions();

        //execute
        Response response=new Client().send(request);

        //validate
        Assert.assertEquals(response.getStatusCode().intValue(),204,"invalid code");
    }
    @Test
    public void amazonPageNotFound(){
        // prepare
        Request request = RequestRepo.getNotFound();

        //execute
        Response response=new Client().send(request);

        //validate
        Assert.assertEquals(response.getStatusCode().intValue(),404,"invalid code");
    }
    @Test
    public void amazonEvents(){
        // prepare
        Request request = RequestRepo.getAmazonEvents();

        //execute
        Response response=new Client().send(request);

        //validate
        Assert.assertEquals(response.getStatusCode().intValue(),200,"invalid code");
    }


}