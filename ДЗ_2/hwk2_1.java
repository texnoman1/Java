import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.io.StringReader;

class hw21_1 {
    public static void main(String[] args) throws Exception {

        String str = "[{ \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(str);

        String line0 = str.replace(",", "");
        String line1 = line0.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        String line6 = line5.replace("фамилия:", "<Студент ");
        String line7 = line6.replace("оценка:", " получил оценку ");
        String line8 = line7.replace("предмет:", " по предмету ");

        String[] arrayData = line8.split("<");

        for (int i = 0; i < arrayData.length; i++) {
            System.out.println((arrayData[i]));

        }
    }
}

        

     

