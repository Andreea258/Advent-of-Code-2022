import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day1 {


    public static void main(String[] args) throws FileNotFoundException {

        // first num : 9057
        // last num:2653
        // sum for first Elf: 59.202


        File file = new File("C:\\Users\\straw\\Documents\\Java\\AOC2022\\src\\PuzzleInput1.txt");
        Scanner scanner = new Scanner(file);

        ArrayList<Integer> data = new ArrayList<>();

        int sum = 0;

        while (scanner.hasNextLine()){
            String line2 = scanner.nextLine();

            if (line2.isEmpty()){
                data.add(sum);
                sum = 0;
            } else {
                int number = Integer.parseInt(line2);
                sum +=number;
            }
        }

        Collections.sort(data);

        System.out.println("The Elf that carries the most has " + data.get(data.size()-1) + " total Calories");

        int first = data.get(data.size()-1);
        int second = data.get(data.size()-2);
        int third = data.get(data.size()-3);
        int sumTotal = first + second + third;

        System.out.println(sumTotal);

    }

}