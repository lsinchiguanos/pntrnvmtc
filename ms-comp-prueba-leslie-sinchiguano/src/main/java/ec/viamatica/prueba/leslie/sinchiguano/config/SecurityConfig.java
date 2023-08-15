package ec.viamatica.prueba.leslie.sinchiguano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity
				.csrf(null)
				.authorizeHttpRequests(auth -> {
					auth.requestMatchers("/").permitAll();
					auth.anyRequest().authenticated();
				})
				.sessionManagement(session -> {
					session.sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
				})
				.httpBasic(null)
				.and()				
				.build();
	}
	
}
