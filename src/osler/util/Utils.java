/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osler.util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

/**
 *
 * @author Wolverine 3 Utils class has generic methods to be used all across the
 * project.
 */
public class Utils {

    public static List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(System.getProperty("user.dir") + "/src/osler/data/dump/" + filename))) {
            stream.forEach((line) -> {
                lines.add(line);
            });
        } catch (IOException | NoSuchElementException e) {
            System.out.println("Exception  : " + e.getMessage());
        }
        return lines;
    }

    public static boolean writeFile(List<String> lines, String filename) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(System.getProperty("user.dir") + "/src/osler/data/dump/" + filename), "utf-8"));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
                System.out.println("Wrote : " + line);
            }
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
            return false;
        } finally {
            try {
                writer.close();
                return true;
            } catch (NullPointerException | IOException ex) {
                System.out.println("Error while closing : " + ex.getMessage());
                return false;
            }
        }
    }

    public static String hexToBin(String s) {
        return String.format("%8s", Integer.toBinaryString(Integer.decode(s))).replace(' ', '0');
    }
}
