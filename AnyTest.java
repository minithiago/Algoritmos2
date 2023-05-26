import static org.junit.jupiter.api.Assertions.*;

class AnyTest {

    @org.junit.jupiter.api.Test
    void digitsDiferents1() {
        int prueba = Any.digitsDiferents(123456);
        assertEquals(6,prueba);
    }
    @org.junit.jupiter.api.Test
    void digitsDiferents2() {
        int prueba = Any.digitsDiferents(12);
        assertEquals(2,prueba);
    }
    @org.junit.jupiter.api.Test
    void digitsDiferents3() {
        int prueba = Any.digitsDiferents(777);
        assertEquals(1,prueba);
    }
    @org.junit.jupiter.api.Test
    void digitsDiferents4() {
        int prueba = Any.digitsDiferents(99909);
        assertEquals(2,prueba);
    }
    @org.junit.jupiter.api.Test
    void digitsDiferents5() {
        int prueba = Any.digitsDiferents(-44);
        assertEquals(1,prueba);
    }
    @org.junit.jupiter.api.Test
    void digitsDiferents6() {
        int prueba = Any.digitsDiferents(-556);
        assertEquals(2,prueba);
    }
}