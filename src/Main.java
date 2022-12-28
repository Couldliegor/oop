import javax.xml.parsers.SAXParser;

public class Main {
    public static void main(String[] args) {
        Car[] auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", 1.7F, "Yellow", 2015, "Russia");
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 2020);
        auto[2] = new Car("BMW", "Z8", 2021);
        auto[3] = new Car("Kia", "Sportage 4", 2.4F, "Red", 2018, "South Korea");
        auto[4] = new Car("Hundai", "Avante", 1.6F, "Orange", 2016, "South Korea");
        System.out.println(auto[1].toString());
    }
}