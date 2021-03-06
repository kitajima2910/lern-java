/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Lan-T
 */
public class WriterData<T> {

    public WriterData() {
    }
    
    public void writeDateFile(List<T> t, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                for(T e: t) {
                    bufferedWriter.write(e.toString() + "\r");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
