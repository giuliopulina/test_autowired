package com.example.demo;

public class BeanToTest {

    private final AutowiredDependency autowiredDependency;

    public BeanToTest(AutowiredDependency autowiredDependency) {
        this.autowiredDependency = autowiredDependency;
    }

    String doSomething() {
        return "1" + autowiredDependency.generate();
    }
}
