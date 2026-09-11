package com.sweetbeverage;

public class ColaBuilder extends AbstractDrinkBuilder {

    @Override
    public SweetDrink build(){
        validateCommonFields();

        if(!carbonated){
            throw new IllegalStateException("Cola must be carbonated");
        }
        return createDrink();
    }
}
