package api;

import org.testng.Assert;
import org.testng.annotations.Test;
import Api.Client;
import Api.Request;
import Api.RequestRepo;
import Api.Response;
import Base.BaseTCApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class APITests extends BaseTCApi{

    @Test(dataProvider = "opencartStatusPath")
    public void opencartMainPage(String path, int statusCode){
        // prepare
        Request request = RequestRepo.getMainPage(path);

        //execute
        Response response=new Client().send(request);

        //validate
        Assert.assertEquals(response.getStatusCode().intValue(),statusCode,"invalid code");
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