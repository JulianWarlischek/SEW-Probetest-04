//package familytree;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Locale;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PersonListTest {
//
//    PersonList<Person> personList;
//
//    Person p1;
//    Person p2;
//    Person p3;
//    Person p4;
//
//    @BeforeAll
//    static void setUpLocal() {
//        Locale.setDefault(Locale.US);
//    }
//
//    @BeforeEach
//    void setUpVars() {
//        personList = new PersonList<>();
//
//        p1 = new Person("John", "Doe", 30);
//        p2 = new Person("Jane", "Doe", 25);
//        p3 = new Person("Alice", "Smith", 35);
//        p4 = new Person("Bob", "Johnson", 28);
//    }
//
//    @Test
//    void testAddFirst() {
//        boolean result = personList.add(p1);
//
//        assertTrue(result);
//
//        Person p = personList.getFirst();
//
//        assertNotNull(p);
//        assertEquals(p, p1);
//    }
//
//    @Test
//    void testAdd() {
//        boolean result1 = personList.add(p1);
//        boolean result2 = personList.add(p2);
//
//        assertTrue(result1);
//        assertTrue(result2);
//
//        assertEquals(p1, personList.itemAt(1));
//        assertEquals(p2, personList.itemAt(0));
//        assertEquals(2, personList.size());
//    }
//
//    @Test
//    void testAddInvalid() {
//        boolean result = personList.add(null);
//
//        assertFalse(result);
//    }
//
//
//    @Test
//    void testRemove() {
//        personList.add(p1);
//        personList.add(p2);
//        personList.add(p3);
//        personList.add(p4);
//
//        personList.remove(p2);
//
//        int size1 = personList.size();
//
//        assertEquals(3, size1);
//
//        boolean result = personList.remove(p2);
//
//        assertFalse(result);
//
//        personList.remove(p3);
//
//        size1 = personList.size();
//
//        assertEquals(2, size1);
//    }
//
//    @Test
//    void testItemAt(){
//        personList.add(p1);
//        personList.add(p2);
//        personList.add(p3);
//        personList.add(p4);
//
//        assertEquals(p1, personList.itemAt(2));
//        assertEquals(p2, personList.itemAt(0));
//        assertEquals(p3, personList.itemAt(3));
//        assertEquals(p4, personList.itemAt(1));
//
//        assertNull(personList.itemAt(-1));
//        assertNull(personList.itemAt(4));
//    }
//
//    @Test
//    void testToString() {
//        personList.add(p1);
//        personList.add(p2);
//        personList.add(p3);
//        personList.add(p4);
//
//        String expected = String.format("1: %s\n2: %s\n3: %s\n4: %s\n", p2, p4, p1, p3);
//
//        assertEquals(expected, personList.toString());
//    }
//}