package fr.s2re.banque.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the operationbancaire database table.
 * 
 */
@Entity
@NamedQuery(name="Operationbancaire.findAll", query="SELECT o FROM Operationbancaire o")
public class Operationbancaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_operation")
	private int idOperation;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_operation")
	private Date dateOperation;

	private double montant;

	@Column(name="type_operation")
	private String typeOperation;

	//bi-directional many-to-one association to Comptebancaire
	@ManyToOne
	@JoinColumn(name="id_compte")
	private Comptebancaire comptebancaire;

	public Operationbancaire() {
	}

	public int getIdOperation() {
		return this.idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public Date getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getTypeOperation() {
		return this.typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public Comptebancaire getComptebancaire() {
		return this.comptebancaire;
	}

	public void setComptebancaire(Comptebancaire comptebancaire) {
		this.comptebancaire = comptebancaire;
	}

}