package com.sweetbeverage;

public interface DrinkBuilder {
    DrinkBuilder setName(String name);
    DrinkBuilder setFlavor(String flavor);
    DrinkBuilder setSugarGrams(int sugarGrams);
    DrinkBuilder setCarbonated(boolean carbonated);
    DrinkBuilder setCaffeineMg(int caffeineMg);
    DrinkBuilder setVolumeMl(int volumeMl);
    DrinkBuilder setMainIngredient(String mainIngredient);

    SweetDrink build();
}
