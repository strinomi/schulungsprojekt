package com.pentasys.schulungsprojekt.person;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author strinomi
 * Diese Klasse beinhaltet Attribute einer Person
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Person {
	@Id
	@Column(name = "PersonID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID personId;

	@Column(name = "Vorname")
	private String Vorname;

	@Column(name = "Nachname")
	private String Nachname;

	@Column(name = "Email")
	private String Email;

	@Column(name = "ArbeitszeitImMonat")
	private float arbeitszeit;

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

	public UUID getId() {
		return personId;
	}

	public float getArbeitszeit() {
		return arbeitszeit;
	}

	public void setArbeitszeit(float arbeitszeit) {
		this.arbeitszeit = arbeitszeit;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
}
