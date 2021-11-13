package com.mpfr.vcard.Model;

public class City {

    private String codeCity;
    private String nameCity;

    public City() {
    }

    public City(String codeCity, String nameCity) {
        this.codeCity = codeCity;
        this.nameCity = nameCity;
    }

    /**
     * @return String return the codeCity
     */
    public String getCodeCity() {
        return codeCity;
    }

    /**
     * @param codeCity the codeCity to set
     */
    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    /**
     * @return String return the nameCity
     */
    public String getNameCity() {
        return nameCity;
    }

    /**
     * @param nameCity the nameCity to set
     */
    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

}