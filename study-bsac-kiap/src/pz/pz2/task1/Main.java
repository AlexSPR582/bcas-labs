package pz.pz2.task1;

public class Main {
    public static void main(String[] args) {
        ArrayTask1 task1 = new ArrayTask1();
        int[] arr = {-1, -5, -7, 8, -2, 17};

        System.out.println("Минимальный элемент: " + task1.findMinPlusNumber(arr));
        System.out.println("Индекс минимального элемента: " + task1.findIndexMinPlusNumber(arr));
    }
}
