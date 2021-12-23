package Api;

import Api.Request;

public class RequestRepo {

    public static Request getMainPage(String path) {
        Request request=new Request();
        request.setProtocol("http");
        request.setHost("localhost");
        request.setPath(path);
        request.setMethod("GET");
        return request;
    }

    public static Request postAmazonCem(String path) {
        Request request=new Request();
        request.setProtocol("http");
        request.setHost("aan.amazon.com");
        request.setPath(path);
        request.setMethod("POST");
        request.setBody("{\"render_id\":\"219ff8e3-4df0-42f3-9ff8-e34df082f3f7\",\"event_type\":\"impression\",\"dimensions\":{\"subtype\":\"impression\",\"value\":1,\"template_name\":\"Dynamic eCommerce_SD_CI_US_DESKTOP\",\"template_major_version\":\"0\"}}");
        return request;
    }
    public static Request headSuggestions(String path) {
        Request request=new Request();
        request.setProtocol("http");
        request.setHost("completion.amazon.com");
        request.setPath(path);
        request.setMethod("HEAD");
        return request;
    }
    public static Request getNotFound() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("www.amazon.com");
        request.setPath("/notExpistPage");
        request.setMethod("GET");
        return request;
    }

    public static Request getAmazonEvents() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("www.amazon.com");
        request.setPath("/events/epicdeals?ref_=nav_cs_gb");
        request.setMethod("GET");
        return request;
    }

}