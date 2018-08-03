package com.luxoft.sanzhar.java8features;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class Lambdas {

    /**
     * В своей простейшей форме лямбда может быть представлена в виде
     * разделенных запятыми списка параметров, символа –> и тела. Например:
     */
    public static void showSimpleLambdaCreation() {
        final List<String> asList = Arrays.asList("a", "b", "c");
        asList.forEach(e -> System.out.println(e));
    }

    /**
     * Обратите внимание, что тип аргумента e определен компилятором. Кроме того
     * вы можете явно указать тип параметра обернув параметр в скобки. Например:
     */
    public static void showSimpleLambdaCreationWithType() {
        Arrays.asList("123", "234", "567").forEach((String e) -> System.out.println(e));
    }

    /**
     * В случае, если тело лямбды более сложное, оно может быть обернуто в
     * фигурные скобки подобно определению обычной функции в Java. Например:
     */
    public static void showSimpleLambdaCreationWithBody() {
        Arrays.asList("123", "234", "567").forEach((String e) -> {
            System.out.println(e);
            System.out.println("2nd line of block: " + e);
        });
    }

    /**
     * Лямбда может ссылаться на члены класса и локальные переменные (неявно
     * делает обращение эффективным независимо от того обращается к final полю
     * или нет). Например, эти 2 фрагмента эквиваленты:
     */
    String separator = ",";

    public void showSimpleLambdaCreationUseField() {
        Arrays.asList("1", "2", "3").forEach(e -> {
            System.out.println(e + separator);
            //separator += "asas";
        }
        );
    }

    public static void showLambdaReturn() {
        List<String> list = Arrays.asList("a", "c", "b");
        list.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println("list = " + list);

        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));

    }
}
