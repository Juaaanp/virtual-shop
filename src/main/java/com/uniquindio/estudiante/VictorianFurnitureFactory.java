package com.uniquindio.estudiante;

public class VictorianFurnitureFactory extends FurnitureFactory {
    public VictorianFurnitureFactory(){
    }
    
    @Override
    public Chair createChair() {
        return new VictorianChair();  
    }
    @Override
    public Sofa createSofa() {
       return new VictorianSofa();
        
    }
    @Override
    public CoffeTable createCoffeTable() {
        return new VictorianCoffeTable();
        
    }
}