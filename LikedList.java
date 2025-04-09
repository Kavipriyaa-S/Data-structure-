import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListInsertion {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial characters for the list:");
        int n = scanner.nextInt();
        System.out.println("Enter the characters:");
        for (int i = 0; i < n; i++) {
            char ch = scanner.next().charAt(0);
            list.add(ch);
        }
        System.out.println("Choose an option:");
        System.out.println("1. Insert at the head");
        System.out.println("2. Insert at the tail");
        System.out.println("3. Insert at the middle");
        int choice = scanner.nextInt();
        System.out.println("Enter the character to insert:");
        char newChar = scanner.next().charAt(0);
        switch (choice) {
            case 1 -> list.addFirst(newChar);
            case 2 -> list.addLast(newChar);
            case 3 -> {
                int middleIndex = list.size() / 2;
                list.add(middleIndex, newChar);
            }
            default -> System.out.println("Invalid choice");
        }
        System.out.println("Updated LinkedList: " + list);
        scanner.close();
    }
}