package com.example.challengeWEB.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.challengeWEB.vo.FilmeOMDB;

/** interface que define metodos conexões com a api do OMDB
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 * @since 28/08/2022
 */
@FeignClient(value="ombdFilmes", url = "https://www.omdbapi.com/")
public interface FilmeClientOMDBFeign {

	@RequestMapping(method = RequestMethod.GET)
	FilmeOMDB getFilme(@RequestParam("t") String tema, @RequestParam("apiKey") String key);

}
