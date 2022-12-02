import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Day2 {

    // First line : A X
    // LAst line : C Y
    File file = new File("C:\\Users\\straw\\Documents\\Java\\AOC2022\\src\\PuzzleInput2.txt");
    Scanner scanner = new Scanner(file);

    // A -> Rock
    // B -> Paper
    // C -> Scissors

    int scoreX = 1; // rock
    int scoreY = 2; // paper
    int scoreZ = 3; // scissors
    int sum = 0;
    int sum2 = 0;

    public Day2() throws FileNotFoundException {
    }

    public void firstPart() {

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] newCode = line.split("\\s+");


            if (Objects.equals(newCode[0], "A")) {
                if (Objects.equals(newCode[1], "Y")) {
                    sum += scoreY + 6;

                } else if (Objects.equals(newCode[1], "Z")) {
                    sum += scoreZ;

                } else {
                    sum += scoreX + 3;
                }

            } else if (Objects.equals(newCode[0], "B")) {
                if (Objects.equals(newCode[1], "Y")) {
                    sum += 3 + scoreY;
                } else if (Objects.equals(newCode[1], "Z")) {
                    sum += scoreZ + 6;
                } else {
                    sum += scoreX;
                }

            } else if (Objects.equals(newCode[0], "C")) {
                if (Objects.equals(newCode[1], "Y")) {
                    sum += scoreY;
                } else if (Objects.equals(newCode[1], "Z")) {
                    sum += scoreZ + 3;
                } else {
                    sum += scoreX + 6;
                }
            }


        }
        System.out.println(sum);

    }

    // Y -> Draw
    // X -> Need to loose
    // Z -> Win
    // A-> Rock
    // B -> Paper
    // C -> Scissors
    public void secondPart() {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] newCode2 = line.split("\\s+");

            if (Objects.equals(newCode2[0], "A")) {
                if (Objects.equals(newCode2[1], "X")) {
                    sum2 += scoreZ;
                } else if (Objects.equals(newCode2[1], "Y")) {
                    sum2 += scoreX + 3;
                } else {
                    sum2 += 6 + scoreY;
                }

            } else if (Objects.equals(newCode2[0], "B")) {
                if (Objects.equals(newCode2[1], "X")) {
                    sum2 += scoreX;
                } else if (Objects.equals(newCode2[1], "Y")) {
                    sum2 += scoreY + 3;
                } else {
                    sum2 += scoreZ + 6;
                }
            } else if (Objects.equals(newCode2[0], "C")) {
                if (Objects.equals(newCode2[1], "X")) {
                    sum2 += scoreY;
                } else if (Objects.equals(newCode2[1], "Y")) {
                    sum2 += scoreZ + 3;
                } else {
                    sum2 += scoreX + 6;
                }
            }

        }
        System.out.println(sum2);
    }


    public static void main(String[] args) throws FileNotFoundException {

        Day2 first = new Day2();
        first.firstPart();

        Day2 secondPart = new Day2();
        secondPart.secondPart();

    }
}
