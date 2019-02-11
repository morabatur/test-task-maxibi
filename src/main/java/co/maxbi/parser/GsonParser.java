package co.maxbi.parser;

import co.maxbi.parser.entity.JsonData;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Клас для роботи з парсингом даних JSON
 */
public class GsonParser {

    private Gson parser;
    private InputStream stream;

    public GsonParser(Gson parser, InputStream inputStream) {
        this.parser = parser;
        this.stream = inputStream;
    }

    /**
     * Метод дозволяє розпарсити наявну JSON структуру в Java об'єкти
     * @return
     */
    public JsonData jsonParser(){
        JsonReader jsonReader = new JsonReader(new InputStreamReader(stream));
        return parser.fromJson(jsonReader, JsonData.class);

    }
}
