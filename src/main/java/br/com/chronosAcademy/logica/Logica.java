package br.com.chronosAcademy.logica;

//Aula 03 - Lógica e Testes Unitários

public class Logica {

    public String getTipoTerreno(int terreno){
        if (terreno > 100){
            return "Terreno grande";
        }
            return "Terreno pequeno";
    }
}
