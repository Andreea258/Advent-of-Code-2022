import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day4 {

    File file = new File("C:\\Users\\straw\\Documents\\Java\\AOC2022\\src\\PuzzleInput4.txt");
    Scanner scanner = new Scanner(file);

    ArrayList<Integer> arrayInt = new ArrayList<>(); // for every pair a new list
    ArrayList<Integer> arrayInt2 = new ArrayList<>(); // for every pair a new list

    ArrayList<Integer> firstElf = new ArrayList<>();
    ArrayList<Integer> secondElf = new ArrayList<>();
    int counter;

    public Day4() throws FileNotFoundException {
    }

    public void firstPart() {

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] newData;
            newData = line.split("[,-]");

            firstElf.add(Integer.parseInt(newData[0]));
            firstElf.add(Integer.parseInt(newData[1]));

            secondElf.add(Integer.parseInt(newData[2]));
            secondElf.add(Integer.parseInt(newData[3]));

            for (int i = firstElf.get(0); i <= Integer.parseInt(newData[1]); i++){
                arrayInt.add(i);
            }
            for (int i = secondElf.get(0); i <= Integer.parseInt(newData[3]); i++){
                arrayInt2.add(i);
            }

            Integer[] hope = new Integer[arrayInt.size()];
            hope = arrayInt.toArray(hope);

            Integer[] hope2 = new Integer[arrayInt2.size()];
            hope2 = arrayInt2.toArray(hope2);

            if (new HashSet<>(Arrays.asList(hope)).containsAll(Arrays.asList(hope2)) || new HashSet<>(Arrays.asList(hope2)).containsAll(Arrays.asList(hope))){
                counter++;
            }

            arrayInt2.clear();
            arrayInt.clear();

            firstElf.clear();
            secondElf.clear();

        }
        System.out.println("The counter for the first part is "+ counter);

    }
    public void secondPart(){
        int counter2 = 0;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] newData;
            newData = line.split("[,-]");

            firstElf.add(Integer.parseInt(newData[0]));
            firstElf.add(Integer.parseInt(newData[1]));


            secondElf.add(Integer.parseInt(newData[2]));
            secondElf.add(Integer.parseInt(newData[3]));


            for (int i = firstElf.get(0); i <= Integer.parseInt(newData[1]); i++){
                arrayInt.add(i);
            }
            for (int i = secondElf.get(0); i <= Integer.parseInt(newData[3]); i++){
                arrayInt2.add(i);
            }

            for (int i = 0; i<= arrayInt2.size()-1; i++){
                if (arrayInt.contains(arrayInt2.get(i))){
                    counter2++;
                    break;
                }
            }


            arrayInt2.clear();
            arrayInt.clear();

            firstElf.clear();
            secondElf.clear();
        }
        System.out.println(counter2);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Day4 firstPart = new Day4();
        firstPart.firstPart();

        Day4 secondPart = new Day4();
        secondPart.secondPart();
    }
}