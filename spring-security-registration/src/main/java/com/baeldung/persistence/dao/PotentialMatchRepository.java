/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baeldung.persistence.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.baeldung.persistence.model.PotentialMatch;
/**
 *
 * @author kolby
 */

public interface PotentialMatchRepository extends CrudRepository<PotentialMatch, Integer>{

	
 //@Query(value= "Select * from client", nativeQuery=true)
// public List<Client> getAll();
 @Query(value ="Select CoachId from potential_matches C\r\n"
 		+ "Where ClientSwiped =0 and CoachSwiped !=-1 ClientId = :id\r\n", nativeQuery = true)
 public List<Integer> getAllPotentialClientMatch(@Param("id") Integer id);
 
 @Query(value ="Select ClientId from potential_matches C\r\n"
	 		+ "Where CoachSwiped =0 and ClientSwiped !=-1 ClientId = :id\r\n", nativeQuery = true)
	 public List<Integer> getAllPotentialCoachMatch(@Param("id") Integer id);
	 
	 
 
}
