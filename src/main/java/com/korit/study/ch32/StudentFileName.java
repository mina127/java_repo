package com.korit.study.ch32;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StudentFileName {
    public static void main(String[] args) { // ← 여기 수정!
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader("student.txt");
            //FileWriter fileWriter = new FileWriter("C:\\gov\\mina_java_gov\\src\\main\\java\\com\\korit\\study\\student.txt");

            while (true) {
                int readData = fileReader.read(); // 유니코드로 int 반환
                if (readData == -1) {
                    break;
                }

                stringBuilder.append((char) readData);
            }

            System.out.println(stringBuilder.toString());

            fileReader.close();



        } catch (Exception e) {
            e.printStackTrace();
        }


        List<String> textList = Arrays.asList(stringBuilder.toString().split("\n"));
        System.out.println(textList);
        try{
            FileWriter fileWriter = new FileWriter("student.txt");
            for(int i = 0; i < textList.size(); i++){
                if(textList.get(i).contains("이름")){
                    textList.set(i,"이름: 민아");
                } else if (textList.get(i).contains("나이")) {
                    textList.set(i,"나이: 24");
                }
                fileWriter.write(textList.get(i) + "\n");
            }
            fileWriter.close();





        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(textList);



    }
}
