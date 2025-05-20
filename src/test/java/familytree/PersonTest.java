//package familytree;
//
//import org.junit.jupiter.api.*;
//
//import java.util.Locale;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PersonTest {
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
//        p1 = new Person("John", "Doe", 30);
//        p2 = new Person("Jane", "Doe", 25);
//        p3 = new Person("Alice", "Smith", 35);
//        p4 = new Person("Bob", "Johnson", 28);
//    }
//
//    @Test
//    void testPersonConstructor() {
//        assertNotNull(p1);
//        assertEquals("John", p1.getFirstName());
//        assertEquals("Doe", p1.getLastName());
//        assertEquals(30, p1.getAge());
//
//        assertNotNull(p2);
//        assertEquals("Jane", p2.getFirstName());
//        assertEquals("Doe", p2.getLastName());
//        assertEquals(25, p2.getAge());
//
//        assertNotNull(p3);
//        assertEquals("Alice", p3.getFirstName());
//        assertEquals("Smith", p3.getLastName());
//        assertEquals(35, p3.getAge());
//    }
//
//    @Test
//    void testPersonToString() {
//        assertEquals("John Doe, 30", p1.toString());
//        assertEquals("Jane Doe, 25", p2.toString());
//        assertEquals("Alice Smith, 35", p3.toString());
//    }
//
//    @Test
//    void testPersonEquality() {
//        Person p5 = new Person("John", "Doe", 30);
//        Person p6 = new Person("Jane", "Doe", 25);
//
//        assertEquals(p1, p5);
//        assertNotEquals(p1, p2);
//        assertNotEquals(p2, p3);
//
//        assertNotEquals(p1, null);
//        assertNotEquals(p1, new Object());
//    }
//
//    @Test
//    void testPersonHashCode() {
//        Person p5 = new Person("John", "Doe", 30);
//        Person p6 = new Person("Jane", "Doe", 25);
//
//        assertEquals(p1.hashCode(), p5.hashCode());
//        assertNotEquals(p1.hashCode(), p2.hashCode());
//        assertNotEquals(p2.hashCode(), p3.hashCode());
//    }
//
//    @Test
//    void testPersonSetAge() {
//        p1.setAge(40);
//        assertEquals(40, p1.getAge());
//
//        p1.setAge(-5);
//        assertEquals(0, p1.getAge());
//
//        p2.setAge(25);
//        assertEquals(25, p2.getAge());
//    }
//
//    @Test
//    void testPersonCompareTo() {
//        assertTrue(p1.compareTo(p2) > 0);
//        assertTrue(p2.compareTo(p1) < 0);
//        assertTrue(p1.compareTo(p3) < 0);
//        assertTrue(p3.compareTo(p1) > 0);
//
//        assertEquals(0, p1.compareTo(new Person("John", "Doe", 30)));
//    }
//}