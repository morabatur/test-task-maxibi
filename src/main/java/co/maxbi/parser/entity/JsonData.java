package co.maxbi.parser.entity;

/**
 * POJO клас для узагальнення даних з JSON
 */
import java.util.Arrays;

public class JsonData {
    private Row[] rows;

    public JsonData() {
    }

    public JsonData(Row[] rows) {
        this.rows = rows;
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "rows=" + Arrays.toString(rows) +
                '}';
    }
}
