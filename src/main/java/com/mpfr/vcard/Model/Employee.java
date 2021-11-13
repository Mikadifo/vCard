package com.mpfr.vcard.Model;

public class Employee {

    private String nameEmployee;
    private String nameCity;
    private String scheduleEmployee;
    private String emailEmployee;
    private String celEmployee;
    private String pagWebEmployee;

    public Employee(String nameEmployee, String nameCity, String scheduleEmployee, String emailEmployee,
            String celEmployee, String pagWebEmployee) {
        this.nameEmployee = nameEmployee;
        this.nameCity = nameCity;
        this.scheduleEmployee = scheduleEmployee;
        this.emailEmployee = emailEmployee;
        this.celEmployee = celEmployee;
        this.pagWebEmployee = pagWebEmployee;
    }

    public Employee() {
    }

    /**
     * @return String return the nameEmployee
     */
    public String getNameEmployee() {
        return nameEmployee;
    }

    /**
     * @param nameEmployee the nameEmployee to set
     */
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
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

    /**
     * @return String return the scheduleEmployee
     */
    public String getScheduleEmployee() {
        return scheduleEmployee;
    }

    /**
     * @param scheduleEmployee the scheduleEmployee to set
     */
    public void setScheduleEmployee(String scheduleEmployee) {
        this.scheduleEmployee = scheduleEmployee;
    }

    /**
     * @return String return the emailEmployee
     */
    public String getEmailEmployee() {
        return emailEmployee;
    }

    /**
     * @param emailEmployee the emailEmployee to set
     */
    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    /**
     * @return String return the celEmployee
     */
    public String getCelEmployee() {
        return celEmployee;
    }

    /**
     * @param celEmployee the celEmployee to set
     */
    public void setCelEmployee(String celEmployee) {
        this.celEmployee = celEmployee;
    }

    /**
     * @return String return the pagWebEmployee
     */
    public String getPagWebEmployee() {
        return pagWebEmployee;
    }

    /**
     * @param pagWebEmployee the pagWebEmployee to set
     */
    public void setPagWebEmployee(String pagWebEmployee) {
        this.pagWebEmployee = pagWebEmployee;
    }

}