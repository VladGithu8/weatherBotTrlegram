import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Weather {
//b9c29dcc94c52263f11ad3656fb86a29  c1e5db984f0df423167198b594822c8c
    public static String getWeather(String message, Model model) throws IOException, MalformedURLException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&&lang=ru&appid=b9c29dcc94c52263f11ad3656fb86a29");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while(in.hasNext()) {
            result += in.nextLine();
        }
//        return result;

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for(int i = 0; i<getArray.length(); i++){
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String)obj.get("description"));
        }
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "°C" + "\n" +
                "За окном: " + model.getMain() + "\n" +
                "Влажность: "+ model.getHumidity() +"%";
    }

            public static String getWeatherKiev(String message, Model model) throws IOException, MalformedURLException {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Kiev&units=metric&lang=ru&&appid=b9c29dcc94c52263f11ad3656fb86a29");

            Scanner in = new Scanner((InputStream) url.getContent());
            String result = "";
            while(in.hasNext()) {
                result += in.nextLine();
            }
//        return result;

            JSONObject object = new JSONObject(result);
            model.setName(object.getString("name"));

            JSONObject main = object.getJSONObject("main");
            model.setTemp(main.getInt("temp"));
            model.setHumidity(main.getDouble("humidity"));

            JSONArray getArray = object.getJSONArray("weather");
            for(int i = 0; i<getArray.length(); i++){
                JSONObject obj = getArray.getJSONObject(i);
                model.setMain((String)obj.get("description"));
            }
                return "Город: " + model.getName() + "\n" +
                        "Температура: " + model.getTemp() + "°C" + "\n" +
                        "За окном: " + model.getMain() + "\n" +
                        "Влажность: "+ model.getHumidity() +"%";
    }
    public static String getWeatherOdessa(String message, Model model) throws IOException, MalformedURLException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Odessa&units=metric&lang=ru&&appid=b9c29dcc94c52263f11ad3656fb86a29");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while(in.hasNext()) {
            result += in.nextLine();
        }
//        return result;

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for(int i = 0; i<getArray.length(); i++){
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String)obj.get("description"));
        }
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "°C" + "\n" +
                "За окном: " + model.getMain() + "\n" +
                "Влажность: "+ model.getHumidity() +"%";
    }
    public static String getWeatherKharkiv(String message, Model model) throws IOException, MalformedURLException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Kharkiv&units=metric&lang=ru&&appid=b9c29dcc94c52263f11ad3656fb86a29");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while(in.hasNext()) {
            result += in.nextLine();
        }
//        return result;

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for(int i = 0; i<getArray.length(); i++){
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String)obj.get("description"));
        }
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "°C" + "\n" +
                "За окном: " + model.getMain() + "\n" +
                "Влажность: "+ model.getHumidity() +"%";
    }
    public static String getWeatherLviv(String message, Model model) throws IOException, MalformedURLException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Lviv&units=metric&lang=ru&&appid=b9c29dcc94c52263f11ad3656fb86a29");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while(in.hasNext()) {
            result += in.nextLine();
        }
//        return result;

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for(int i = 0; i<getArray.length(); i++){
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String)obj.get("description"));
        }
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "°C" + "\n" +
                "За окном: " + model.getMain() + "\n" +
                "Влажность: "+ model.getHumidity() +"%";
    }
    public static String getWeatherZaporizhzhia(String message, Model model) throws IOException, MalformedURLException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Zaporizhzhia&lang=ru&&units=metric&appid=b9c29dcc94c52263f11ad3656fb86a29");

        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while(in.hasNext()) {
            result += in.nextLine();
        }
//        return result;

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for(int i = 0; i<getArray.length(); i++){
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String)obj.get("description"));
        }
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "°C" + "\n" +
                "За окном: " + model.getMain() + "\n" +
                "Влажность: "+ model.getHumidity() +"%";
    }
    public static String getWeatherPoltava(String message, Model model) throws IOException, MalformedURLException {
        URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=Poltava&units=metric&lang=ru&&appid=b9c29dcc94c52263f11ad3656fb86a29");
        Scanner in = new Scanner((InputStream) url.getContent());
        String result = "";
        while(in.hasNext()) {
            result += in.nextLine();
        }
//        return result;

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getInt("temp"));
        model.setHumidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for(int i = 0; i<getArray.length(); i++){
            JSONObject obj = getArray.getJSONObject(i);
            model.setMain((String)obj.get("description"));
        }
        return "Город: " + model.getName() + "\n" +
                "Температура: " + model.getTemp() + "°C" + "\n" +
                "За окном: " + model.getMain() + "\n" +
                "Влажность: "+ model.getHumidity() +"%";
    }
}

