package com.sweetbeverage;

public class DrinkDirector {
    public SweetDrink createClassicCola(DrinkBuilder builder) {
        return builder
                .setName("Classic Cola")
                .setFlavor("Cola")
                .setSugarGrams(35)
                .setCarbonated(true)
                .setCaffeineMg(33)
                .setVolumeMl(330)
                .setMainIngredient("Cola flavor")
                .build();
    }

    public SweetDrink createPeachSweetTea(DrinkBuilder builder) {
        return builder
                .setName("Lemon Sweet Tea")
                .setFlavor("Lemon")
                .setSugarGrams(25)
                .setCarbonated(false)
                .setCaffeineMg(20)
                .setVolumeMl(500)
                .setMainIngredient("Tea extract")
                .build();
    }

    public SweetDrink createBerryEnergyDrink(DrinkBuilder builder) {
        return builder
                .setName("Gorilla Energy")
                .setFlavor("Original")
                .setSugarGrams(27)
                .setCarbonated(true)
                .setCaffeineMg(80)
                .setVolumeMl(250)
                .setMainIngredient("Energy blend")
                .build();
    }
}
