package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> /*dizer primeiro quem é a entidade que está sendo
persistida, e o segundo item é o tipo do ID que foi definido o banco de dados*/{

}
