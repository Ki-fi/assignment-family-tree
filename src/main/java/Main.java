public class Main {
    public static void main(String[] args) {

//        Persoon A

        Person a = new Person("Marianne", "Vaessen", "Female", 61);
        a.addChild(new Person("Kiki", "Meekels", "Female", 34));
        a.addChild(new Person("Sjoerd", "Meekels", "Male", 31));

        a.personInformation();
        a.printChildren();


//        Persoon B

        Person b = new Person("Emma", "Clemens", "Female", 84);
        b.addChild(new Person("Marianne", "Vaessen", "Female", 61));
        b.isDeceased = true;

        b.personInformation();
        b.printChildren();


//        Persoon C

        Person c = new Person("Rob", "Meekels", "Male", 59);


//        Person D

        Person d = a.getChildren().get(0);
        d.personInformation();
        d.printChildren();
//        d.addParents(a, c);
        d.printParents();


//        Pet

        Pet cat = new Pet("Moes", 4, "Cat");
        cat.petInformation();

    }
}
