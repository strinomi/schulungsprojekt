package com.pentasys.schulungsprojekt.projektPerson;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.pentasys.schulungsprojekt.person.Person;
import com.pentasys.schulungsprojekt.projekt.Projekt;

/**
 * @author strinomi
 * Zuordnungstabelle welche person in welchem Projekt ist und wie Verfügbar dieser ist
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
public class ProjektPerson {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;

	@ManyToOne
	@JoinColumn(name = "PersonIdFK", referencedColumnName = "PersonID")
	private Person person;

	@ManyToOne
	@JoinColumn(name = "ProjektIdFK", referencedColumnName = "ProjektID")
	private Projekt projekt;

	@Column(name = "Beginn")
	private LocalDate beginn;

	@Column(name = "Ende")
	private LocalDate ende;

	@Column(name = "Verfügbarkeit")
	private int verfügbarkeit;

	// Audit
	@Column(name = "operation")
	private String operation;

	// Audit
	@Column(name = "timestamp")
	private long timestamp;

	// Optimistic Locking
	@Version
	private Integer version;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public LocalDate getBeginn() {
		return beginn;
	}

	public void setBeginn(LocalDate beginn) {
		this.beginn = beginn;
	}

	public LocalDate getEnde() {
		return ende;
	}

	public void setEnde(LocalDate ende) {
		this.ende = ende;
	}

	public int getVerfügbarkeit() {
		return verfügbarkeit;
	}

	public void setVerfügbarkeit(int verfügbarkeit) {
		this.verfügbarkeit = verfügbarkeit;
	}

	public UUID getId() {
		return id;
	}
}
