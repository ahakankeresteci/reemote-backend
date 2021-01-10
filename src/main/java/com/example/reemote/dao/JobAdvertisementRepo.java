package com.example.reemote.dao;

import com.example.reemote.entityModel.JobAdvertisement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:8080") 
public interface JobAdvertisementRepo extends MongoRepository<JobAdvertisement,String>{
      Page<JobAdvertisement> findByCategory(@RequestParam("category") String category,Pageable pageable);
        
      Page<JobAdvertisement> findByTitleLikeIgnoreCase(@RequestParam("title") String title, Pageable pageable);
      
}
