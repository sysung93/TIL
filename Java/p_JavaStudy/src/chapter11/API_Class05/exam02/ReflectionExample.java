package chapter11.API_Class05.exam02;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.*;

/*public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("chapter11.API_Class05.exam02.car");

        System.out.println("[클래스 이름]");
        System.out.println(clazz.getName());
        System.out.println();

        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructor();
        for(Constructor constructor : constructors) {
           System.out.print(constructor.getName() + "(");
           Class[] parameters = constructors.getParameterTypes();
           for (int i = 0; i < parameters.length; i++) {
               System.out.print(parameters[i].getName());
               if (i < (parameters.length - 1)) {
                   System.out.print(",");
               }
            }
           System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] field = clazz.getDeclaredFields();
        for (Field field : field) {
            System.out.println(field.getType().getSimpleName() + "" + field.getName);
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(methods.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            printParameters(Parameters);
            System.out.println();
        }
    }
    private static void printParameters(Class[] parameters) {
        for(int i = 0; i < parameters.length; i++) {
            System.out.println(parameters[i].getName());
            if(i < (parameters.length - 1)){
                System.out.println(",");
            }
        }
    }
}*/

