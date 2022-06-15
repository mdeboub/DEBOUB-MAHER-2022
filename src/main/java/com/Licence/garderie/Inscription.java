package com.Licence.garderie;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inscriptions")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "année_inscription")
    private Long anneeinscription;

    @Column(name = "Nom_Enfant")
    private String nomEnfant;

    @Column(name = "Prénom_Enfant")
    private String prenomEnfant;
    
    @Column(name = "Nom")
    private String nom;
    
    @Column(name = "prénom")
    private String prenom;
   
    @Column(name = "email")
    private String email;
    
    @Column(name = "numéro_de_téléphone")
    private Long numero;
    
    @Column(name = "adresse")
    private String adresse;
    
    @Column(name = "code_postal")
    private Long codepostal;
    
    @Column(name = "ville")
    private String ville;
    
    @Column(name = "commentaire")
    private String commentaire;
    
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public Long getAnneeinscription() {
		return anneeinscription;
	}

	public void setAnneeinscription(Long anneeinscription) {
		this.anneeinscription = anneeinscription;
	}

	public String getNomEnfant() {
		return nomEnfant;
	}

	public void setNomEnfant(String nomEnfant) {
		this.nomEnfant = nomEnfant;
	}

	public String getPrenomEnfant() {
		return prenomEnfant;
	}

	public void setPrenomEnfant(String prenomEnfant) {
		this.prenomEnfant = prenomEnfant;
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

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(Long codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	
	
    
    
}
