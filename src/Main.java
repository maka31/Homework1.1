public class Main {

    public static void main(String[] args) {

        String worldIsMine;

        final int NUM = -20;

        String word = "Degrees";

        worldIsMine = NUM + " " + word;

        System.out.println(worldIsMine + " " + NUM + " " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
    }
}
