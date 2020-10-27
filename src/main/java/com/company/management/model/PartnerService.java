package com.company.management.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "partner_service")
public class PartnerService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "id_partner")
	private int idPartner;
	
	@Column(name = "id_service")
	private int idService;
	
	@Column(name = "quantity")
	private double quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPartner() {
		return idPartner;
	}

	public void setIdPartner(int idPartner) {
		this.idPartner = idPartner;
	}

	public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PartnerService [id=" + id + ", idPartner=" + idPartner + ", idService=" + idService + ", quantity="
				+ quantity + "]";
	}
	
	

}
