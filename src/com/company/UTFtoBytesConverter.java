package com.company;

import java.io.*;
import java.util.Scanner;

public class UTFtoBytesConverter{

    public static void stringToBytes(File file, File outputFile) {
        byte[] bytes = readFileBytes(file);
        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            for (int i = 0; i < bytes.length; i++) {
                fos.write((bytes[i] + " ").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bytesToString(File file, File outputFile) {
        try (FileReader fr = new FileReader(file);
             Scanner scan = new Scanner(fr);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            while (scan.hasNext()) {
                fos.write((byte)Integer.parseInt(scan.next()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] readFileBytes(File file) {
        byte[] bytes = new byte[(int)file.length()];
        try(FileInputStream fis = new FileInputStream(file)) {
            fis.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
