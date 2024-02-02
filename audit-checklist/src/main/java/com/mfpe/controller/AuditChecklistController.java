package com.mfpe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mfpe.model.AuditType;
import com.mfpe.model.Question;
import com.mfpe.service.AuthorizationService;
import com.mfpe.service.QuestionService;

@RestController
@RequestMapping("/checklist")
@CrossOrigin(origins = "*")
public class AuditChecklistController {

	/**
	 * @param questionService
	 * @param authorizationService
	 */
	public AuditChecklistController(QuestionService questionService, AuthorizationService authorizationService) {
		super();
		this.questionService = questionService;
		this.authorizationService = authorizationService;
	}

	private QuestionService questionService;

	private AuthorizationService authorizationService;

	Logger logger = LoggerFactory.getLogger("Checklist-Controller-Logger");

	// Endpoint for retrieving the questions from the DB
	@RequestMapping(value = "/AuditCheckListQuestions", method = { RequestMethod.GET, RequestMethod.POST })
	public List<Question> auditCheckListQuestions(@RequestHeader("Authorization") String jwt,
			@RequestBody AuditType auditType) {
		List<Question> questions = new ArrayList<Question>();

		logger.info("from header JWT :: " + jwt);

		// checking if the jwt is valid or not
		if (jwt.length() > 0 && authorizationService.validateJwt(jwt)) {
			questions = questionService.getQuestionsByAuditType(auditType);
		}
		return questions;
	}

	// Endpoint to check if the microservice is active
	@GetMapping("/health-check")
	public String healthCheck() {
		return "Audit Checklist Microservice is Active";
	}
}
