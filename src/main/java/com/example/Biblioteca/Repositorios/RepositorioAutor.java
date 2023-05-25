package com.example.Biblioteca.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Biblioteca.Entidades.Autor;

@Repository /* Indica que la clase es repositorio */
/*
 * componente encargado de resolver el acceso a los datos de nuestro
 * micro-servicio.
 */
public interface RepositorioAutor extends JpaRepository<Autor, Integer> /*
												 * llama la clase repositorio de las
												 * dependencias JPA (programacion prediseñada)
												 */ {
}
