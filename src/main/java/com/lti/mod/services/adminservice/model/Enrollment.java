package com.lti.mod.services.adminservice.model;

public class Enrollment {
	
    private Long id;
    private Long user_id;
    private Long technology_id;
    private String comments;
    private Long proposalAmount;
    private String proposalStatus;
    private String username;
    private String mentorname;
    private String technology;

    
    public Enrollment() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	public Long getTechnology_id() {
		return technology_id;
	}


	public void setTechnology_id(Long technology_id) {
		this.technology_id = technology_id;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Long getProposalAmount() {
		return proposalAmount;
	}


	public void setProposalAmount(Long proposalAmount) {
		this.proposalAmount = proposalAmount;
	}


	public String getProposalStatus() {
		return proposalStatus;
	}


	public void setProposalStatus(String proposalStatus) {
		this.proposalStatus = proposalStatus;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public String getMentorname() {
		return mentorname;
	}


	public void setMentorname(String mentorname) {
		this.mentorname = mentorname;
	}

	
    
    

}
