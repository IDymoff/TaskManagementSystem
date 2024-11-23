package com.taskmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable()) // Disable CSRF for stateless REST APIs
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/", "/test", "/api/auth/**").permitAll() // Allow public access to authentication endpoints
//                        .anyRequest().authenticated()               // Protect all other endpoints
//                )
//                .formLogin(form -> form.disable())              // Disable default login form
//                .httpBasic(httpBasic -> httpBasic.disable());   // Disable HTTP Basic login
////                .httpBasic(httpBasic -> {}); // Enables HTTP Basic in the new style
//
//        return http.build();
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Temporarily allow all requests
                )
                .formLogin(form -> form.disable()) // Disable default login
                .httpBasic(httpBasic -> httpBasic.disable()); // Disable HTTP Basic auth

        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
}