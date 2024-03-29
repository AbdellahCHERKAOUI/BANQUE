//package com.example.BANQUE.Configuration;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        /*http.authorizeRequests()
//                *//*.antMatchers("/todo**").hasAnyAuthority("USER")
//                .antMatchers("/admin**").hasAnyAuthority("ADMIN", "SUPERADMIN")*//*
//                .antMatchers("/films").hasAnyAuthority("USER","ADMIN")
//                .antMatchers("/createAccount").permitAll()
//                .antMatchers("/acc**").hasAnyAuthority("ADMIN")
//                .anyRequest().permitAll();
//
//        http.formLogin()
//                .loginPage("/login").permitAll().
//                and().formLogin()
//                .usernameParameter("k").passwordParameter("l").defaultSuccessUrl("/").failureUrl("/se-connecter?error=true")
//                .permitAll();
//
//        http.logout().logoutSuccessUrl("/login?logout").permitAll()
//                .and()
//                .logout()
//                .permitAll();*/
//    }
//
//  /*  @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(userDetailsService());
//        authProvider.setPasswordEncoder(passwordEncoder());
//
//        return authProvider;
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.authenticationProvider(authenticationProvider());
//    }
//
//
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        return movieUserDetailsService;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }*/
//}
