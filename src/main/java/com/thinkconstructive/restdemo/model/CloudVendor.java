package com.thinkconstructive.restdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="cloud_vendor_info")
@Getter
@Setter
public class CloudVendor
{
    @Id
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;
    private String vendorEmail;

    public CloudVendor(){
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber, String vendorEmail){
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.vendorEmail = vendorEmail;
    }

}