package com.sweetbeverage;

public class SweetDrink{

        private final String name;
        private final String flavor;
        private final int sugarGrams;
        private final boolean carbonated;
        private final int caffeineMg;
        private final int volumeMl;
        private final String mainIngredient;

        public SweetDrink(
                String name,
                String flavor,
                int sugarGrams,
                boolean carbonated,
                int caffeineMg,
                int volumeMl,
                String mainIngredient
        ) {
            this.name = name;
            this.flavor = flavor;
            this.sugarGrams = sugarGrams;
            this.carbonated = carbonated;
            this.caffeineMg = caffeineMg;
            this.volumeMl = volumeMl;
            this.mainIngredient = mainIngredient;
        }

        public String getName() {
            return name;
        }

        public String getFlavor() {
            return flavor;
        }

        public int getSugarGrams() {
            return sugarGrams;
        }

        public boolean isCarbonated() {
            return carbonated;
        }

        public int getCaffeineMg() {
            return caffeineMg;
        }

        public int getVolumeMl() {
            return volumeMl;
        }

        public String getMainIngredient() {
            return mainIngredient;
        }

        @Override
        public String toString() {
            return String.format(
                    """
                    Sweet Drink
                    
                    Name: %s
                    Flavor: %s
                    Sugar: %d g
                    Carbonated: %s
                    Caffeine: %d mg
                    Volume: %d ml
                    Main ingredient: %s
                    """,
                    name,
                    flavor,
                    sugarGrams,
                    carbonated ? "Yes" : "No",
                    caffeineMg,
                    volumeMl,
                    mainIngredient
            );
        }
    }
