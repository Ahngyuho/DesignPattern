public class Coffee extends CaffeineBeverage {
    @Override
    public void prepareRecipe() {
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarAndMilk();
    }

    @Override
    void addCondiments() {

    }

    @Override
    void brew() {

    }

    private void addSugarAndMilk() {
        System.out.println("add Sugar and Milk");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brewing coffee with filter");
    }

}
