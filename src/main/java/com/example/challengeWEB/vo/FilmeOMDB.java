package com.example.challengeWEB.vo;

import com.fasterxml.jackson.annotation.JsonProperty;


/** Classe que responsavel por receber os dados de Filme vindo do reponse da APIOMBD
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */
public class FilmeOMDB {
	
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
