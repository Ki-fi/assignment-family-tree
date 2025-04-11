import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    Boolean hasMiddleName;
    String lastName;
    String sex;
    int age;
    String mother;
    String father;
    List<Pet> pets;
    boolean isDeceased;
    List<Person> children;
    List<Person> parents;

    public Person() {
    }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        hasMiddleName = false;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        isDeceased = false;
        this.children = new ArrayList<>();
    }

    public void personInformation(){
        System.out.println(name + " " + lastName + ", " + sex + ", " + displayAge());
    }

//    public String displayName(){
//        return hasMiddleName ? "-" : String.valueOf(age);
//    }

    public String displayAge(){
        if (isDeceased) {
            return "deceased";
        } else {
            return String.valueOf(age);
        }
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void printChildren() {
        if (children.isEmpty()) {
            System.out.println(name + " has no children.");
        } else {
            System.out.println(name + "'s children: ");
            for (int i = 0; i < children.size(); i++) {
                Person child = children.get(i);
                System.out.println("- " + child.name);
            }
        }
    }

    public void addParents(Person mom, Person dad) {
        parents.add(mom);
        parents.add(dad);
    }

    public void printParents() {
        if (parents.isEmpty()) {
            System.out.println("Parents unknown");
        } else {
            System.out.println(name + "'s parents: ");
            for (int i = 0; i < parents.size(); i++) {
                Person parent = parents.get(i);
                System.out.println("- " + parent.name);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setDeceased(boolean deceased) {
        this.isDeceased = deceased;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Person> setParents() {
        return parents;
    }
}
