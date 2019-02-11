package co.maxbi.api;

import co.maxbi.db.connector.ConnectorDAO;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Base64;
import java.util.logging.Logger;

/**
 * Клас для роботи з REST сервісом з базовою авторизацією
 */
public class MaxbiRestConnector implements RestConnector {

    private static final Logger log = Logger.getLogger(MaxbiRestConnector.class.getName());

    /**
     * Метод дозволяє пройти Basic авторизацію та повертає InputStream сторінки
     *
     * @param login    - логін для авторизації
     * @param password - пароль авторизації
     * @param link     - посилання для входу
     * @return InputStream
     * @throws IOException
     */
    @Override
    public InputStream connect(String login, String password, String link) throws IOException {
        URL url = new URL(link);
        URLConnection uc = url.openConnection();
        String userpass = login + ":" + password;
        String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));
        uc.setRequestProperty("Authorization", basicAuth);

        log.info("Authorization to the address" + link + " was successful\n");

        return uc.getInputStream();

    }
}
