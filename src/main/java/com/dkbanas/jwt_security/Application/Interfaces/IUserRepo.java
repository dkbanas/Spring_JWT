package com.dkbanas.jwt_security.Application.Interfaces;



import com.dkbanas.jwt_security.Domain.Entities.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUserRepo extends JpaRepository<RegisteredUser, Integer> {
    Optional<RegisteredUser> findByEmail(String email);
}
