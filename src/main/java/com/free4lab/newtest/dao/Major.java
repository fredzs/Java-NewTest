package com.free4lab.newtest.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Major entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MAJOR")

public class Major  implements java.io.Serializable {


    // Fields    

	private Integer id;
    private String zydm;
    private String zymc;


    // Constructors

    /** default constructor */
    public Major() {
    }

    
    /** full constructor */
    public Major(String zydm, String zymc) {
    	this.zydm = zydm;
    	this.zymc = zymc;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="ID", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getZydm() {
        return this.zydm;
    }
    
    public void setZydm(String zydm) {
        this.zydm = zydm;
    }
    
    @Column(name="ZYMC", nullable=false, length=30)

    public String getZymc() {
        return this.zymc;
    }
    
    public void setZymc(String zymc) {
        this.zymc = zymc;
    }

}