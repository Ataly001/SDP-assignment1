package com.sweetbeverage;

public abstract class AbstractDrinkBuilder implements DrinkBuilder{

    protected String name;
    protected String flavor;
    protected int sugarGrams;
    protected boolean carbonated;
    protected int caffeineMg;
    protected int volumeMl;
    protected String mainIngredient;

    @Override
    public DrinkBuilder setName(String name){
        this.name=name;
        return this;
    }

    @Override
    public DrinkBuilder setFlavor(String flavor){
        this.flavor=flavor;
        return this;
    }

    @Override
    public DrinkBuilder setSugarGrams(int sugarGrams){
        this.sugarGrams=sugarGrams;
        return this;
    }

    @Override
    public DrinkBuilder setCarbonated(boolean carbonated) {
        this.carbonated = carbonated;
        return this;
    }

    @Override
    public DrinkBuilder setCaffeineMg(int caffeineMg) {
        this.caffeineMg = caffeineMg;
        return this;
    }

    @Override
    public DrinkBuilder setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
        return this;
    }

    @Override
    public DrinkBuilder setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
        return this;
    }

    protected void validateCommonFields(){
        if(name==null || name.isBlank()){
            throw new IllegalStateException("Name of the Drink is required");
        }

        if (flavor == null || flavor.isBlank()) {
            throw new IllegalStateException("Flavor is required");
        }

        if (sugarGrams < 0) {
            throw new IllegalStateException("Sugar can't be negative");
        }

        if (caffeineMg < 0) {
            throw new IllegalStateException("Caffeine can't be negative");
        }

        if (volumeMl <= 0) {
            throw new IllegalStateException("Volume must be > 0");
        }

        if (mainIngredient == null || mainIngredient.isBlank()) {
            throw new IllegalStateException("Main ingredient is required");
        }

    }

    protected SweetDrink createDrink(){
        return new SweetDrink(
                name,
                flavor,
                sugarGrams,
                carbonated,
                caffeineMg,
                volumeMl,
                mainIngredient
        );
    }
}
