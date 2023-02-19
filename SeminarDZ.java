/**
 * SeminarDZ
 */
import java.nio.file.DirectoryIteratorException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;


public class SeminarDZ {

    public static void main(String[] args) {
        String string = "шалаш";
        String palindrom = stringReverse(string);
        System.out.println(palindrom); 
        boolean palin = palindromStr (string, palindrom);
        System.out.println(palin);
        int repeetText = 100;
        String testText = "Test";

        fileText(testText, repeetText);
        
    }
    // 1. Создать метод, который проверяет, является ли строка палиндромом.
    // Палиндром - шалаш

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean palindromStr (String str, String pal) {
        return (str.equals(pal));
    }


    // 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
    // Если уже файл создан, то перезаписываем его.
    private static void fileText(String text, int repeet) {
        String stringBuilder = "";
        for (int i = 0; i < repeet; i++) {
            stringBuilder += text;
        }
        Path directorys = Path.of("folder/file.txt");
        try {
            Files.writeString(directorys, stringBuilder);
            Files.createFile(directorys);
            // 
        } catch (Exception e) {
            System.out.println("Файл уже был создан, он был удален и создан снова");
            try {
                Files.delete(directorys);
                Files.writeString(directorys, stringBuilder);
                Files.createFile(directorys);
            } catch (Exception y) {
                // TODO: handle exception
            }
            
        }
        
    }
}


