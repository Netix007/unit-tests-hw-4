package seminars.fourth.webservice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WebServiceTest {
    @Test
    void requestHttpClient() {
        MyHttpClient myHttpClient = mock(MyHttpClient.class);
        WebService webService = new WebService(myHttpClient);
        when(myHttpClient.get(anyString())).thenReturn("ok");

        String result = webService.sendRequest("url");

        assertThat(result).isEqualTo("ok");

    }
}
