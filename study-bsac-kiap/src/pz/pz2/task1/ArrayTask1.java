package pz.pz2.task1;

public class ArrayTask1 {
    public Integer findMinPlusNumber(int[] array) {
        Integer min = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                if (min == null) {
                    min = array[i];
                }
                else if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    public Integer findIndexMinPlusNumber(int[] array) {
        int min = findMinPlusNumber(array);
        Integer index = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                index = i;
            }
        }
        return index;
    }
}
