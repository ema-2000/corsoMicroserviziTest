package com.example.microserviziocorso.docenteClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@EnableFeignClients
@FeignClient(value = "docente", url = "http://localhost:8082/api/docente")
public interface DocenteClient {

    @GetMapping(value = "/getNomeCognomeById/{id}")
    public String getNomeCognomeDocente(@RequestParam Long id);


}