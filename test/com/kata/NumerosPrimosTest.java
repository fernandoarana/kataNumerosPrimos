package com.kata;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kata.NumerosPrimos;


public class NumerosPrimosTest {

    NumerosPrimos numerosPrimos;

    @Before
    public void setUp() throws Exception {
        numerosPrimos = new NumerosPrimos();
    }

    @Test
    public void dadoUnNumeroPrimoSinMultiplosRegresaElMismo() {
        List<Integer> primos = numerosPrimos.obtenerNumerosPrimos(2);
        assertEquals(primos.size(), 1);
        assertEquals(primos.get(0).intValue(), 2);
    }
}
