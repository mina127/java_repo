package com.korit.study.ch27;

public class ComputerBuilder {
    private static String cpu;
    private static int ram;

    public ComputerBuilder(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public ComputerBuilder() {

    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public ComputerBuilder ram(int ram) {
        this.ram = ram;
        return this;
    }

    public static Computer build() {
        return new Computer(cpu,ram);
    }
    public static ComputerBuilder builder() {
        return  new ComputerBuilder();
    }
}
