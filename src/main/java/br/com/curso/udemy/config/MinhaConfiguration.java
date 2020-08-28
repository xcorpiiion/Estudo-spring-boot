package br.com.curso.udemy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*Quando eu coloco essa anotação, ela passa a ser scaneada pelo Spring e ele reconhece essa classe como uma classe de configuração*/
@Configuration
/*
 * Essa anotação me permite que eu escolha o perfil com o qual eu quero
 * trabalhar, no caso eu escolhi o perfil dev que esta no
 * application.propierties (o nome "dev" foi pego pq depois do application tem
 * um "-" depois desse "-" está o nome do profile Eu posso usar esse profile em
 * todas as classes de configurações)
 */
@Profile(value = "dev")
public class MinhaConfiguration {

	/*
	 * Todas as configurações são feitas dentro de um @Bean, com ele eu posso
	 * colocar qualquer tipo de configuração que eu deseje, por exemplo eu posso
	 * fazer uma conexão com a minha base de dados, consigurações de email e etc...
	 */
	/* Eu posso da nomes para os meus @Beans através do parametro name */
	@Bean(name = "applicationName")
	public String nomeAplicacao() {
		return "Sistema de vendas";
	}
}
