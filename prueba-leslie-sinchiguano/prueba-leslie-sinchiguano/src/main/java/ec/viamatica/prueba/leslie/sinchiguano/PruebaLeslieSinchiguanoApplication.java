package ec.viamatica.prueba.leslie.sinchiguano;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaLeslieSinchiguanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaLeslieSinchiguanoApplication.class, args);
	}

	@Bean
	public OpenAPI openAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("Control de garaje Sprint Boot v3.1.2")
						.version("0.0.1")
						.description("Sistema controlador de garage")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
