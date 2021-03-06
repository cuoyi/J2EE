package com.crtb.oss.model;

// Generated Mar 17, 2015 4:56:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TBid generated by hbm2java
 */
@Entity
@Table(name = "t_bid", catalog = "db_oss")
public class TBid implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<TContract> TContracts = new HashSet<TContract>(0);

	public TBid() {
	}

	public TBid(String name) {
		this.name = name;
	}

	public TBid(String name, Set<TContract> TContracts) {
		this.name = name;
		this.TContracts = TContracts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TBid")
	public Set<TContract> getTContracts() {
		return this.TContracts;
	}

	public void setTContracts(Set<TContract> TContracts) {
		this.TContracts = TContracts;
	}

}
