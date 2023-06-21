package Seminar.sem_003;

public class Item {
    private String name;
    private String country;
    private Integer volume;

    public Item(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    public Item() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "item [name=" + name + ", country=" + country + ", volume=" + volume + "]";
    }

}
