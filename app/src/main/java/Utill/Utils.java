package Utill;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by roger on 2018-01-04.
 */

public class Utils {

    public static final String Base_URL = "api.openweathermap.org/data/2.5/weather?q=";
    public static final String ICON_URL = "api.openweathermap.org/img/w/";

    public static JSONObject getObject(String tagName, JSONObject jsonObject) throws JSONException{
        JSONObject jobj = jsonObject.getJSONObject(tagName);
        return jobj;
    }

}
