import java.util.Scanner;

public class AddElements {
  public static void main(String[] args) {
    int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int number = sc.nextInt();
    System.out.print("Enter the location insertion:");
    int index = sc.nextInt();
    if (index < 1 | index >= array.length) {
      System.out.println("Not insert elements in the array");
    } else {
      for (int i = array.length - 1; i > index; i--) {
        array[i] = array[i - 1];
      }
      array[index] = number;
      System.out.printf("%-20s%s", "Elements in array: ", "");
      for (int i : array) {
        System.out.print(i + "\t");
      }
    }
  }
}