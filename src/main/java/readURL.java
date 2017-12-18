import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class readURL  {
    String url;

    public readURL(String url) {
        this.url = url;
        }

    public void get_weather() throws Exception {

        InputStream stream = new URL(this.url).openStream();

        try {

            JSONObject parser = (JSONObject) new JSONParser().parse(new BufferedReader(new InputStreamReader(stream)).readLine());

            double temp = (double) ((HashMap) parser.get("main")).get("temp");

            System.out.println("Description: "+ ((HashMap) ((ArrayList) parser.get("weather")).get(0)).get("main"));
            System.out.println("Temperature in Kelvin: " + temp);
            System.out.println("temperature in Celsius: " + (temp - 273.15));

        } finally {
            stream.close();
    }
    }
}










