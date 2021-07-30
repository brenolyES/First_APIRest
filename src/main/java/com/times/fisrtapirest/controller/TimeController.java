package com.times.fisrtapirest.controller;

import java.util.List;
import com.times.fisrtapirest.model.Times;
import com.times.fisrtapirest.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TimeController {
    
    @Autowired
    TimeRepository timeRepository;

    @GetMapping("/listartimes")
    public List<Times> listaTimes(){
        return timeRepository.findAll();
    }

    @GetMapping("/listartimes/{id}")
    public Times listaTimeUnico(@PathVariable long id){
        return timeRepository.findById(id);
    }

    @PostMapping("/inserirtime")
    public Times inserirTime(@RequestBody Times time){
        return timeRepository.save(time);
    }

    @DeleteMapping("/deletartime/{id}")
    public void deletarTime(@PathVariable Long id){
        timeRepository.deleteById(id);
    }

    @PutMapping("/atualizartime")
    public Times atualizarTime(@RequestBody Times time){
        return timeRepository.save(time);
    }

}
