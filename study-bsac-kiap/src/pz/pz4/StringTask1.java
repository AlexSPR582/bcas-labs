package pz.pz4;

public class StringTask1 {
    public int countSumNumbersInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                sum += str.charAt(i) - 48;
            }
        }
        return sum;
    }
}
