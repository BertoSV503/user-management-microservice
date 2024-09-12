package com.registro.usuarios.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.registro.usuarios.servicio.UsuarioServicioImpl;

@Configuration
public class SecurityConfiguration {

	private final UsuarioServicioImpl usuarioServicio;

	public SecurityConfiguration(@Lazy UsuarioServicioImpl usuarioServicio) { // Agregar @Lazy aquí
		this.usuarioServicio = usuarioServicio;
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(usuarioServicio);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				authorizeRequests -> authorizeRequests.requestMatchers("/registro**", "/js/**", "/css/**", "/img/**")
						.permitAll().anyRequest().authenticated())
				.formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
				.logout(logout -> logout.invalidateHttpSession(true).clearAuthentication(true).logoutUrl("/login?logout")
						.logoutSuccessUrl("/login?logout").permitAll());

		return http.build();
	}

	@Bean
	public UserDetailsService userDetailsService() {
		return usuarioServicio;
	}
}
