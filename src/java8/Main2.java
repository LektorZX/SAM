package java8;

import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        int reduce = IntStream.of(2, 4, 5, 6, 7, 8)
                //.reduce(0, (left, right) -> left + right);
                .reduce(0, new IntBinaryOperator() {
                    @Override
                    public int applyAsInt(int left, int right) {
                        return left + right;
                    }
                });
        System.out.println(reduce);









    }
}
