package com.runt.pruebarunt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class WebConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

	protected static final String[] AUTH_WHITELIST = { 
			"/h2-console/**", 
			"/profesor/**", 
			"/asignatura/**" 
			};

	public void configure(final HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers(AUTH_WHITELIST)
		.permitAll().anyRequest()
		.authenticated()
		.and()
		.formLogin();

		http.csrf().ignoringAntMatchers("/h2-console/**");
		http.headers().frameOptions().sameOrigin();
	}

	public void addCorsMappings(final CorsRegistry registry) {
		registry.addMapping("/**").allowedOriginPatterns("*").allowedHeaders("*").allowCredentials(true)
				.allowedMethods("GET", "PUT", "POST", "DELETE");
	}

}
