package org.example.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private final String inputFile;

    public FileService(String inputFile) {
        this.inputFile = inputFile;
    }

    public List<String> addStringsToList() {
        List<String> stringList = new ArrayList<>();
        try {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringList.add(line);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
}
