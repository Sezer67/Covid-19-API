package myProject;

import com.google.gson.JsonArray;

public class Json {
    private JsonArray json;
     
    public Json(JsonArray json) {
        this.json = json;
    }
    
    public Object getKeyValue(int index,String key){
        return json.getAsJsonArray().get(index).getAsJsonObject().get(key);
    }
    
}
