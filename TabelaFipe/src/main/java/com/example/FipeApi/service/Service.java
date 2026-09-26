package com.example.FipeApi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Service {
/*Irá aparecer todas as marcas de veículos que tem no Brasil */
    public String consultarMarcas(){
        String dadosFipe = "";
        String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosFipe = responseEntity.getBody();
        }else{
            dadosFipe = "Falha ao obter os dados da Tabela Fipe";
        }
        return dadosFipe;
    }
/*Com o código da marca irá listar todos os modelos dessa marca */
    public String consultarModelos(String idMarca){
        String dadosFipe = "";
        String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/"+idMarca+"/modelos";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosFipe = responseEntity.getBody();
        }else{
            dadosFipe = "Marca Indisponível - Confere o número digitado";
        }
        return dadosFipe;
    }
/*Pegando o código do modelo de carro que você deseja, você podera ver todos os anos que esse carro teve */
    public String consultarAnos(String idMarca, String idModelo){
        String dadosFipe = "";
        String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/"+idMarca+"/modelos/"+idModelo+"/anos";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosFipe = responseEntity.getBody();
        }else{
            dadosFipe = "Marca Indisponível - Confere o número digitado";
        }
        return dadosFipe;
    }
/*Pegando o código do ano você irá acessar  o preço da tabela fipe do veículo escolhido */
    public String consultarModeloValor(String idMarca, String idModelo,String idAno){
        String dadosFipe = "";
        String apiUrl = "https://parallelum.com.br/fipe/api/v1/carros/marcas/"+idMarca+"/modelos/"+idModelo+"/anos/"+idAno;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl,String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dadosFipe = responseEntity.getBody();
        }else{
            dadosFipe = "Marca Indisponível - Confere o número digitado";
        }
        return dadosFipe;
    }
}
