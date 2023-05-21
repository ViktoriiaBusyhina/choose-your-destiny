package org.example.classes;

import java.util.List;

public class OutputService {

    public void printList(List<?> list) {
        int count = 0;
        for (Object o : list) {
            count++;
            System.out.println(count + ". " + o);
        }
    }
}
