package seminars.fourth.webservice;

public class WebService {

    MyHttpClient myHttpClient;

    public WebService(MyHttpClient myHttpClient) {
        this.myHttpClient = myHttpClient;
    }

    public String sendRequest(String url) {
        return myHttpClient.get(url);
    }
}
