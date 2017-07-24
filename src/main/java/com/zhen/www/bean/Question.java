package com.zhen.www.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Question {
    private int questionId;
    private String questionTitle;
    private String questionSummary;
    private Date questionTime;
    private Integer questionStatus;
    private String questionAuthor;
    private Integer questionMenuid;

    @Id
    @Column(name = "question_id")
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    @Basic
    @Column(name = "question_title")
    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    @Basic
    @Column(name = "question_summary")
    public String getQuestionSummary() {
        return questionSummary;
    }

    public void setQuestionSummary(String questionSummary) {
        this.questionSummary = questionSummary;
    }

    @Basic
    @Column(name = "question_time")
    public Date getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Date questionTime) {
        this.questionTime = questionTime;
    }

    @Basic
    @Column(name = "question_status")
    public Integer getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(Integer questionStatus) {
        this.questionStatus = questionStatus;
    }

    @Basic
    @Column(name = "question_author")
    public String getQuestionAuthor() {
        return questionAuthor;
    }

    public void setQuestionAuthor(String questionAuthor) {
        this.questionAuthor = questionAuthor;
    }

    @Basic
    @Column(name = "question_menuid")
    public Integer getQuestionMenuid() {
        return questionMenuid;
    }

    public void setQuestionMenuid(Integer questionMenuid) {
        this.questionMenuid = questionMenuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (questionId != question.questionId) return false;
        if (questionTitle != null ? !questionTitle.equals(question.questionTitle) : question.questionTitle != null)
            return false;
        if (questionSummary != null ? !questionSummary.equals(question.questionSummary) : question.questionSummary != null)
            return false;
        if (questionTime != null ? !questionTime.equals(question.questionTime) : question.questionTime != null)
            return false;
        if (questionStatus != null ? !questionStatus.equals(question.questionStatus) : question.questionStatus != null)
            return false;
        if (questionAuthor != null ? !questionAuthor.equals(question.questionAuthor) : question.questionAuthor != null)
            return false;
        if (questionMenuid != null ? !questionMenuid.equals(question.questionMenuid) : question.questionMenuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = questionId;
        result = 31 * result + (questionTitle != null ? questionTitle.hashCode() : 0);
        result = 31 * result + (questionSummary != null ? questionSummary.hashCode() : 0);
        result = 31 * result + (questionTime != null ? questionTime.hashCode() : 0);
        result = 31 * result + (questionStatus != null ? questionStatus.hashCode() : 0);
        result = 31 * result + (questionAuthor != null ? questionAuthor.hashCode() : 0);
        result = 31 * result + (questionMenuid != null ? questionMenuid.hashCode() : 0);
        return result;
    }
}
