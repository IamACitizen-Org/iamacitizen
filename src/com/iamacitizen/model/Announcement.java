package com.iamacitizen.model;

import java.io.Serializable;

public class Announcement implements Serializable {

	private static final long serialVersionUID = -4780415297292523264L;

	private Long id;
	private String title;
	private String description;
	private Long repudiations;
	private byte[] photo;
	private String country;
	private String state;
	private String city;
	private String type;
	private String institutionArea;
	private String institutionType;
	private String institution;

	// TODO: verify constructors
	public Announcement(Long id, String title, String description,
			Long repudiations, byte[] photo) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.repudiations = repudiations;
		this.photo = photo;
	}
	
	public Announcement(String title, String description, String country,
			String state, String city, String type, String institutionArea,
			String institutionType, String institution) {
		super();
		this.title = title;
		this.description = description;
		this.country = country;
		this.state = state;
		this.city = city;
		this.type = type;
		this.institutionArea = institutionArea;
		this.institutionType = institutionType;
		this.institution = institution;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getRepudiations() {
		return repudiations;
	}

	public void setRepudiations(Long repudiations) {
		this.repudiations = repudiations;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInstitutionArea() {
		return institutionArea;
	}

	public void setInstitutionArea(String institutionArea) {
		this.institutionArea = institutionArea;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}
	
}
