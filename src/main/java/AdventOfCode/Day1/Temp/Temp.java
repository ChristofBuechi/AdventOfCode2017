package AdventOfCode.Day1.Temp;

import java.util.function.BiFunction;

public class Temp {
    class MyOwnSum implements BiFunction<Integer, Integer, Integer> {


        @Override
        public Integer apply(Integer integer, Integer integer2) {
            return (integer.equals(integer2)) ? integer.intValue() : 0;
        }
    }
}
