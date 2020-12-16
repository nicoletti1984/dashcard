package br.dashcard.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // será armazenado no BD
@Table(name = "user")
@Getter @Setter @NoArgsConstructor
public class User {

    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1,2,3...
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;

    @Column(name = "password", length = 30, nullable = false)
    private String password;
    
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
   
}