package br.dashcard.backend.DTO;

import br.dashcard.backend.model.User;

// DTO - Data Transfer Object

public class UserDto {
    private String name;
    private String email;
    private String racf;

    public UserDto(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.racf = user.getRacf();
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRacf() {
        return racf;
    }

    public void setRacf(String racf) {
        this.racf = racf;
    }
    
    
}