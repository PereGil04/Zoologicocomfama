package org.example;

public class Animal {

    //ATRIBUTOS
    Integer edad;
    String cantidadHijos;
    String especie;
    Double peso;
    Double estatura;
    String colorPredominante;
    Boolean genero;
    Integer numeroPatas;
    String dieta;
    String clasificacion; //domestico o salvaje
    //METODOS ESPECIALES

    public Animal() {
    }

    public Animal(Integer edad, String cantidadHijos, String especie, Double peso, Double estatura, String colorPredominante, Boolean genero, Integer numeroPatas, String dieta, String clasificacion) {
        this.edad = edad;
        this.cantidadHijos = cantidadHijos;
        this.especie = especie;
        this.peso = peso;
        this.estatura = estatura;
        this.colorPredominante = colorPredominante;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.dieta = dieta;
        this.clasificacion = clasificacion;
    }
    //METODOS ORDINARIOS
}
