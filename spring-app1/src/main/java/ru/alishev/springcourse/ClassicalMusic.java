package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destraction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
