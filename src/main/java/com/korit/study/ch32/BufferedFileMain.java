package com.korit.study.ch32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedFileMain
{
    public  static void main(String[] args)
    {
        final String FILE_NAME = "student.txt";
        try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fr);
            List<String> list = new ArrayList<String>();
            while(true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                list.add(line);

            }
            System.out.println(list);
            bufferedReader.close();

            FileWriter fw = new FileWriter(FILE_NAME);
            BufferedWriter bw = new BufferedWriter(fw);
            list.reversed().forEach(line -> {
                try {
                    bw.write(line);
                    bw.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            bw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
