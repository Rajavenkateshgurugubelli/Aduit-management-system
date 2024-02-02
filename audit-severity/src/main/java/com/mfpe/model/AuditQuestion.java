package com.mfpe.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuditQuestion {
	
	private int questionId;
	private String question;
	private String auditType;
	private String response;
	/**
	 * @return the auditType
	 */
	public String getAuditType() {
		return auditType;
	}
	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auditType, question, questionId, response);
	}
}
