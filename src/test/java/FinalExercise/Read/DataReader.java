package FinalExercise.Read;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.InputStream;
import java.io.InputStreamReader;

public class DataReader {
    public static JsonObject readData(String filePath) {
        Gson gson = new Gson();
        JsonObject data = null;

        try (InputStream inputStream = DataReader.class.getClassLoader().getResourceAsStream(filePath)) {
            if (inputStream == null) {
                throw new RuntimeException("Unable to find file: " + filePath);
            }

            try (InputStreamReader reader = new InputStreamReader(inputStream)) {
                data = gson.fromJson(reader, JsonObject.class);
            }
        } catch (Exception e) {
            System.err.println("Error reading JSON data: " + e.getMessage());
        }

        return data;
    }
}
