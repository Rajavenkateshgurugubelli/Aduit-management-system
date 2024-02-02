package com.mfpe.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuditRequest {
	
	private String projectName;
	private String managerName;
	private AuditDetail auditDetail;
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}
	/**
	 * @return the auditDetail
	 */
	public AuditDetail getAuditDetail() {
		return auditDetail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auditDetail, managerName, projectName);
	}
	

}
