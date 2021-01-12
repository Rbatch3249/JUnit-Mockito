package mockitoDemo.web;

import junit.framework.TestCase;
import mockitoDemo.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class LoginControllerTest {

    private LoginController controller; //SUT

    private AuthenticationService service; //mock

    @Before
    public void setUp() throws Exception {
        this.service = mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);

    }

    @Test
    public void testService(){
        //arrange
         when(service.authenticate(anyString(),anyString())).thenReturn(true);

        //act
        String viewPath = controller.service("tom","password123");

        //assert
        Assert.assertNotNull(viewPath);
        Assert.assertEquals("/home",viewPath);
    }

}
