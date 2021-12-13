package fr.moon.formation.model;

import java.util.Objects;

public class Formation {

    private long id;
    private String name;
    private String lieu;
    private String typeDeFormation;

    public Formation(long id, String name, String lieu, String typeDeFormation) {
        this.id = id;
        this.name = name;
        this.lieu = lieu;
        this.typeDeFormation = typeDeFormation;
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

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getTypeDeFormation() {
        return typeDeFormation;
    }

    public void setTypeDeFormation(String typeDeFormation) {
        this.typeDeFormation = typeDeFormation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formation formation = (Formation) o;
        return id == formation.id && name.equals(formation.name) && Objects.equals(lieu, formation.lieu) && Objects.equals(typeDeFormation, formation.typeDeFormation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lieu, typeDeFormation);
    }

    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lieu='" + lieu + '\'' +
                ", typeDeFormation='" + typeDeFormation + '\'' +
                '}';
    }
}
