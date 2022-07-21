package com.tts.h2Explore.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tts.h2Explore.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
