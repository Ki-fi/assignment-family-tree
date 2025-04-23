public class Main {
    public static void main(String[] args) {

//        Family members

        Person kiki = new Person("Kiki", "Meekels", "Female", 34);
        Person marianne = new Person("Marianne", "Vaessen", "Female", 61);
        Person emma = new Person("Emma", "Clemens", "Female", 84);
        Person rob = new Person("Rob", "Meekels", "Male", 59);
        Person sjoerd = new Person("Sjoerd", "Meekels", "Male", 31);
        Pet moes = new Pet("Moes", 4, "Cat");



//        Marianne

        marianne.addChild(kiki);
        marianne.addChild(sjoerd);

        marianne.personInformation();
        marianne.printChildren();
        marianne.hasGrandKids(marianne);


//        Emma

        emma.addChild(marianne);
        emma.isDeceased = true;

        emma.personInformation();
        emma.printChildren();

        emma.hasGrandKids(emma);


//        Kiki

        kiki.personInformation();
        kiki.printChildren();

        kiki.addParents(marianne, rob);
        kiki.printParents();

        kiki.addSibling(sjoerd);
        kiki.printSiblings();

        kiki.addPet(moes);


//        Moes

        moes.petInformation();

    }
}
