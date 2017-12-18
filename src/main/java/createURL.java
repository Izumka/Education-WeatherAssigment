public class createURL {
    String url = "http://api.openweathermap.org/data/2.5/weather";
    String appid = "5496614f4ca95e6dcc0445c1e7f3916d";

    public createURL(String appid, String city){
        this.url = this.url + "?APPID=" + appid + "&q=" + city;
    }

    public createURL(String city) {
        this.url = this.url + "?APPID=" + appid + "&q=" + city;
    }
}
