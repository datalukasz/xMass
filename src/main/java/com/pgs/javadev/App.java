package com.pgs.javadev;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj z jakiego znaku chcesz utworzyc choinke \n");
        String treeChar = scanner.next();
        System.out.println("Podaj jakiej wielkosci ma byc choinka \n");
        int size = scanner.nextInt();
        System.out.println("Podaj w jaki sposob chcesz rysowac choinke:\n");
        System.out.println("1- czubek do gory \n 2-czubek do dolu \n 3-czubek w prawo \n 4-czubek w lewo\n");
        int direction = scanner.nextInt();
        XmasTreeCreator creator = new XmasTreeCreator();

        switch (direction) {
            case 1:
                System.out.println(creator.createXmasTree(treeChar,size, direction));
                break;
            case 2:
                System.out.println(creator.createXmasTree(treeChar,size, direction));
                break;
            case 3:
                System.out.println(creator.createXmasTree(treeChar,size, direction));
                break;
            case 4:
                System.out.println(creator.createXmasTree(treeChar,size, direction));
                break;
            default:
                System.out.println("Cos zrobiles zle");

        }

    }

}
