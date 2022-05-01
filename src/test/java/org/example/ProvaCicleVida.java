package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProvaCicleVida {

    public ProvaCicleVida(){
        System.out.println("--- Constructor ---");
    }

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll => setup(): S'executa ABANS de començar les proves");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll => tear(): S'executa al FINAL de totes les proves");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach => setupThis(): S'executa ABANS de cada PROVA");
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach => tearThis(): S'executa DESPRES de cada PROVA");
    }

    /* Apartat 7
    @Test
    void testOne(){
        int resultatEsperat = 3;
        assertEquals(resultatEsperat, 1+2);
        System.out.println("====== TEST ONE EXECUTAT ======");
    }
     */
    /* Apartat 8
    @Test
    void testOne(){
        boolean isServerUp = false;
        assumeTrue(isServerUp,"Ignoring test, server is down!!!");

        int resultEsperat = 3;
        assertEquals(resultEsperat,1+2);

        System.out.println("====== TEST ONE EXECUTAT ======");
    }
     */

    /* Apartat 6
    @Test
    void testOne(){
        System.out.println("====== TEST ONE EXECUTAT");
        fail("testOne ha FALLAT, encara no està acabat");

    }
     */
    @RepeatedTest(3)
    void testOne(){
        boolean isServerUp = Math.random() >= 0.5;
        assumeTrue(isServerUp,"Ignoring test, server is down!!!");

        int resultEsperat = 3;
        assertEquals(resultEsperat,1+2);

        System.out.println("====== TEST ONE EXECUTAT ======");
    }
    @RepeatedTest(value = 2, name = "--> {currentRepetition}/{totalRepetitions}")
    void testTwo(){
        int resultEsperat = 3;
        assertEquals(resultEsperat, 1+2);
        System.out.println("====== TEST TWO EXECUTAT ======");
    }
/* Apartat 7
@Test
    void testTwo(){
        int resultatEsperat = 2;
        assertEquals(resultatEsperat, 1+2);
        System.out.println("====== TEST TWO EXECUTAT ======");
    }
 */


}
