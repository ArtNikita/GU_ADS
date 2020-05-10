package hw5;

import java.util.ArrayList;

public class Backpack {

    private ArrayList<Item> bestItems = null;
    private double maxWeight;
    private double maxPrice;

    public ArrayList<Item> getBestItems() {
        return bestItems;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private double findWeight(ArrayList<Item> items){
        double resultWeight = 0;
        for (Item item : items) {
            resultWeight += item.getWeight();
        }
        return resultWeight;
    }

    private double findPrice(ArrayList<Item> items){
        double resultPrice = 0;
        for (Item item : items) {
            resultPrice += item.getPrice();
        }
        return resultPrice;
    }

    private void checkArray(ArrayList<Item> items){
        if (bestItems == null){
            if (findWeight(items) <= maxWeight){
                bestItems = items;
                maxPrice = findPrice(items);
            }
        } else if (findWeight(items) <= maxWeight && findPrice(items) > maxPrice){
            bestItems = items;
            maxPrice = findPrice(items);
        }
    }

    public void checkAllArrays(ArrayList<Item> items){
        if (items.size() > 0){
            checkArray(items);
        }
        for (int i = 0; i < items.size(); i++){
            ArrayList<Item> newArrayList = new ArrayList<>(items);
            newArrayList.remove(i);
            checkAllArrays(newArrayList);
        }
    }
}
