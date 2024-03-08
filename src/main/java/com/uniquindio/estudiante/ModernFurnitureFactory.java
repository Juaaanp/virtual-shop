package com.uniquindio.estudiante;

public class ModernFurnitureFactory extends FurnitureFactory  {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
       return new ModernSofa();
    }

    @Override
    public CoffeTable createCoffeTable() {
      return new ModernCoffeTable();
    }
    
}
