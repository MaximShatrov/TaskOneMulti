import java.util.Random;

enum Country {
    RU("Россия"),
    UK("Великобритания"),
    DE("Германия"),
    JP("Япония"),
    IT("Италия"),
    BR("Бразилия"),
    EG("Египет"),
    US("США"),
    PT("Португалия"),
    SK("Словакия"),
    FR("Франция");

    private final String name;

    Country(String name) {
        this.name = name;
    }

    public Country getRandomCountry(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    @Override
    public String toString() {
        return name;
    }
}
