package io.github.uallessonivo.hruser.repositories;


import io.github.uallessonivo.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
