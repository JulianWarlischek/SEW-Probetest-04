//package familytree;
//
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class FamilyTest {
//
//    Family<String, PersonList<Person>> family;
//
//
//    @BeforeEach
//    void setUp() {
//        family = new Family<>("Doe", new PersonList<>());
//    }
//
//    @Test
//    void testFamilyConstructor() {
//        assertNotNull(family);
//        assertEquals("Doe", family.getFamilyName());
//        assertNotNull(family.getFamilyList());
//    }
//
//    @Test
//    void testGetFamilyName() {
//        assertEquals("Doe", family.getFamilyName());
//    }
//
//    @Test
//    void testGetFamilyList() {
//        assertNotNull(family.getFamilyList());
//        assertTrue(family.getFamilyList().isEmpty());
//    }
//}