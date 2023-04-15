package org.algo.seminar04;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Алгоритмы и структуры данных");
        System.out.println("Seminar04");
        System.out.println("*Примечание:");
        System.out.println("Считаю, что в методичке перепутаны левый и правый малые повороты");
        System.out.println("Поэтому, при красной ноде справа, делаю левый поворот");
        System.out.println("при наличии двух левых красных нод, делаю правый поворот");

        execute();
        
        System.out.println("\n#");
    }

    private static void execute() {
        var tree = new Tree<Integer>();

        tree.add(10);
        System.out.println(tree);
        tree.add(2);
        System.out.println(tree);
        tree.add(20);
        System.out.println(tree);
        tree.add(19);
        System.out.println(tree);
        tree.add(20);
        System.out.println(tree);
        tree.add(20);
        System.out.println(tree);

        tree.add(0);
        System.out.println(tree);
        tree.add(1);
        System.out.println(tree);

        for (int i = 0; i < 100; i++) {
            tree.add(i);
        }
        System.out.println(tree);
    }

}
