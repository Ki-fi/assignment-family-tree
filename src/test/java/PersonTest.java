import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void checkIfPersonInformationIsCorrect() {
//        Given
        String expected = "Pietje Puk, Male, 66";
        Person human = new Person("Pietje", "Puk", "Male", 66);

//        When
        String result = human.personInformation();

//        Then
        assertEquals(expected, result);
    }

    @Test
    public void checkIfDisplayAgeReturnsDeceasedWhenDeceased() {
//        Given
        String expected = "Pietje Puk, Male, deceased";
        Person human = new Person("Pietje", "Puk", "Male", 66);
        human.isDeceased = true;

//        When
        String result = human.personInformation();

//        Then
        assertEquals(expected, result);
    }

    @Test
    public void checkIfChildrenAreAddedSuccessfully() {
//        Given
        String expected = "Pietje's children:- Klaas";
        Person human1 = new Person("Pietje", "Puk", "Male", 66);
        Person human2 = new Person("Klaas", "Puk", "Male", 33);

//        When
        human1.addChild(human2);
        String result = human1.printChildren();

//        Then
        assertEquals(expected, result);
    }
//
//    @Test
//    public void checkIfChildrenNamesAreDisplayedCorrectly() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
//    @Test
//    public void checkIfParentsAreAddedSuccessfully() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
//    @Test
//    public void checkIfParentNamesAreDisplayedCorrectly() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
//    @Test
//    public void checkIfSiblingsAreAddedSuccessfully() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
//    @Test
//    public void checkIfSiblingNamesAreDisplayedCorrectly() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
//    @Test
//    public void checkIfPetsAreAddedSuccessfully() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
//    @Test
//    public void checkIfGrandkidsAreAddedSuccessfully() {
////        Given
//
////        When
//
////        Then
//        assertEquals(a, result);
//    }
//
}