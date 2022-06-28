package com.example.challengeWEB.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Classe que respresenta objetos de transferencia de dados de Filme
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */
public class FilmeDTO {
	
	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Year")
	private String year;

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
