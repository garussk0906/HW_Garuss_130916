package lr6.Example10;

import java.util.Arrays;

public class Main_610 {
    public static void main(String[] args) {

        int[] arrayInt = getMaxAndMinValue(1266, 16629, 1882, 500);
        System.out.println(Arrays.toString(arrayInt));
    }
    public static int[] getMaxAndMinValue(int ... v) {

        Arrays.sort(v);

        int[] arrayInt = new int[2];
        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length - 1];

        return arrayInt;
    }
}
