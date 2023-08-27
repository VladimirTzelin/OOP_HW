package HW4;

import HW4.gb.list.GBLinkedList;
import HW4.gb.list.GBNode;

public class Main {
    public static void main(String[] args) {
//      Первое задание
        GBLinkedList<Integer> integers = new GBLinkedList<>(10);      
        integers
                .add(20)
                .add(43)
                .add(40)
                .add(2, 49);
        System.out.println("\nФормирование списка значений integer:\n " + integers);
        integers.addFirst(5);
        integers.addLast(23);
        System.out.println("Добавление значений в начало и конец списка:\n " + integers);
        integers.remove(3);
        System.out.println("Удаление третьего значения списка:\n " + integers);
        integers.removeFirst();
        System.out.println("Удаление первого значения списка:\n " + integers);
        integers.removeLast();
        System.out.println("Удаление последнего значения списка:\n " + integers);

        integers.update(2, 30);
        System.out.println("Замена второго значения списка:\n " + integers);

        System.out.println("\nCurrent size: " + integers.size());
        System.out.println("El at 0 index: " + integers.get(0));

        for (Integer el : integers) System.out.println(el);
    }
}

/* Вывод результатов:

Формирование списка значений integer: 
  GBLinkedList Size: 4 {10, 20, 49, 43, 40}
Добавление значений в начало и конец списка:
  GBLinkedList Size: 6 {5, 10, 20, 49, 43, 40, 23}
Удаление третьего значение из списка:
  GBLinkedList Size: 5 {5, 10, 20, 43, 40, 23}
Удаление первого значения списка: 
  GBLinkedList Size: 4 {10, 20, 43, 40, 23}
Удаление последнего значения из списка: 
  GBLinkedList Size: 3 {10, 20, 43, 40}
Замена второго значения списка: 
  GBLinkedList Size: 3 {10, 20, 30, 40}

Current size: 3
El at 0 index: 10
10
20
30
40*/