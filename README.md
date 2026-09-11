# SDP-assignment1

  **PROJECT DESCRIPTION**
  
This Project demonstrates how builder pattern works
using the sweet drinks creation as an example.

Our SweetDrink product can have various characteristics:

name;
flavor;
sugar amount;
carbonation;
caffeine amount;
volume;
main ingredient.

The project features three different types of drinks:

Cola,
Sweet Tea,
Energy Drink


**BUILDER**

**MAIN CLASSES**:

SweetDrink — Product

DrinkBuilder — Builder

AbstractDrinkBuilder — General logic

ColaBuilder — Cola

SweetTeaBuilder — Sweet tea

EnergyDrinkBuilder — Energy drink

DrinkDirector — Predefined values

Main — Client

**HOW TO CREATE A DRINK:**

SweetDrink cola = new ColaBuilder()

.setName(“Classic Cola”)

.setFlavor(“Cola”)

.setSugarGrams(35)

.setCarbonated(true)

.setCaffeineMg(33)

.setVolumeMl(330)

.setMainIngredient(“Cola flavor”)

.build();

For other types of drinks, use SweetTeaBuilder and EnergyDrinkBuilder.

**HOW TO START:**

Open Main.java in IntelliJ IDEA and click Run.




