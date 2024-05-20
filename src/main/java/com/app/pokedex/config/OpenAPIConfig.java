package com.app.pokedex.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "Pokedex", version = "0.1", description = "## API de Manipulação de Arquivo CSV\n\n"
                +
                "Esta API permite a manipulação de um arquivo CSV contendo informações sobre Pokémon, Treinadores e Pokedex. "
                +
                "Através desta API, é possível realizar operações de CRUD (Create, Read, Update, Delete) para gerenciar Pokémon, "
                +
                "Treinadores e a própria Pokedex.\n\n" +
                "## Contatos:\n" +
                "### Contato 1:\n" +
                "- **Nome:** PEDRO HENRIQUE FEITOZA DA SILVA\n" +
                "- **Linkedin:** https://www.linkedin.com/in/pedro-henrique-114b111aa\n" +
                "### Contato 2:\n" +
                "- **Nome:** CAROLINA APRIGIO BROTTO\n" +
                "- **Linkedin:** \n" +
                "### Contato 3:\n" +
                "- **Nome:** TAYNA DE PAULA APOLINÁRIO\n" +
                "- **Linkedin:**\n" +
                "### Contato 4:\n" +
                "- **Nome:** EMILY ROGATTI NANTES\n" +
                "- **Linkedin:**\n" +
                "### Contato 5:\n" +
                "- **Nome:** DANIEL AUGUSTO DE AMORIM BORGES\n" +
                "- **Linkedin:** https://www.linkedin.com/in/danielborgesam/\n"), 
                servers = { @Server(description = "server 1", url = "http://localhost:8080/") })
public class OpenAPIConfig {}