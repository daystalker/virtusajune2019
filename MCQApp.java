package com.virtusa.banking.threaddemo;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.banking.models.Answer;
import com.virtusa.banking.models.MCQ;
import com.virtusa.banking.models.Question;

public class MCQApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List<Question> questionList=new ArrayList<Question>();
	   //Question 1
	   Question question=new Question();
	   question.setQuestionNo(1);
	   question.setDescription("Capital of Sri Lanka?");	   
	   List<Answer> answerList=new ArrayList<Answer>();	
	   Answer answer=new Answer();
	   answer.setAnswerNo(1);
	   answer.setAnswerDescription("Chennai");
	   answerList.add(answer);
	   answer=new Answer();
	   answer.setAnswerNo(2);
	   answer.setAnswerDescription("Coimbatore");
	   answerList.add(answer);
	   answer=new Answer();
	   answer.setAnswerNo(3);
	   answer.setAnswerDescription("Colombo");
	   answerList.add(answer);
	   answer=new Answer();
	   answer.setAnswerNo(4);
	   answer.setAnswerDescription("Trivandrum");
	   answerList.add(answer);
	   question.setAnswerList(answerList);
	   questionList.add(question);
	   
	   //second question
	   question=new Question();
	   question.setQuestionNo(2);
	   question.setDescription("Full Form of CPU?");	
	   answerList=new ArrayList<Answer>();
	   answer=new Answer();
	   answer.setAnswerNo(1);
	   answer.setAnswerDescription("Core Processing Unit");
	   answerList.add(answer);
	   answer=new Answer();
	   answer.setAnswerNo(2);
	   answer.setAnswerDescription("Core Processor Unit");	   
	   answerList.add(answer);
	   answer=new Answer();
	   answer.setAnswerNo(3);
	   answer.setAnswerDescription("Central Processing Unit");
	   answerList.add(answer);
	   answer=new Answer();
	   answer.setAnswerNo(4);
	   answer.setAnswerDescription("Central Processot Unit");
	   answerList.add(answer);
	 	
	   
	   question.setAnswerList(answerList);
	   questionList.add(question);
	   
	   //create Thread
	   MCQ mcq=new MCQ(questionList);
	   mcq.start();
	   
	   
	   
	   
	   	
	}

}
