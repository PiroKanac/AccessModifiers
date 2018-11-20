package com.static_;

public class StaticTest {
    private static int numInstances = 0;     // must be static in order to work Main(10,11)
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {      //if we use static here in main can do Main(16 - 23)
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
