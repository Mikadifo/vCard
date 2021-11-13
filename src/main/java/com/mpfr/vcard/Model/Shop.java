package com.mpfr.vcard.Model;

public class Shop {

    private String codeCity;
    private String codeShop;
    private String nameShop;

    public Shop(String codeCity, String codeShop, String nameShop) {
        this.codeCity = codeCity;
        this.codeShop = codeShop;
        this.nameShop = nameShop;
    }

    public Shop() {
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
     * @return String return the codeShop
     */
    public String getCodeShop() {
        return codeShop;
    }

    /**
     * @param codeShop the codeShop to set
     */
    public void setCodeShop(String codeShop) {
        this.codeShop = codeShop;
    }

    /**
     * @return String return the nameShop
     */
    public String getNameShop() {
        return nameShop;
    }

    /**
     * @param nameShop the nameShop to set
     */
    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

}