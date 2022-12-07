import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day6 {


    File file = new File("C:\\Users\\straw\\Documents\\Java\\AOC2022\\src\\PuzzleInput6.txt");
    Scanner scanner = new Scanner(file);
    ArrayList<List<String>> data = new ArrayList<List<String>>();
    int counter = 4;
    public void firstPart(){
        String newBigData = scanner.next();
        String[] bigArray = newBigData.split("");

        // get the first 4 characters
        for (int i = 0; i <= bigArray.length-4; i++) {
            String first = bigArray[i];
            String second = bigArray[i+1];
            String third = bigArray[i+2];
            String fourth = bigArray[i+3];
            if (!Objects.equals(first, second) && !Objects.equals(first, third) && !Objects.equals(first, fourth) && !Objects.equals(second, third) && !Objects.equals(second, fourth) && !Objects.equals(third, fourth)){
                break;
            } else{
                counter++;
            }
        }
        System.out.println("The solution for the first part is: " + counter);
    }

    //int counter2 = 0;
    public void secondPart(){
        String newBigData = scanner.next();
        List<String> bigArray = List.of(newBigData.split(""));

        for (int i = 0; i < bigArray.size(); i++) {

            data.add(bigArray.subList(i, Math.min(i + 14, bigArray.size())));
        }
        int i = 0;
        while ( i < data.size()) {
            boolean dist = data.get(i).size() == (new ArrayList(new HashSet(data.get(i)))).size();
            if (dist){
                break;
            }
            i++;
        }



        System.out.println("The solution for the second part is: " + (i+14));
    }


    public Day6() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Day6 firstPart = new Day6();
        firstPart.firstPart();

        Day6 secondPart = new Day6();
        secondPart.secondPart();
    }
}