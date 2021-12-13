package fr.moon.formation.spring.model;

import java.util.Objects;

public class Hotel {

    private long id;
    private String name;
    private String country;
    private String adresse;
    private double nbrOfPlace;


    public Hotel(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return id == hotel.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getNbrOfPlace() {
        return nbrOfPlace;
    }

    public void setNbrOfPlace(double nbrOfPlace) {
        this.nbrOfPlace = nbrOfPlace;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbrOfPlace=" + nbrOfPlace +
                '}';
    }
}
