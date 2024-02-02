package com.mfpe.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue
	@Column(name = "question_id")
	private int questionId;

	@Column(name = "question")
	private String question;

	@Column(name = "audit_type")
	private String auditType;

	@Column(name = "response")
	private String response;

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @return the auditType
	 */
	public String getAuditType() {
		return auditType;
	}


}
