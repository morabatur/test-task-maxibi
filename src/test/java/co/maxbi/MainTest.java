package co.maxbi;

import co.maxbi.db.dao.OrdersJdbcDAO;
import co.maxbi.db.dao.interfaces.OrdersDAO;
import co.maxbi.parser.DataFilter;
import co.maxbi.parser.EntetyConvertor;
import co.maxbi.parser.entity.JsonData;
import co.maxbi.parser.entity.Row;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainFewRowTest() throws FileNotFoundException {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/testRes/testData.json"));
        JsonData data = gson.fromJson(jsonReader, JsonData.class);
        OrdersDAO orders = new OrdersJdbcDAO();
        Set<String> idOrdersSet = orders.idOrdersSet();

        List<Row> actualRowList = DataFilter.filterJSON(data, idOrdersSet);

        assertEquals(2, actualRowList.size());
    }
}