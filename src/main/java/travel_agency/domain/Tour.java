package travel_agency.domain;

import java.util.Objects;

public class Tour {

    private long id;
    private boolean isActual;
    private String countryName;
    private String cityName;
    private String tourType;
    private double price;
    private int countDays;

    public Tour() {
    }

    public Tour(boolean isActual, String countryName, String cityName, String tourType,
                double price, int countDays) {

        this.isActual = isActual;
        this.countryName = countryName;
        this.cityName = cityName;
        this.tourType = tourType;
        this.price = price;
        this.countDays = countDays;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActual() {
        return isActual;
    }

    public void setActual(boolean actual) {
        isActual = actual;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return id == tour.id && isActual == tour.isActual && Double.compare(price, tour.price) == 0 && countDays == tour.countDays && Objects.equals(countryName, tour.countryName) && Objects.equals(cityName, tour.cityName) && Objects.equals(tourType, tour.tourType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActual, countryName, cityName, tourType, price, countDays);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TravelTour: ");
        sb.append("id= ").append(id);
        sb.append(", Country - ").append(countryName);
        sb.append(", city - ").append(cityName);
        sb.append(", tourType - ").append(tourType);
        sb.append(", Days - ").append(countDays);
        sb.append(", Price - ").append(price);
        sb.append(", isActual - ").append(isActual);

        return sb.toString();
    }
}