import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorDeMoedas {
    private String apiKey;

    public ConversorDeMoedas(String apiKey) {
        this.apiKey = apiKey;
    }

    public double obterTaxaCambio(String de, String para) {
        try {
            URL url = new URL("https://api.exchangerate-api.com/v4/latest/" + de + "?access_key=" + apiKey);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
            return jsonObject.getAsJsonObject("rates").get(para).getAsDouble();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao obter taxa de câmbio", e);
        }
    }
}
