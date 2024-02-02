package com.mfpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.model.AuditType;
import com.mfpe.model.Question;
import com.mfpe.repository.QuestionRepo;

@Service
public class QuestionServiceImpl implements QuestionService {

	private QuestionRepo questionRepo;

	/**
	 * @param questionRepo
	 */
	public QuestionServiceImpl(QuestionRepo questionRepo) {
		super();
		this.questionRepo = questionRepo;
	}

	// Service for the Endpoint /AuditCheckListQuestions
	public List<Question> getQuestionsByAuditType(AuditType auditType) {
		List<Question> qlist = questionRepo.getQuestionsByAuditType(auditType.getAuditType());
		return qlist;
	}

}
