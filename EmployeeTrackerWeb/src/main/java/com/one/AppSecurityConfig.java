package com.one;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	UserDetailsService userDetailsService;
	
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
	
	@Bean
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider daoAuth = new DaoAuthenticationProvider();
		daoAuth.setUserDetailsService(userDetailsService);
		//daoAuth.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		daoAuth.setPasswordEncoder(new BCryptPasswordEncoder());
		
		return daoAuth;
	}
}
