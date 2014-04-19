package org.openlabs.ilearn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openlabs.ilearn.database.entity.UserDetails;
import org.openlabs.ilearn.database.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderPersistenceTests {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Test
	@Transactional
	@Rollback(false)
	public void saveUser()
	{
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("Srinath");
		userDetails.setLastName("Thota");
		
		userDetails = userDetailsRepository.save(userDetails);
		
		Assert.assertNotNull(userDetails.getId());
	}

}
