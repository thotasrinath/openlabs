package org.openlabs.ilearn.database.repository;

import org.openlabs.ilearn.database.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "users", rel = "users")
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}
