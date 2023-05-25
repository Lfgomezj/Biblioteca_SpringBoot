package com.example.Biblioteca.Entidades;


import jakarta.persistence.*;

@Entity/* indica que la clase es una entidad. */
/*
 * Una entidad es la representación de información que nosotros necesitamos en
 * nuestra aplicación.
 * Esta entidad podría ser un usuario, un producto o cualquier dato que nuestra
 * aplicación necesita
 */
@Table(name ="Editorial")/* indica que la clase es una tabla(similar a una tabla de excel). */
public class Editorial {

    @Id/* indica que la variable es una id(similar a una tabla de excel). */
    @GeneratedValue(strategy = GenerationType.IDENTITY)/* indica el valor de la variable(codigo,numero). */
    private Integer id;/* indica que la variable es int(numero) y privado. */
    @Column(name = "Nombre", unique =true)

    private String nombre;
    @Column(name = "Descripcion")
    private String description;


    /* Constructor lleno */
    public Editorial(Integer id, String nombre, String description) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
    }
    /* Constructor vacio */
    public Editorial() {
    }

    /* setters(asignadores) y getters(buscadores) */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
