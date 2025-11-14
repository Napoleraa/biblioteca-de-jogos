package br.com.bibliotecajogos.bibliotecajogos.repository;

import br.com.bibliotecajogos.bibliotecajogos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}