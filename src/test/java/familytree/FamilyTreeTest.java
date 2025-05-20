//package familytree;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//class FamilyTreeTest {
//    FamilyTree<String, PersonList<Person>> familyTree;
//
//    PersonList<Person> personList;
//
//    Person p1;
//    Person p2;
//    Person p3;
//    Person p4;
//
//    @BeforeEach
//    void setUpVars() {
//        ArrayList<Family<String, PersonList<Person>>> families = new ArrayList<>();
//
//        p1 = new Person("John", "Doe", 30);
//        p2 = new Person("Jane", "Doe", 25);
//        p3 = new Person("Alice", "Smith", 35);
//        p4 = new Person("Bob", "Johnson", 28);
//
//        personList = new PersonList<>();
//        personList.add(p1);
//        personList.add(p2);
//
//
//        families.add(new Family<>("Doe", personList));
//
//
//        familyTree = new FamilyTree<>(families);
//    }
//
//    @Test
//    void testToString() {
//        String expected = """
//                Doe
//                -------------
//                1: Jane Doe, 25
//                2: John Doe, 30\n
//                """;
//
//        assertEquals(expected, familyTree.toString());
//    }
//}