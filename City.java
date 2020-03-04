package pl.artsiombax.test;

public class City {
    private int id;
    private String city;
    private String geoCode;
    private int population;

    public City() {
    }

    public City(int id, String city, String geoCode, int population) {
        this.id = id;
        this.city = city;
        this.geoCode = geoCode;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(String geoCode) {
        this.geoCode = geoCode;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    @Override
    public String toString() {
        return id + " " + city + " " + geoCode + " " + population ;
    }
}
