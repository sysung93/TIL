package chapter14.rambda04.exam02_local_variable;

import chapter14.rambda04.exam01_field.MyFunctionalInterface;

public class UsingLocalVariable {
    void method(int arg){
        int localVar = 40;

        MyFunctionalInterface fi = () -> {
            System.out.println("arg: " + arg);
            System.out.println("localVar: " + localVar);
        };
        fi.method();
    }
}
