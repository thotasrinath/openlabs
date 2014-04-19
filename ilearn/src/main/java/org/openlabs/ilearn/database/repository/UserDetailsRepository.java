package org.openlabs.ilearn.database.repository;

import org.openlabs.ilearn.database.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {

}
