package com.korit.study.ch31;

import java.io.File;
import java.io.IOException;
import java.util.List;



public class ExceptionMain2 {
    static void main() {
        List<String> names = List.of("김준일","김준이");
        try {
            print(names,2);
        }
        catch (IOException e) {

        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("크기넘음");
        }
        catch (NullPointerException e) {
            System.out.println("list변수에 null이 들어가 있어");
        }catch (Exception e) {
            System.out.println("최종적으로 ");
        }
        finally {
            System.out.println("프로그램 정상 종료");
        }
    }
    public static void print(List<String> names,int size) throws
            IOException,
            NullPointerException,
            IndexOutOfBoundsException {

        System.out.println(names.size());
        for(int i = 0; i < size; i++){
            System.out.println(names.get(i));
        }
        File f = new File("");
    }
}
