package com.pentasys.schulungsprojekt.projekt;

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
 * Diese Klasse beschreibt ein Projekt
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Projekt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProjektID", unique = true)
	private UUID id;

	@Column(name = "Name")
	private String name;

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
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
