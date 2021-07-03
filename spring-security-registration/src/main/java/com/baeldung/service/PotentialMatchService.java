/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baeldung.service;

import com.baeldung.persistence.dao.ClientRepository;
import com.baeldung.persistence.dao.PotentialMatchRepository;
import com.baeldung.persistence.model.Client;
import com.baeldung.persistence.model.PotentialMatch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class PotentialMatchService {
	
	@Autowired	
	private PotentialMatchRepository PotentialMatchRepository;
	@Autowired	
	private ClientRepository clientRepository;
	
	// Add new Job Types
	public String updatePotentialMatch(PotentialMatch pm) {
		
		try {
			PotentialMatchRepository.save(pm);
			return "saved";
		} catch(Exception e) {
			return "failed";
		}
	}
	
//public String coachInitializeMatch(Integer clientId, Integer clientSwiped ) {
//		
//		try {
//			
//			
//			
//			for(Client client: clientRepository.findAll()){
//				PotentialMatch initMatch = new PotentialMatch(client.getId())
//				PotentialMatchRepository.save(a);
//				
//			}
//			
//			return "saved";
//		} catch(Exception e) {
//			return "failed";
//		}
//	}


//        // Update a Job Type
//	public ResponseEntity<Object> updatePotentialMatch(PotentialMatch a) {
//		try {
//			Optional<PotentialMatch> PotentialMatchOptional = PotentialMatchRepository.findById(a.getId());
//			if(!PotentialMatchOptional.isPresent()) {
//				return ResponseEntity.notFound().build();
//			}
//			PotentialMatchRepository.save(a);
//			return ResponseEntity.ok("Updated");
//		}catch(Exception e) {
//			return ResponseEntity.ok("Failed to update PotentialMatch record.");
//		}
//	}


	// Get all Job Types
	public  Iterable<Integer> getAllPotentialClientMatch(Integer Id){
			
            return PotentialMatchRepository.getAllPotentialClientMatch(Id);
					
	}
	// Get all Job Types
		public  Iterable<Integer> getAllPotentialCoachMatch(Integer Id){
				
	            return PotentialMatchRepository.getAllPotentialCoachMatch(Id);
						
		}
     
    
      
      
	
	// Get single Job Type by Id
	public Optional<PotentialMatch> getPotentialMatch(Integer id) {
		return PotentialMatchRepository.findById(id);
	}

	
	// Delete a Job Type
	public String deletePotentialMatch(Integer id) {
		try{
			PotentialMatchRepository.deleteById(id);
			return "Deleted";
		}catch(Exception e) {
			return "Failed";
		}
	}

	
}
