
import java.io.*;


public class homework22 {
    public static void main(String[] args) throws Exception {
        String [] arrayData =  homework22.ReadLineFromFile("21.txt");
        for(int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }
        
    }


    static void readFile(){
        File file = new File("test.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()){
            res += scanner.nextLine() + "\n";
        }
        System.out.println(res);
    }