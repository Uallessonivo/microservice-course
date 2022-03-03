# Microservice Project

<hr>

### Microservice in Java with Spring Boot and Spring Cloud

<hr>

### Overview

- Utilização de microserviços para gerenciamento de folha de pagamento de funcionários.

# Fases do projeto

### Fase 1

* [HR-WORKER](https://github.com/Uallessonivo/microservice-course/tree/main/hrworker)
* [HR-PAYROLL](https://github.com/Uallessonivo/microservice-course/tree/main/hrpayroll)

#### Configs

* Comunicação de microserviços com Feign Client
* Ribbon para balanceamento de requisições


### Fase 2

* [HR-EUREKA-SERVER](https://github.com/Uallessonivo/microservice-course/tree/main/hreureka)
* [HR-ZUUL-API-GATEWAY](https://github.com/Uallessonivo/microservice-course/tree/main/hrgateway)

#### Configs

* Hystrix para tolerância a falhas
* Zuul para Api Gateway
* Zuul Timeout
* Porta aleatória para o Hr-Payroll

### Fase 3

* Centralizando as configurações da aplicação com Config Server
* [MS-CONFIG](https://github.com/Uallessonivo/ms-app-configsy)

### Fase 4

* [MS-USER](https://github.com/Uallessonivo/microservice-course/tree/main/hruser)
* [MS-OAUTH](https://github.com/Uallessonivo/microservice-course/tree/main/hroauth)

#### Configs
* Entidades User, Role e Assosiação N:N
* Servidor de Autorização com Spring Security
* Autenticação com Spring Security OAuth2
