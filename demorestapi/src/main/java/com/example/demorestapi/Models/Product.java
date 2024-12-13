package com.example.demorestapi.Models;


import jakarta.persistence.Column;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column(name = "id")

private int id;
@Column(name = "name")
private String name;
@Column(name = "price")
private double price;

}