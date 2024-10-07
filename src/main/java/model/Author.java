package model;

import java.time.LocalDate;

import org.apache.catalina.Role;

public class Author {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private LocalDate dateNaissance;
	private Role role;
	
	public Author(int id, String nom, String prenom, String email, LocalDate dateNaissance, Role role ) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.role = role;
	}
	
	public Author(String nom, String prenom, String email, LocalDate dateNaissance, Role role ) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.role = role;
	}
	
	public Author() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", dateNaissance="
				+ dateNaissance + ", role=" + role + "]";
	}
	
	
	
	
}



