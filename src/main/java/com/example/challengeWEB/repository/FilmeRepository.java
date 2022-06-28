package com.example.challengeWEB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.challengeWEB.model.Filme;

/** Interface que respresenta os repositorios de Filme
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */


@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
