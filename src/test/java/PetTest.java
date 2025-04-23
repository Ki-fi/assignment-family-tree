import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    public void checkIfPetInformationIsCorrect() {
//        Given
        String a = "cat named Bizzy, 8";
        Pet animal = new Pet("Bizzy", 8, "cat");

//        When
        String result = animal.petInformation();

//        Then
        assertEquals(a, result);
    }

}