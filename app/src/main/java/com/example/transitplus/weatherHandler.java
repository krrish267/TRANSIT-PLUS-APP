import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class weatherHandler  {

    private static String apiKey = "08e00db9b38b8b1a73c92e885e09eb11";
    private static double latitude; 
    private static double longitude; 
    private static String temp ; 
    private static String wind; 
    private static String weatherCond; 

    public weatherHandler(){

        latitude = 0; 
        longitude = 0; 
        temp = ""; 
        wind = ""; 
        weatherCond = ""; 

    }

    public weatherHandler(double longitude, double latitude){

        this.longitude = longitude; 
        this.latitude = latitude; 

    }

    public static void main(String[] args) {

        try {
            String apiUrl = "https://api.openweathermap.org/data/2.5/weather?lat=" + latitude + "&lon=" + longitude + "&appid=" + apiKey;
            URL url = new URL(apiUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                parseJsonResponse(response.toString());

            } else {
                System.out.println("Error: HTTP " + responseCode);
            }

            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseJsonResponse(String jsonResponse) {

        try {

            int tempStartIndex = jsonResponse.indexOf("\"temp\":") + "\"temp\":".length();
            int tempEndIndex = jsonResponse.indexOf(",", tempStartIndex);
            double temperatureInKelvin = Double.parseDouble(jsonResponse.substring(tempStartIndex, tempEndIndex));
            double temperatureInCelsius = temperatureInKelvin - 273.15;

            int windSpeedStartIndex = jsonResponse.indexOf("\"speed\":") + "\"speed\":".length();
            int windSpeedEndIndex = jsonResponse.indexOf(",", windSpeedStartIndex);
            double windSpeed = Double.parseDouble(jsonResponse.substring(windSpeedStartIndex, windSpeedEndIndex));

            int descriptionStartIndex = jsonResponse.indexOf("\"description\":\"") + "\"description\":\"".length();
            int descriptionEndIndex = jsonResponse.indexOf("\"", descriptionStartIndex);
            String weatherCondition = jsonResponse.substring(descriptionStartIndex, descriptionEndIndex);

            temp = temperatureInCelsius + "°C"; 
            wind = windSpeed + "m/s"; 
            weatherCond = weatherCondition; 


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getTemp(){ 

        return temp;

    }

    public String getWind (){ 

        return wind; 

    }

    public String getWeatherCond(){ 

        return weatherCond; 

    }

}
