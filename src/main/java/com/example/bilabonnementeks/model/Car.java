package com.example.bilabonnementeks.model;

public class Car {

    private int carId;
    private String vinNumber;
    private String carBrand;
    private String carModel;
    private int currentKm;
    private int trimLevel;
    private String carStatus;
    private int carRentPrice;
    private int carTotalPrice;
    private int regTax;
    private int co2Emission;
    private boolean activeStatus;
    private int customerId;

    public Car() {}

    public int getCarId() {return carId;}

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCurrentKm() {
        return currentKm;
    }

    public void setCurrentKm(int currentKm) {
        this.currentKm = currentKm;
    }

    public int getTrimLevel() {
        return trimLevel;
    }

    public void setTrimLevel(int trimLevel) {
        this.trimLevel = trimLevel;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public int getCarRentPrice() {
        return carRentPrice;
    }

    public void setCarRentPrice(int carRentPrice) {
        this.carRentPrice = carRentPrice;
    }

    public int getCarTotalPrice() {
        return carTotalPrice;
    }

    public void setCarTotalPrice(int carTotalPrice) {
        this.carTotalPrice = carTotalPrice;
    }

    public int getRegTax() {
        return regTax;
    }

    public void setRegTax(int regTax) {
        this.regTax = regTax;
    }

    public int getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(int co2Emission) {
        this.co2Emission = co2Emission;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
