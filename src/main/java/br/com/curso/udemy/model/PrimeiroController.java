package br.com.curso.udemy.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/controller")
public class PrimeiroController {
	
	@Autowired
	/* Essa anotação pega o nome do meu @Bean e injeta o mesmo dentro da variavel */
	@Qualifier("applicationName")
	private String applicationName;
	
	/*Com essa anotação eu consigo pegar o valor do meu application.properties e coloca-lo dentro da minha variavel string*/
	@Value("${application.name}")
	private String nomeAplicacao;

	@GetMapping("/hello")
	public String helloWorld() {
		System.out.println(nomeAplicacao);
		return applicationName;
	}
	
}
