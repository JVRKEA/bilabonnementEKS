package com.example.bilabonnementeks.model;

public class DamageReport {
    private Integer damageId;
    private String textDescription;
    private Integer damagePrice;
    private Integer carId;
    private Integer customerId;

// tom konstruktør
    public DamageReport(){}


// getters
public Integer getDamageId(){
         return damageId;
}

public String getTextDescription() {
     return textDescription;
}

public Integer getDamagePrice(){
     return damagePrice;
}

 public Integer getCarId(){
        return carId;
 }

public Integer getCustomerId(){
        return customerId;
}


// setters

public void setDamageId(Integer damageId){
        this.damageId= damageId;
}

public void setTextDescription(String textDescription){
        this.textDescription= textDescription;
}

public void setDamagePrice(Integer damagePrice){
        this.damagePrice= damagePrice;
}

public void setCarId(Integer carId){
        this.carId= carId;
}

public void setCustomerId(Integer customerId){
        this.customerId=customerId;
}


}






