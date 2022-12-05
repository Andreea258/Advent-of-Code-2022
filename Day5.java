import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day5 {

    File file = new File("C:\\Users\\straw\\Documents\\Java\\AOC2022\\src\\PuzzleInput5.txt");
    Scanner scanner = new Scanner(file);

    ArrayList<ArrayList<String>> columns = new ArrayList<>();

    public void firstPart() {
        for (int i = 0; i < 9; i++) {
            columns.add(new ArrayList<>());
        }

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            if (line.startsWith(" 1")) {
                break;
            }
            if (line.charAt(1) != ' ') {
                columns.get(0).add(String.valueOf(line.charAt(1)));
            }
            if (line.charAt(5) != ' ') {
                columns.get(1).add(String.valueOf(line.charAt(5)));
            }
            if (line.charAt(9) != ' ') {
                columns.get(2).add(String.valueOf(line.charAt(9)));
            }
            if (line.charAt(13) != ' ') {
                columns.get(3).add(String.valueOf(line.charAt(13)));
            }
            if (line.charAt(17) != ' ') {
                columns.get(4).add(String.valueOf(line.charAt(17)));
            }
            if (line.charAt(21) != ' ') {
                columns.get(5).add(String.valueOf(line.charAt(21)));
            }
            if (line.charAt(25) != ' ') {
                columns.get(6).add(String.valueOf(line.charAt(25)));
            }
            if (line.charAt(29) != ' ') {
                columns.get(7).add(String.valueOf(line.charAt(29)));
            }
            if (line.charAt(33) != ' ') {
                columns.get(8).add(String.valueOf(line.charAt(33)));
            }
        }
        scanner.nextLine();
        while(scanner.hasNextLine()){

            String[] line = scanner.nextLine().split(" ");

            for (int i = 0; i < Integer.parseInt(line[1]); i++){
                int column = Integer.parseInt(line[3]);
                ArrayList<String> newArr = columns.get(column-1);
                String newChar = newArr.remove(0);
                columns.get(Integer.parseInt(line[5])-1).add(i,newChar);
            }
        }

        columns.stream().map(entry -> entry.size() > 0 ? entry.get(0) : "").forEach(System.out::println);

    }

    public Day5() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Day5 firstPart = new Day5();
        firstPart.firstPart();
    }
}