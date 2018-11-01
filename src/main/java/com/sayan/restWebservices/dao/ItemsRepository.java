package com.sayan.restWebservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sayan.restWebservices.model.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items,Integer>{

}
