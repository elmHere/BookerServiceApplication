package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.TravelPackage;
import com.example.demo.repo.TravelPackageRepository;

@Service
public class TravelPackageService {
	
	private TravelPackageRepository travelPackageRepository;
	
	public TravelPackageService(TravelPackageRepository travelPackageRepository) {
		super();
		this.travelPackageRepository = travelPackageRepository;
	}

	@Transactional
	public List<TravelPackage> findAll() {
		return (List<TravelPackage>) travelPackageRepository.findAll();
	}
	
	@Transactional
	public TravelPackage findById(int travelPackageId) {
		return travelPackageRepository.findById(travelPackageId).get();
	}
	
	/// save A LIST!!!!
	@Transactional
	public TravelPackage saveTravelPackage(TravelPackage travelPackage) {
		return travelPackageRepository.save(travelPackage);
	}
	
	/// deletes a list of travel packages
	@Transactional
	public void deleteTravelPackage(List<Integer> travelPackageIds) {
		for (Integer travelPackId : travelPackageIds ) {
			travelPackageRepository.deleteById(travelPackId);
		}
	}
	
	
	
	
}