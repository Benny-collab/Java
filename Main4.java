import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
    // my code
    Scanner input = new Scanner(System.in);
    int size = 3;
    int array[] = new int[size];
    System.out.println("Insert numbers:");
    for (int i = 0; i < size; i++) {
        array[i] = input.nextInt();
    }
    int min = array[0], max = array[0];
    for (int i = 0; i < size; i++) {
       if (array[i] < min) {
          min = array[i];
        } else if (array[i] > max) {
          max = array[i];
            }
        }
    System.out.println("Мinimum value: " + min);
    System.out.println("Maximum value: " + max);
    int sum = array[0]+array[1]+array[2];
    float average = sum/size;
    System.out.println("Average: " + average);
}
    }