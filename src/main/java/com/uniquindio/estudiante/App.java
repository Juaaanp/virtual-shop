package com.uniquindio.estudiante;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // modern furnitures creation
       ModernFurnitureFactory modernFactory = new ModernFurnitureFactory();
        System.out.println("Modern furnitures family");
        modernFactory.createChair().baseChair();
        modernFactory.createSofa().baseSofa();
        modernFactory.createCoffeTable().baseCoffeTable();
        System.out.println("----------------------------------");

       VictorianFurnitureFactory victorianFactory = new VictorianFurnitureFactory();
       System.out.println("Victorian furnitures family");
       victorianFactory.createChair().baseChair();
       victorianFactory.createSofa().baseSofa();
       victorianFactory.createCoffeTable().baseCoffeTable();

    }
}
