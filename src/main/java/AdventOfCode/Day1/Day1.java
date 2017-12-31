package AdventOfCode.Day1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Day1 {
    public static void main(String... args) {
        Path file = Paths.get("day1.txt");
        Day1Solver solver = new Day1Solver(file);
        Integer sum = solver.calc();
        System.out.println("The calculated Sum is: " + sum);
    }
}
