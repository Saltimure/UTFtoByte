package com.company;

import java.io.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main extends UTFtoBytesConverter {

    public static void main(String[] args) {
        stringToBytes(new File("resources/1.txt"), new File("resources/2.txt"));
        bytesToString(new File("resources/2.txt"), new File("resources/3.txt"));
    }
}