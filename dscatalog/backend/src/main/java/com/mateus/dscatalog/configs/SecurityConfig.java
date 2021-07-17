package com.mateus.dscatalog.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**");
	}

	// @Autowired
	// private Environment env;

	// private static final String[] PUBLIC_MATCHERS = { "/**" };

	// @Override
	// protected void configure(HttpSecurity http) throws Exception {

	// // H2
	// if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
	// http.headers().frameOptions().disable();
	// }

	// http.cors().and().csrf().disable();
	// http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	// http.authorizeRequests().antMatchers(PUBLIC_MATCHERS).permitAll();
	// }

	// @Bean
	// CorsConfigurationSource corsConfigurationSource() {
	// CorsConfiguration configuration = new
	// CorsConfiguration().applyPermitDefaultValues();
	// configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE",
	// "OPTIONS"));
	// final UrlBasedCorsConfigurationSource source = new
	// UrlBasedCorsConfigurationSource();
	// source.registerCorsConfiguration("/**", configuration);
	// return source;
	// }
}