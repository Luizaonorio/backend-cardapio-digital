package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

// define a interface para a gente acessar o banco de dados

// só extende o JpaRepository, e herda tudo, só passar os tipos
// (a entidade) e (identificador unico)
public interface FoodRepository extends JpaRepository<Food, Long> {

}
