public class Main {

    public static void main(String[] args) {

        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah ", 30);
        if (personService.isAdult(sarah)) {
            System.out.println("иди в бар");
        } else {
            System.out.println("иди в школу");
        }
        System.out.println(sarah);
        sarah.increaseAge(20);

    }
}