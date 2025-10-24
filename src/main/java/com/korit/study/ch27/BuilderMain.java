package com.korit.study.ch27;

public class BuilderMain {

    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);
        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value2(32)
                .build();
        ComputerBuilder computerBuilder = Computer.builder();
        computerBuilder.setCpu("i7");
        computerBuilder.setRam(8);

        Computer computer = ComputerBuilder.build();


        ComputerBuilder computerBuilder2 = Computer.builder().cpu("i5").ram(16);
        computerBuilder.setCpu("i7");

        ComputerBuilder computer3 = Computer.builder().cpu("i5").ram(16);
        computerBuilder.setRam(8);




    }

}
