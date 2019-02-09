package co.maxbi;

import co.maxbi.entity.Row;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/maxi.json"));

        Row row[] = gson.fromJson(jsonReader, Row[].class);

        for (Row row1 : row) {
            System.out.println(row1.toString());
        }



    }
}
