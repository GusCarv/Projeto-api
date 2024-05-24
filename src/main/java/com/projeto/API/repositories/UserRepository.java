package com.projeto.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.API.models.User;


@Repository
public interface UserRepository extends JpaRepository< User, Long>{

     
}
