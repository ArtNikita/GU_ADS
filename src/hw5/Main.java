package hw5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(power(2, -3));

        Backpack backpack = new Backpack(8);
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));
        backpack.checkAllArrays(items);
        System.out.println(backpack.getBestItems());
        System.out.println(backpack.getMaxPrice());
    }

    public static double power(double number, int power){
        if (power < 0){
            number = 1/number;
            power = -power;
        }
        if (power == 1) return number;
        return number * power(number, --power);
    }
}
