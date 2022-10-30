public class Main {

    public static void main(String[] args) {
        Person sarah = new Person("Sarah ", 30);
        if (sarah.isAdult()) {
            System.out.println("иди в бар");
        } else {
            System.out.println("иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(-20);

    }
}