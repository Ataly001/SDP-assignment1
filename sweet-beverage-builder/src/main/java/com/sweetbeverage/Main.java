package com.sweetbeverage;

public class Main {
    public static void main(String[] args) {
        DrinkDirector director = new DrinkDirector();

        SweetDrink cola =
                director.createClassicCola(new ColaBuilder());

        SweetDrink tea =
                director.createLemonSweetTea(new SweetTeaBuilder());

        SweetDrink energyDrink =
                director.createGorillaEnergyDrink(new EnergyDrinkBuilder());

        System.out.println("----- SWEET BEVERAGE BUILDER----- ");
        System.out.println();

        System.out.println(cola);
        System.out.println(tea);
        System.out.println(energyDrink);

        System.out.println("----- CUSTOM DRINK -----");

        SweetDrink customCola = new ColaBuilder()
                .setName("Custom Cola")
                .setFlavor("Cherry")
                .setSugarGrams(30)
                .setCarbonated(true)
                .setCaffeineMg(25)
                .setVolumeMl(500)
                .setMainIngredient("Cola flavor")
                .build();

        System.out.println(customCola);
    }

}
