package pl.artsiombax.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static List<City> cities = new ArrayList<>();

    static {
        City city1 = new City(1, "London", "GBR", 9126366);
        City city2 = new City(2, "Berlin", "DEU", 3748148);
        City city3 = new City(3, "Hamburg", "DEU", 1930996);
        City city4 = new City(4, "Warsaw", "POL", 1802237);
        City city5 = new City(5, "Minsk", "BLR", 1982444);

        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
    }


    public static List<City> getCityByGeo(String geo) {
        List<City> getCityByGeo = cities.stream().filter(p -> p.getGeoCode().equals(geo)).collect(Collectors.toList());

        return getCityByGeo;
    }

    public static List<City> getCityByPop(int population)

    public static void main(String[] args) {
        System.out.println(getCityByGeo("DEU"));

    }
}