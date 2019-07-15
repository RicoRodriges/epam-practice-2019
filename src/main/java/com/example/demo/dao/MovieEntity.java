package com.example.demo.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class MovieEntity {
    @Id
    private String id;
    private String name;
}
