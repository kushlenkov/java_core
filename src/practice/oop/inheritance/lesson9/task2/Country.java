package practice.oop.inheritance.lesson9.task2;

public class Country {

    private String language;
    private String continent;
    private long countPeople; //Используем long т.к. в теории количество людей может увеличиться

    public Country(String language, String continent, long countPeople) {
        this.language = language;
        this.continent = continent;
        this.countPeople = countPeople;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }

    public long getCountPeople() {
        return countPeople;
    }
}
