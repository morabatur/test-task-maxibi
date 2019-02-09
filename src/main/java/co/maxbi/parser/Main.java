package co.maxbi.parser;

import co.maxbi.entity.JsonData;
import co.maxbi.entity.Row;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        JsonReader jsonReader = new JsonReader(new FileReader("src\\main\\resources\\maxiAll.json"));

        JsonData jsonData = gson.fromJson(jsonReader, JsonData.class);
        jsonData.toString();
        for (Row row : jsonData.getRows()) {
            System.out.println(row.toString());
        }


    }
}
