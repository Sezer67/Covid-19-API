
package myProject;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.client.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class CovidClient {
   private String basicURL ="https://api.covid19api.com/total/country/"; 
   private HttpClient httpClient;

    public CovidClient() {
        httpClient = HttpClientBuilder.create().build(); // builder tasarım deseni kullanarak nesneyi oluşturduk
    }
    
   
// web servisini kullanarak jsonarray döndürelim
// ana Url adresime sadece seçilen ülkenin adını ekliyorum ve artık o Url de olmuş oluyorum
    public JsonArray getCovid(String country) throws IOException{
        String search = String.format("%s", country); 
        
        HttpGet httpGet = new HttpGet(basicURL + search); // istek 
        HttpResponse httpResponse = httpClient.execute(httpGet); // yanıt
        
        InputStream input = httpResponse.getEntity().getContent();
        InputStreamReader streamReader = new InputStreamReader(input);
        
        JsonParser jsonParser = new JsonParser();
        JsonElement element = jsonParser.parse(streamReader);
        
        JsonArray ulkeler = element.getAsJsonArray();
        input.close();
        
        return ulkeler;
    }


   
}
