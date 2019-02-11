package co.maxbi.db.connector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectorDAOTest {

    @Test
    void conectIsNotNull() {
        final ConnectorDAO connectorDAO = new ConnectorDAO();
        assertNotNull(connectorDAO.conect());
    }


}