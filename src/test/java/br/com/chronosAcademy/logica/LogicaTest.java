package br.com.chronosAcademy.logica;

//Aula 03 - Lógica e Testes Unitários


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {
    @Test
    @DisplayName("Terreno valor 101 resultado 'Terreno grande'")
    public void validaTerrenoGrande(){
        Logica logica = new Logica();

        assertEquals("Terreno grande", logica.getTipoTerreno(101));
    }

    @Test
    @DisplayName("Terreno valor 100 resultado 'Terreno pequeno'")
    public void validaTerrenoPequeno(){
        Logica logica = new Logica();

        assertEquals("Terreno pequeno", logica.getTipoTerreno(100));
    }
}