package com.korit.study.ch31;

import java.util.Map;

//강제 예외 생성
class CustomException extends RuntimeException {
    private Map<String, String> error;

    public CustomException(String message, Map<String, String> error) {
        super(message);
        this.error = error;
    }

    public Map<String, String> getError() {
        return error;
    }
}
public class ExceptionMain3 {
    static void main() {
        NullPointerException nullPointerException = new NullPointerException("예외발생");
        System.out.println(nullPointerException);
        System.out.println(nullPointerException.getMessage());
        try{
            throw nullPointerException;

        }catch(NullPointerException  | IndexOutOfBoundsException e){
            System.out.println("null 처리하세요");
        }
        try {
            throw new CustomException("내가 만든 예외", Map.of("errorId", "1", "message","내가만든오류내용"));
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }

        //throw nullPointerException;

    }
}
