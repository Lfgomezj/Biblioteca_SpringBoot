package com.example.Biblioteca.Entidades;

import jakarta.persistence.*;

@Entity /* indica que la clase es una entidad. */
/*
 * Una entidad es la representación de información que nosotros necesitamos en
 * nuestra aplicación.
 * Esta entidad podría ser un usuario, un producto o cualquier dato que nuestra
 * aplicación necesita
 */

@Table(name = "Autor") /* indica que la clase es una tabla(similar a una tabla de excel). */
public class Autor {

    @Id /* indica que la variable es una id(similar a una tabla de excel). */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* indica el valor de la variable(codigo,numero). */
    private Integer id;/* indica que la variable es int(numero) y privado. */

    @Column(name = "Nombre", unique = true) /*
                                             * nos permitirá definir aspectos sobre las columnas de la base de datos de
                                             * la base de datos como lo es el nombre, la longitud, constrains, etc.
                                             */
    private String nombre; /* indica que la variable es String(letras) y privado. */

    @Column(name = "Apellidoo") /* nos permitirá definir aspectos sobre las columnas */
    private String apellido;/* indica que la variable es String(letras) y privado. */
    @Column(name = "Pseudonimo") /* nos permitirá definir aspectos sobre las columnas */
    private String pseudonimo;/* indica que la variable es String(letras) y privado. */

    @Column(name = "Nacionalidad") /* nos permitirá definir aspectos sobre las columnas */
    private String nacionalidad;/* indica que la variable es String(letras) y privado. */
    @Column(name = "Email") /* nos permitirá definir aspectos sobre las columnas */
    private String email;/* indica que la variable es String(letras) y privado. */

    /* Constructor lleno */

    public Autor(Integer id, String nombre, String apellido, String pseudonimo, String nacionalidad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pseudonimo = pseudonimo;
        this.nacionalidad = nacionalidad;
        this.email = email;

    }
    /* Constructor vacio */

    public Autor() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
