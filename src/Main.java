public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishwasher().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//
//        kitchen.getDishwasher().doDishes();
//        kitchen.getCoffeeMaker().brewCoffe();
//        kitchen.getFridge().orderFood();

        kitchen.setKitchenState(false, false,false);
        kitchen.doKitchenWork();
        kitchen.addWater();
        kitchen.doKitchenWork();
        kitchen.pourMilk();
        kitchen.doKitchenWork();
        kitchen.loadDishwasher();
        kitchen.doKitchenWork();
    }
}