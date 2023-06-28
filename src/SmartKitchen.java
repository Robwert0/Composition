public class SmartKitchen {
    private Refrigirator fridge;
    private DishWasher dishwasher;
    private CoffeeMaker coffeeMaker;

    public SmartKitchen(){
        fridge = new Refrigirator();
        dishwasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

    public Refrigirator getFridge() {
        return fridge;
    }

    public DishWasher getDishwasher() {
        return dishwasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        dishwasher.setHasWorkToDo(dishWasherFlag);
        fridge.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffe();
        dishwasher.doDishes();
        fridge.orderFood();
    }

    public void addWater(){
        System.out.println("Adding Water to coffee machine...");
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        System.out.println("Pouring milk...");
        fridge.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        System.out.println("Load Dish...");
        dishwasher.setHasWorkToDo(true);
    }
}
class Refrigirator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("Ordering food!");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing begins!");
            hasWorkToDo=false;
        }
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffe(){
        if(hasWorkToDo){
            System.out.println("Brewing cofee!");
            hasWorkToDo = false;
        }
    }
}

