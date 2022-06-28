package com.example.challengeWEB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.challengeWEB.client.FilmeClientOMDBFeign;
import com.example.challengeWEB.converter.FilmeConverter;
import com.example.challengeWEB.dto.FilmeDTO;
import com.example.challengeWEB.model.Filme;
import com.example.challengeWEB.repository.FilmeRepository;
import com.example.challengeWEB.vo.FilmeOMDB;

/** Classe que respresenta os serviços de Filme
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */
@Service
public class FilmeService {

	@Value("${imdb.apikey}")
	private String apiKey;

	@Autowired
	private FilmeClientOMDBFeign filmeClientFeign;
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private FilmeConverter filmeConverter;

	public FilmeOMDB getFilme(String tema) {
		return filmeClientFeign.getFilme(tema, apiKey);
	}
	
	public Filme save(FilmeDTO filmeDTO) {
		Filme filme = filmeConverter.converteParaFilme(filmeDTO);
		return filmeRepository.save(filme);
	}
	
	public Filme getById(Long id) {
		return filmeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Filme não encontrado para esse id"));
	}
}