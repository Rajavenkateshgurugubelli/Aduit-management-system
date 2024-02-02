package com.mfpe.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuditDetail {
	
	private String auditType;
	private Date auditDate;
	private List<AuditQuestion> auditQuestions;
	/**
	 * @return the auditType
	 */
	public String getAuditType() {
		return auditType;
	}

	/**
	 * @return the auditQuestions
	 */
	public List<AuditQuestion> getAuditQuestions() {
		return auditQuestions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auditDate, auditQuestions, auditType);
	}

}
