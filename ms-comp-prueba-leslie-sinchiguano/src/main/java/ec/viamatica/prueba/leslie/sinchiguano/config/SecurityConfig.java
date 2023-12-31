package ec.viamatica.prueba.leslie.sinchiguano.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity
				.csrf(csrf ->
						csrf
						.disable())
				.authorizeHttpRequests(authRequest ->
					authRequest
						.requestMatchers("/auth/**").permitAll()
						.anyRequest().authenticated()
					)
				.formLogin(null)
				.build();
	}
}
