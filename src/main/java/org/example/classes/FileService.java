package org.example.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private String inputFile;
   // private String outputFile;

    public FileService(String inputFile) {
        this.inputFile = inputFile;
       // this.outputFile = outputFile;
    }

    //public void rewriteToNewFileWithRandomAgeLimit() {
    //    try {
    //        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
    //             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
    //            String line;
    //            while ((line = bufferedReader.readLine()) != null) {
    //                bufferedWriter.write(AgeRestrictions.getRandomAgeLimit().getLimit() + ", " + line);
    //                bufferedWriter.newLine();
    //            }
    //        }
//
    //    } catch (IOException e) {
    //        throw new RuntimeException(e);
    //    }
    //}
//
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
