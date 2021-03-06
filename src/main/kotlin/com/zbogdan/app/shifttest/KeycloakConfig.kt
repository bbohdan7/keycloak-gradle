package com.zbogdan.app.shifttest

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KeycloakConfig {
    @Bean
    fun keycloakConfigResolver(): KeycloakSpringBootConfigResolver = KeycloakSpringBootConfigResolver()
}