import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor {
    private String moeda;
    private String moedaDestino;
    private double valor;
    private double valorFinal;
    private double taxaCambio;

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public void setMoedaDestino(String moedaDestino) {
        this.moedaDestino = moedaDestino;
    }

    public double converte (double valor) throws IOException {

    String url_str = "https://v6.exchangerate-api.com/v6/0c42db960eee03bdc5acec92/pair/" + moeda + "/" + moedaDestino;

    URL url = new URL(url_str);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

    JsonParser jp = new JsonParser();
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
    JsonObject jsonobj = root.getAsJsonObject();

    double req_result = Double.parseDouble(jsonobj.get("conversion_rate").getAsString());
    this.taxaCambio = req_result;
    return this.valorFinal = valor * taxaCambio;
 }
}
