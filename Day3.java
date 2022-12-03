import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {

    File file = new File("C:\\Users\\straw\\Documents\\Java\\AOC2022\\src\\PuzzleInput3.txt");
    Scanner scanner = new Scanner(file);

    ArrayList<Integer> arrayInt = new ArrayList<>();
    ArrayList<Integer> arrayInt2 = new ArrayList<>();

    char[] alphabetList = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public Day3() throws FileNotFoundException {
    }

    int i = 0; // index for the first separated line
    int j = 0; // index for the second separated line
    int z = 0; // index for the third line (for part 2)
    char a;
    char b;
    char c;
    int counter2;
    int sum = 0;
    int sum2 = 0;

    public void firstPart(){
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            int midPoint = line.length() / 2;
            String firstPartLine = line.substring(0,midPoint);
            String secondPartLine = line.substring(midPoint);

            counter2 = 0;
            for (i = 0; i <= firstPartLine.length()-1; i++){
                a = firstPartLine.charAt(i);
                for (j = 0; j<= secondPartLine.length()-1; j++){
                    b = secondPartLine.charAt(j);
                    if (a == b){
                        if (counter2 < 1) {
                            int found = new String(alphabetList).indexOf(a);
                            arrayInt.add(found);
                            counter2++;
                        }
                    }
                }
            }
        }

        for (int idk = 0; idk <= arrayInt.size()-1; idk++){
            sum += arrayInt.get(idk);
        }
        System.out.println(sum);
    }

    public void secondPart() {
        while (scanner.hasNextLine()) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();

            counter2 = 0;
            for (i = 0; i <= line1.length() - 1; i++) {
                a = line1.charAt(i);
                for (j = 0; j <= line2.length() - 1; j++) {
                    b = line2.charAt(j);
                    for (z = 0; z <= line3.length() - 1; z++) {
                        c = line3.charAt(z);
                        if (a == b && b == c) {
                            if (counter2 < 1){
                                int found = new String(alphabetList).indexOf(a);
                                arrayInt2.add(found);
                                counter2++;
                            }
                        }
                    }
                }
            }
        }
        for (int idk = 0; idk <= arrayInt2.size()-1; idk++){
            sum2 += arrayInt2.get(idk);
        }
        System.out.println(sum2);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Day3 firstPart = new Day3();
        System.out.print("First part: ");
        firstPart.firstPart();

        Day3 secondPart = new Day3();
        System.out.print("Second part: ");
        secondPart.secondPart();
    }
}