# Pesquisa Rest API

## APIs:

API é uma sigla em inglês para _Application Programming Interface_, ou seja, Inferface de Programação de Aplicações. APIs funcionam como conjuntos de ferramentas, padrões e protocolos, os quais mediam a interação e a comunicação de diferentes aplicativos ou dispositivos, e são utilizadas na criação de aplicações de software. 
Uma API permite a conexão de um usuário - ou de outra aplicação - com um sistema, sem que haja conhecimento dos detalhes de implementação ou do desenvolvimento desse sistema.

## REST:

REST é um acrônimo em inglês para _REpresentational State Transfer_ (Transferência Representacional de Estado, em português), e foi apresentado inicialmente na tese de doutorado de Roy Fielding, em 2000.
Trata-se de um modelo de arquitetura, que fornece diretrizes para que sistemas possam se comunicar, e é amplamente utilizado por desenvolvedores na criação de APIs.

## APIs REST:

O REST é um modelo de arquitetura relativamente flexível, pois permite aos programadores, por exemplo, a utilização de praticamente qualquer linguagem no desenvolvimento de APIs. No entanto, assim como outras arquiteturas, o REST também possui princípios, e as APIs que seguem esses princípios são denominadas APIs REST (ou RESTful).

## Os 6 princípios do REST:

1. Interface uniforme (uniform interface): as solicitações e respostas enviadas devem seguir um mesmo padrão. Aplicações e servidores podem ser desenvolvidas em todo tipo de linguagem, por isso uma interface uniforme é o que permite a comunicação de qualquer cliente com a API REST. 

2. Desacoplamento cliente-servidor (cliente-server separation): mudanças feitas pelo usuário na aplicação em seu dispositivo não devem afetar o servidor e sua estrutura de dados, assim como alterações feitas do lado do servidor não devem instantaneamente impactar o dispositivo do usuário.

3. Sem estado definido (stateless): a comunicação feita entre um cliente um servidor não pode armazenar nenhum dado relacionado às solicitações feitas pelo cliente. Dessa forma, é necessário que cada solicitação feita inclua todas as informações necessárias para seu processamento. 

4. Capacidade de armazenamento em cache (cacheable): quando possível, informações devem ser armazenadas em cache, de modo a otimizar as interações entre o cliente e o servidor.

5. Arquitetura de sistema em camadas (layered system): entre um cliente e um servidor que se comunicam, podem existir diversas camadas, cada uma com uma função específica. Esse princípio determina que as mensagem trocadas entre o cliente e o servidor sejam sempre processadas da mesma maneira, independentemente da quantidade de camadas intermediárias existentes.

6. Código sob demanda (code on demand) - opcional: trata-se da capacidade de enviar um código executável do servidor para o cliente quando solicitado para ampliar a funcionalidade disponível ao cliente. 

## Referências bibliográficas:

[IBM](https://www.ibm.com/br-pt/topics/rest-apis)
[REST API Tutorial](https://restfulapi.net/)