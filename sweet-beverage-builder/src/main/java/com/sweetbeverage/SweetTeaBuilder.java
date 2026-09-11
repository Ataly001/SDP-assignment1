package com.sweetbeverage;

public class SweetTeaBuilder extends AbstractDrinkBuilder{
    @Override
    public SweetDrink build(){
        validateCommonFields();

        if(carbonated){
            throw new IllegalStateException("Sweet tea can't be carbonated");
        }
        return createDrink();
    }
}
