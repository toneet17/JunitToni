package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class ProvaCicleVidaActivitats {
    /*
    Afirma que dos objetos no son iguales, si lo son devuelve error
     */
    @Test
    void assertNotEqualsPrueba() {
        Integer null1 = 1;
        Integer null2 = null;
        assertNotEquals(null1,null2);
    }

    /*
    Afirma que una condicion es verdadera, si no lo es devuelve error
     */
    @Test
    void assertTruePrueba(){
        assertTrue(2>1);
    }
    /*
    Afirma que una condicion es falsa, si no lo es devuelve error
     */
    @Test
    void assertFalsePrueba(){
        assertFalse(1>2);
    }
    /*
  Afirma que un objeto es nulo, si no lo es devuelve error
   */
    @Test
    void assertNullPrueba(){
        String null1 = null;
        assertNull(null1);
    }
    /*
      Afirma que un objeto no es nulo, si lo es devuelve error
       */
    @Test
    void assertNotNullPrueba(){
        String notNull1 = "hola";
        assertNotNull(notNull1);
    }
    /*
    Afirman que dos objetos se refieren al mismo objeto, si no son iguales
    devuelve error
     */
    @Test
    void assertSamePrueba(){
        String mensaje1 = "hola";
        String mensaje2 = mensaje1;
        assertSame(mensaje1,mensaje2);
    }
    /*
    Afirman que dos objetos no se refieren al mismo objeto,
    si son iguales devuelve error
     */
    @Test
    void assertNotSamePrueba(){
        String mensaje1 = "hola";
        String mensaje2 = "holaa";
        String mensaje3 = mensaje2;
        assertNotSame(mensaje1,mensaje3);
    }
    /*
    Afirman que la ejecucion lanza una excepcion,
    si no se lanza ninguna excepcion, habrá fail
     */
    @Test
    void assertThrowsPrueba(){
        NumberFormatException thrown = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("fdhfhfhsfd");
        });

    }
    /*
    Es lo inverso de assumeTrue, afirma que una condicion es falsa, si no lo es
    lanza un error
     */
    @Test
    void assumeFalsePrueba(){
        boolean falso = false;
        assumeFalse(falso);
    }
    /*
    Afirma que la condición proporcionada es válida,
    si no lo es devuelve un error
     */
    @Test
    void assumingThatPrueba(){
        boolean bool = true;
        assumingThat(!bool, () -> System.out.println("uD83DuDC4C"));
    }
}