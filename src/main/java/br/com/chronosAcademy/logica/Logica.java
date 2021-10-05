package br.com.chronosAcademy.logica;

//Aula 03 - Logica e Testes Unitarios

public class Logica {

    public String getTipoTerreno(int terreno){
        if (terreno > 100){
            return "Terreno grande";
        }
            return "Terreno pequeno";
    }
}
