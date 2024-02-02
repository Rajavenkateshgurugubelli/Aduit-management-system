package com.mfpe.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component
public class AuditType {

	private String auditType;

	/**
	 * @return the auditType
	 */
	public String getAuditType() {
		return auditType;
	}

	/**
	 * @param auditType the auditType to set
	 */
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auditType);
	}

}
