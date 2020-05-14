package hw6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int trees = 20;
        int treeMaxLevel = 4;
        int maxValue = 25;
        int balancedTrees = 0;
        for (int i = 0; i < trees; i++) {
            TreeImpl<Integer> tree = new TreeImpl<>(treeMaxLevel);
            for (int j = 0; j < (int) (Math.pow(2, treeMaxLevel) - 1); j++) {
                tree.add(rand.nextInt(maxValue * 2 + 1) - maxValue);
            }
            if (tree.isBalanced()) {
                balancedTrees++;
            }
        }
        System.out.println(((balancedTrees / (trees * 1.0)) * 100) + "% of balanced trees.");
    }
}