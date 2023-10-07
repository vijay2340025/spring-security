package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityAdapter extends WebSecurityConfigurerAdapter {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("root")
                .password("$2a$10$LgLj2ABBpg8i..nWL2Qig.5pg/qp98rtcD4.jcinCPLWn3FfGnNbS") // welcome
                .roles("admin")
                .and()
                .withUser("vijay")
                .password("$2a$10$1KAm2HioOXUED.PHimLATevUF1MXSAP2sea.aD9uNc4pgkuVTIBkG") // vijay
                .roles("user");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**/home", "/**/bye").permitAll()
                .antMatchers("/**/hello/**").authenticated()
                .and()
                .httpBasic()
                .and()
                .formLogin();
    }
}
