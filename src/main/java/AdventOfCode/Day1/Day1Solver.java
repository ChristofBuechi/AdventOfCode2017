package AdventOfCode.Day1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Day1Solver {
    private final List<Integer> list;
    private int sum;

    public Day1Solver(Path path) {

        File file = getFileFromResource(path);

        //File is found
        System.out.println("File Found : " + file.exists());

        //Read File Content
        String content = null;
        try {
            content = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sum = 0;
        int firstDigit = Character.getNumericValue(content.charAt(0));
        int lastDigit = Character.getNumericValue(content.charAt(content.length() - 1));

        if (firstDigit == lastDigit) {
            sum = firstDigit;
        }

        list = content.chars()
                .mapToObj(i -> (char) i)
                .map(Character::getNumericValue)
                .collect(Collectors.toList());
    }

    public Integer calc() throws IllegalArgumentException {
        if (list == null || list.isEmpty())
            return 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).intValue() == list.get(i).intValue()) {
                sum += list.get(i);
            }
        }
        return sum;
    }


    private File getFileFromResource(Path resource) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(resource.getFileName().toString()).getFile());
        return file;
    }
}
