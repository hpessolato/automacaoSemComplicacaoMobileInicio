package br.com.chronosAcademy.logica;

//Aula 3 - Lógica e Testes Unitários

public class Logica {

    public String getTipoTerreno(int terreno){
        if (terreno > 100){
            return "Terreno grande";
        }
            return "Terreno pequeno";
    }
}
