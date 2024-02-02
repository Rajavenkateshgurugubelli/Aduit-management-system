package com.mfpe.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="audit_benchmark")
public class AuditBenchmark {
	
	@Id
	@Column(name="benchmark_id")
	@GeneratedValue
	private int benchmarkId;
	
	@Column(name="audit_type")
	private String auditType;
	
	@Column(name="benchmark_no_answers")
	private int benchmarkNoAnswers;

	/**
	 * @return the auditType
	 */
	public String getAuditType() {
		return auditType;
	}

	/**
	 * @return the benchmarkNoAnswers
	 */
	public int getBenchmarkNoAnswers() {
		return benchmarkNoAnswers;
	}

}
