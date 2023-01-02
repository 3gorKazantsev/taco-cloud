package org.egorkazantsev.tacocloud.repository;

import org.egorkazantsev.tacocloud.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
