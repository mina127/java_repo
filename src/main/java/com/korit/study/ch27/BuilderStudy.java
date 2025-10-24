package com.korit.study.ch27;

public class BuilderStudy
{
    private String value1;
    private String value2;
    `


    public static BuilderStudyBuilder builder(){
        return new BuilderStudyBuilder();
    }
    public static class BuilderStudyBuilder{}
    public void value1(String value1){
        this.value1 = value1;
    }
    public BuilderStudyBuilder value2(Integer value2){
        this.value1 = value1;
    }
    public BuilderStudy build(){
        return new BuilderStudy(value1,value2);
    }
}
