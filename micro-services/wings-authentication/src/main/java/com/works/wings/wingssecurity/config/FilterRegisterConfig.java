package com.works.wings.wingssecurity.config;


import com.works.wings.wingssecurity.filters.TokenAuthFilter;
import com.works.wings.wingssecurity.util.DelegatingPasswordEncoderCus;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.*;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrations;
import org.springframework.security.oauth2.client.registration.InMemoryReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.server.ServerOAuth2AuthorizedClientRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.util.matcher.PathPatternParserServerWebExchangeMatcher;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebFluxSecurity
public class FilterRegisterConfig {
    @Bean
    public WebFilter tokenAuthFilter() {
        return new TokenAuthFilter();
    }

    @Bean
    public DelegatingPasswordEncoder encoderPwd() {
        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put("noop", NoOpPasswordEncoder.getInstance());
        encoders.put("bcrypt", new BCryptPasswordEncoder(4));
        encoders.put("argon2", new Argon2PasswordEncoder());
        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
        encoders.put("scrypt", new SCryptPasswordEncoder());
        encoders.put("sha256", new StandardPasswordEncoder());
        return new DelegatingPasswordEncoder("argon2", encoders);
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange().anyExchange()
                .authenticated()
                .and()
                .oauth2Login(withDefaults())
                .formLogin(withDefaults())
                .oauth2Client(withDefaults());
        return http.build();
    }
//    @Bean
//    public MapReactiveUserDetailsService userDetailsService(DelegatingPasswordEncoder encoderPwd) {
//        UserDetails user = User.withUsername("user")
//                .password("user")
//                .roles("USER")
//                .passwordEncoder(encoderPwd::encode)
//                .build();
//        return new MapReactiveUserDetailsService(user);
//    }
}
