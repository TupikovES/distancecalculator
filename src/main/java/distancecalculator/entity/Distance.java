package distancecalculator.entity;

import java.io.Serializable;

public class Distance implements Serializable {

    private static final long serialVersionUID = 5692240235428894656L;

    private City fromCity;
    private City toCity;
    private double distance;

    public Distance() {
    }

    public Distance(City fromCity, City toCity, double distance) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    /*
     * Methods equals and hashCode
     * are generated automatically by IDEa
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Distance distance1 = (Distance) o;

        if (Double.compare(distance1.distance, distance) != 0) return false;
        if (!fromCity.equals(distance1.fromCity)) return false;
        return toCity.equals(distance1.toCity);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fromCity.hashCode();
        result = 31 * result + toCity.hashCode();
        temp = Double.doubleToLongBits(distance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "from " + fromCity +
                " to " + toCity +
                " distance = " + distance;
    }
}
