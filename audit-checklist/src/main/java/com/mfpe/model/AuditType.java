package com.mfpe.model;

import java.util.Objects;

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
public class AuditType {
	private String auditType;

	/**
	 * @return the auditType
	 */
	public String getAuditType() {
		return auditType;
	}
}
