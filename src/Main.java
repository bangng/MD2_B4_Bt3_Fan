import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan();
        System.out.println(Fan1.toString());
        Fan1.setSpeed(3);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
        Fan2.setSpeed(2);
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        Fan2.setOn(false);
        System.out.println(Fan2.toString());



    }
}
