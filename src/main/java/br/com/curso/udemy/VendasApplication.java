package br.com.curso.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*Para uma classe ser gerenciada pelo Spring ela precisa conter uma das anotações do String
 * @Configuration -> elas são as classes de controller, onde informamos as regras do nosso sistema e para um metodo da classe que contenha a 
 * anotação @Configuration ser um metodo gerenciado pelo Spring ele precisa ter a anotação @Bean*/

/*@Component -> ele é uma anotação que basicamente vai ter as anotação @Controller @Repository e @Service
 * caso a nossa classe não se enquadre em nenhum desses modelos, basta colocar o @Component para ele ser gerenciado pelo Spring*/

@SpringBootApplication
public class VendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
