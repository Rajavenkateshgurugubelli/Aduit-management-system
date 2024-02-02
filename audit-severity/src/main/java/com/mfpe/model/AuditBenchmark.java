package com.mfpe.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {
	
	private int benchmarkId;
	private String auditType;
	private int benchmarkNoAnswers;
}
