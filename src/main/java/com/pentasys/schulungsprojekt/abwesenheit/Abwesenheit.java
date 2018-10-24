package com.pentasys.schulungsprojekt.abwesenheit;

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

/**
 * @author strinomi
 * Diese Klasse definiert eine/mehrere Abwesenheit/en einer Person
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Abwesenheit {
	@Id
	@Column(name = "AbwesenheitID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID abwesenheitID;

	@Column(name = "StartDatum")
	private LocalDate startDatum;

	@Column(name = "EndeDatum")
	private LocalDate endeDatum;

	@ManyToOne
	@JoinColumn(name = "PersonIdFK", referencedColumnName = "PersonID")
	private Person person;

	//Audit
	@Column(name = "operation")
	private String operation;

	//Audit
	@Column(name = "timestamp")
	private long timestamp;
	
	//Optimistic Locking
	@Version
	private Integer version;

	public UUID getAbwesenheitID() {
		return abwesenheitID;
	}

	public void setAbwesenheitID(UUID abwesenheitID) {
		this.abwesenheitID = abwesenheitID;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Abwesenheit() {
	};

	public Abwesenheit(LocalDate startDatum, LocalDate endeDatum) {
		this.startDatum = startDatum;
		this.endeDatum = endeDatum;
	};

	public LocalDate getStartDatum() {
		return startDatum;
	}

	public void setStartDatum(LocalDate startDatum) {
		this.startDatum = startDatum;
	}

	public LocalDate getEndeDatum() {
		return endeDatum;
	}

	public void setEndeDatum(LocalDate endeDatum) {
		this.endeDatum = endeDatum;
	}
}
