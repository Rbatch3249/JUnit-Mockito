package mockitoDemo.service;

import junit.framework.TestCase;
import mockitoDemo.data.UserRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class AuthenticationServiceTest{

    private AuthenticationService service;

    private UserRepository repository;

    @Before
    public void setUp(){
        this.repository= mock(UserRepository.class);
        this.service = new AuthenticationService(repository);
    }
    @Ignore
    @Test
    public void testAuthenticate(){
        //arrange
        when(this.repository.findByUsername(Mockito.any())).thenThrow(new IllegalArgumentException());

        //act
        this.service.authenticate("harry", "harry12345");

        //assert


    }

}
