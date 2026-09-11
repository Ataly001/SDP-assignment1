package com.sweetbeverage;

public class EnergyDrinkBuilder extends AbstractDrinkBuilder{
    private static final int min_caffeine=60;

    @Override
    public SweetDrink build(){
        validateCommonFields();
        if(!carbonated){
            throw new IllegalStateException("Energy Drink must be carbonated");
        }
        if(caffeineMg<min_caffeine){
            throw new IllegalStateException("Energy drink can't have less than"
                    + min_caffeine+ "mg of caffeine");
        }
        return createDrink();
    }
}
