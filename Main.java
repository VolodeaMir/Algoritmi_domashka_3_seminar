// Урок 3. Структуры данных. Связный список.
// Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list:");
        list.printList();

        System.out.println("Reversed list:");
        list.reverse();
        list.printList();
    }
}
