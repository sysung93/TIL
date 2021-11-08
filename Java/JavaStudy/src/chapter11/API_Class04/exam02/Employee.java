package chapter11.API_Class04.exam02;

import java.sql.SQLOutput;

public class Employee {
    public int eno;

    public Employee(int eno) {
        this.eno = eno;
        System.out.println("employee(" + eno + ")이 메모리에 생성됨");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("employee(" + eno + ")이 메모리에서 제거됨");
    }
}
