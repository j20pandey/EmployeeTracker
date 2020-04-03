package com.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso

public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	UserDetailsService userDetailsService;
	
	//Own username and password 
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		List<UserDetails> user = new ArrayList<UserDetails>();
//		
//		user.add(User.withDefaultPasswordEncoder().username("A").password("A").roles("USER").build());
//		user.add(User.withDefaultPasswordEncoder().username("J").password("A").roles("USER").build());
//		
//		return new InMemoryUserDetailsManager(user);
//	}
	
	
	//username and passsword from DB
//	@Bean
//	public AuthenticationProvider authProvider() {
//		DaoAuthenticationProvider daoAuth = new DaoAuthenticationProvider();
//		daoAuth.setUserDetailsService(userDetailsService);
//		//daoAuth.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		daoAuth.setPasswordEncoder(new BCryptPasswordEncoder());
//
//		return daoAuth;
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//-------DB---------------
//		http.csrf().disable()
//		.authorizeRequests().antMatchers("/login")
//		.permitAll()
//		.anyRequest().authenticated()
//		.and()
//		.formLogin()
//		.loginPage("/login").permitAll()
//		.and()
//		.logout().invalidateHttpSession(true)
//		.clearAuthentication(true)
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/logoutSuc")
//		.permitAll();
		
		
		//OAuth2
		http.csrf().disable()
		.authorizeRequests().antMatchers("/login")
		.permitAll()
		.anyRequest().authenticated();
	
	}
}
