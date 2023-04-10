package com.example.cardapio.food;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

// representa uma tabela no banco de dados
// mapear todas as colunas da tabela em formato de obj
@Table(name = "foods") // nome da tabela no DB
@Entity(name = "foods")
@Getter // gera todos os metodos de get
@NoArgsConstructor  // declara um contructor que não recebe nenhum elemento
@AllArgsConstructor // declara um contructor que recebe todos os elementos
@EqualsAndHashCode(of = "id") // declaração unica do food
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // representa o id e vai ser gerada automaticamente
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
}
