public class Main {
    public static void main(String[] args) throws Exception {
        String city = "Lviv";
        readURL ParsingPage = new readURL(new createURL(city).url);
        ParsingPage.get_weather();

    }
}
