package com.app.pokedex.config;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;

@OpenAPIDefinition(
            info = @Info(
                    title = "Pokedex",
                    version = "0.1",
                    description = "Api de Manipulação de Arquivo CSV",
                    license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                    contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
            ),
            tags = {
                    @Tag(name = "Tag 1", description = "desc 1", externalDocs = @ExternalDocumentation(description = "docs desc")),
                    @Tag(name = "Tag 2", description = "desc 2", externalDocs = @ExternalDocumentation(description = "docs desc 2")),
                    @Tag(name = "Tag 3")
            },
            externalDocs = @ExternalDocumentation(description = "definition docs desc"),
            servers = {
                    @Server(
                            description = "server 1",
                            url = "http://localhost:8080/")
            }
)
public class OpenAPIConfig {}