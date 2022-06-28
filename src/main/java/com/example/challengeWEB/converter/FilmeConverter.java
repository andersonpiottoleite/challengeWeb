package com.example.challengeWEB.converter;

import org.springframework.stereotype.Component;

import com.example.challengeWEB.dto.FilmeDTO;
import com.example.challengeWEB.model.Filme;
import com.example.challengeWEB.vo.FilmeVO;

/** Classe responavel por efetuar conversões entre classes de modelo, DTO's e VO's
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */
@Component
public class FilmeConverter {
	
	public Filme converteParaFilme(FilmeDTO filmeDTO) {
		Filme filme = new Filme();
		filme.setTitle(filmeDTO.getTitle());
		filme.setYear(filmeDTO.getYear());
		return filme;
	}
	
	public FilmeVO converteParaFilmeVO(Filme filme) {
		FilmeVO filmeVO = new FilmeVO();
		filmeVO.setId(filme.getId());
		filmeVO.setTitle(filme.getTitle());
		filmeVO.setYear(filme.getYear());
		return filmeVO;
	}

}
