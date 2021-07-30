package com.times.fisrtapirest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "TB_TIMES")
@Data
public class Times implements Serializable{
    
    private static final long serialVersionUID = 1l;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Getter
    @Setter
    private String nomeTime;

    @Getter
    @Setter
    private String ligaTime;

}
