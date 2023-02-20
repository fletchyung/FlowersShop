package com.example.flowershop;

import java.util.Date;

public class flowersData {

    private final Integer flowerId;
    private final String name;
    private final String status;
    private final Double price;
    private final Date date;
    private final String image;

    public flowersData(Integer flowerId, String name, String status, Double price
            , String image, Date date){
        this.flowerId = flowerId;
        this.name = name;
        this.status = status;
        this.price = price;
        this.date = date;
        this.image = image;
    }

    public Integer getFlowerId(){
        return flowerId;
    }
    public String getName(){
        return name;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
    public String getImage(){
        return image;
    }

}