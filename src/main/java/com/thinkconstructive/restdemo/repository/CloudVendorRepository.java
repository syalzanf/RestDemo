package com.thinkconstructive.restdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkconstructive.restdemo.model.CloudVendor; 

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{

    default List<CloudVendor> getAllCloudVendors() {
        return findAll();
    }

}
