package co.maxbi.api;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

public interface RestConnector {
    InputStream connect(String login, String password, String link) throws IOException;
}
