package br.dashcard.backend.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.dashcard.backend.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
    public User findByEmailAndPassword(String email, String password);
    public User findByEmailOrRacf(String email, String racf);

    @Query(value="Select new User(u.name, u.email) from User u where u.id = :cod")
    public User buscaPorId(@Param("cod") Integer codigo);

    @Query(value="Select name, email from user where id = :cod", nativeQuery = true)
    public Object buscarUsuariosPorId(@Param("cod") Integer codigo);
}