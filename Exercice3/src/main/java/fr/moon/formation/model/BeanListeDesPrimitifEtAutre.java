package fr.moon.formation.model;


import java.io.File;
import java.net.URL;
import java.util.*;

/*
* ici un bean qui va lister tout ce qui n'est pas un bean
* Spring se chargera lui meme de faire les conversions
*
* */
public class BeanListeDesPrimitifEtAutre {

    private int entier;
    private double reel;
    private String chaine;
    private char caractere;
    private Properties properties;
    private Locale localisation;
    private URL url;
    private File fichier;
    private byte[] tableauBytes;
    private String [] TableauChaines;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;


    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) {
        this.entier = entier;
    }

    public double getReel() {
        return reel;
    }

    public void setReel(double reel) {
        this.reel = reel;
    }

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Locale getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Locale localisation) {
        this.localisation = localisation;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public File getFichier() {
        return fichier;
    }

    public void setFichier(File fichier) {
        this.fichier = fichier;
    }

    public byte[] getTableauBytes() {
        return tableauBytes;
    }

    public void setTableauBytes(byte[] tableauBytes) {
        this.tableauBytes = tableauBytes;
    }

    public String[] getTableauChaines() {
        return TableauChaines;
    }

    public void setTableauChaines(String[] tableauChaines) {
        TableauChaines = tableauChaines;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "BeanListeDesPrimitifEtAutre{" +
                "entier=" + entier +
                ", reel=" + reel +
                ", chaine='" + chaine + '\'' +
                ", caractere=" + caractere +
                ", properties=" + properties +
                ", localisation=" + localisation +
                ", url=" + url +
                ", fichier=" + fichier +
                ", tableauBytes=" + Arrays.toString(tableauBytes) +
                ", TableauChaines=" + Arrays.toString(TableauChaines) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
