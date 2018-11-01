package Serializable1.DZ;

public final class Util {
    public static int  Calc(String[] values){
        int t = 0;
        int i = 1;
        //считаем средний балл
        for (; i < values.length - 1; i++) {
            t += Integer.valueOf(values[i]);
        }
        i -= 1;
        int res;
        return res = t / i;//находим средний
    }
}
