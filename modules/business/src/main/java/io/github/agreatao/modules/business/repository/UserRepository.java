package io.github.agreatao.modules.business.repository;

import io.github.agreatao.modules.business.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User save(User user);

}
