package com.example.challengeWEB.vo;

import org.springframework.hateoas.RepresentationModel;


/** Classe que respresenta objetos de visualização de dados de Filme
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */
public class FilmeVO extends RepresentationModel<FilmeVO>{
	
	private Long id;

	private String title;

	private String year;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


}
