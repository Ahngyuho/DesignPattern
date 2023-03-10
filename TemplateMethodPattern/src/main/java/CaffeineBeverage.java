public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void addCondiments();

    abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water ...");
    }
    public void pourInCup() {
        System.out.println("filling in cu...p");
    }
}
