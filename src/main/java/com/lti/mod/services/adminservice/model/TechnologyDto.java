package com.lti.mod.services.adminservice.model;

import java.io.Serializable;
import java.math.BigInteger;

public class TechnologyDto implements Serializable{
    /**
     * Default Serial version UID
     */
    private static final long serialVersionUID = 1L;
    private BigInteger id;
    private String technology;
    private String description;
    private String Status;
    private BigInteger Fees;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger object) {
        this.id = object;
    }
    public String getTechnology() {
        return technology;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public BigInteger getFees() {
        return Fees;
    }
    public void setFees(BigInteger fees) {
        Fees = fees;
    }



}
