public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

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