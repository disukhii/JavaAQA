package Api;

import Api.Request;

public class RequestRepo {

    public static Request getMainPage() {
        Request request=new Request();
        request.setProtocol("http");
        request.setHost("localhost");
        request.setPath("/");
        request.setMethod("GET");
        return request;
    }

    public static Request postAmazonCem() {
        Request request=new Request();
        request.setProtocol("http");
        request.setHost("aan.amazon.com");
        request.setPath("/cem");
        request.setMethod("POST");
        request.setBody("{\"render_id\":\"219ff8e3-4df0-42f3-9ff8-e34df082f3f7\",\"event_type\":\"impression\",\"dimensions\":{\"subtype\":\"impression\",\"value\":1,\"template_name\":\"Dynamic eCommerce_SD_CI_US_DESKTOP\",\"template_major_version\":\"0\"}}");
        return request;
    }
    public static Request headSuggestions() {
        Request request=new Request();
        request.setProtocol("http");
        request.setHost("completion.amazon.com");
        request.setPath("/api/2017/suggestions");
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
/*
    public static Request createTrelloBoard(String boardName) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/?name="+boardName+"&key="+KEY +
                "&token="+TOKEN);
        request.setMethod("POST");
        request.setBody("{\"defaultLists\":false,\"name\":\"test_board1\",\"prefs_permissionLevel\"" +
                ":\"org\",\"prefs_selfJoin\":true,\"idOrganization\":\"60fefe65beb2b76caa04761c\"}");
        return request;
    }

    private static Request baseTrelloRequest() {
        Request request=new Request();
        request.setProtocol("https");
        request.setHost("api.trello.com");
        return request;
    }

    public static Request deleteTrelloBoard(String boardId) {
        Request request=baseTrelloRequest();
        request.setPath("1/boards/"+boardId+"?key="+KEY +
                "&token="+TOKEN);
        request.setMethod("DELETE");
        return request;
    }*/
}