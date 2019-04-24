package com.luv2code.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;


@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our user for in memory authentication
		
		UserBuilder users = User.withDefaultPasswordEncoder();

		auth.inMemoryAuthentication()
		.withUser(users.username("John").password("test123").roles("EMPLOYEE"))
		.withUser(users.username("Mary").password("test123").roles("EMPLOYEE", "MANAGER"))
		.withUser(users.username("Susan").password("test123").roles("EMPLOYEE", "ADMIN"));
		
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
<<<<<<< HEAD
			.antMatchers("/").hasRole("EMPLOYEE")
			.antMatchers("/leaders/**").hasRole("MANAGER")
			.antMatchers("/systems/**").hasRole("ADMIN")
=======
<<<<<<< HEAD
				.anyRequest().authenticated()
=======
			.antMatchers("/").hasRole("EMPLOYEE")
			.antMatchers("/leaders/**").hasRole("MANAGER")
			.antMatchers("/systems/**").hasRole("ADMIN")
>>>>>>> fb5d52c9c1fea16ee95f536da79ca6f6f1325c0c
>>>>>>> master
			.and()
			.formLogin()
				.loginPage("/showMyLoginPage")
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll()
		.and()
<<<<<<< HEAD
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/access-denied");
=======
<<<<<<< HEAD
		.logout().permitAll();
		
=======
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/access-denied");
>>>>>>> fb5d52c9c1fea16ee95f536da79ca6f6f1325c0c
>>>>>>> master
	}
	
	
}
