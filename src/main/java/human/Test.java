package human;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person P2 = new Person();
        P2.setName("Paola");
        p1.setName("darina");
        p1.setFood("pizza");
        P2.setFood("chocolate");
        System.out.println(p1.getName() +" eats " + p1.getFood());
        System.out.println(P2.getName() +" eats " + P2.getFood());

    }

}
