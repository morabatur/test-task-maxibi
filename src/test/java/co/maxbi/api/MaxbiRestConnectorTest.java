package co.maxbi.api;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MaxbiRestConnectorTest {

    private String url = "https://online.moysklad.ru/api/remap/1.1/entity/customerorder";
    private String login = "admin@max69";
    private String password = "61ae20975e";

    @Test
    void connectNotNull() throws IOException {
        MaxbiRestConnector maxbiRestConnector = new MaxbiRestConnector();
        assertNotNull(maxbiRestConnector.connect(login, password, url));
    }


    @Test
    @Ignore
    void connectException(){
        MaxbiRestConnector maxbiRestConnector = new MaxbiRestConnector();

        Executable closureContainingCodeToTest =
                () ->  maxbiRestConnector.connect(login, password, url);
        assertThrows(IOException.class, closureContainingCodeToTest, "We expect the code under test to throw, but it didn't");
    }

}