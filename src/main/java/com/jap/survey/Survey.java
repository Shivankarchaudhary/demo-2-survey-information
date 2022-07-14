package com.jap.survey;

public class Survey {
    private int year;
    private String type;
    private String surveyQuestionNumber;
    private String surveyQuestion;
    private  String organizationalSupportResource;
    private double agree;
    private double neutral;
    private double disagree;

    public Survey(int year, String type, String surveyQuestionNumber, String surveyQuestion, String organizationalSupportResource, double agree, double neutral, double disagree) {
        this.year = year;
        this.type = type;
        this.surveyQuestionNumber = surveyQuestionNumber;
        this.surveyQuestion = surveyQuestion;
        this.organizationalSupportResource = organizationalSupportResource;
        this.agree = agree;
        this.neutral = neutral;
        this.disagree = disagree;
    }

    public Survey() {
    }

    @Override
    public String toString() {
        return "Survey{" +
                "year=" + year +
                ", type='" + type + '\'' +
                ", surveyQuestionNumber='" + surveyQuestionNumber + '\'' +
                ", surveyQuestion='" + surveyQuestion + '\'' +
                ", organizationalSupportResource='" + organizationalSupportResource + '\'' +
                ", agree=" + agree +
                ", neutral=" + neutral +
                ", disagree=" + disagree +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSurveyQuestionNumber() {
        return surveyQuestionNumber;
    }

    public void setSurveyQuestionNumber(String surveyQuestionNumber) {
        this.surveyQuestionNumber = surveyQuestionNumber;
    }

    public String getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

    public String getOrganizationalSupportResource() {
        return organizationalSupportResource;
    }

    public void setOrganizationalSupportResource(String organizationalSupportResource) {
        this.organizationalSupportResource = organizationalSupportResource;
    }

    public double getAgree() {
        return agree;
    }

    public void setAgree(double agree) {
        this.agree = agree;
    }

    public double getNeutral() {
        return neutral;
    }

    public void setNeutral(double neutral) {
        this.neutral = neutral;
    }

    public double getDisagree() {
        return disagree;
    }

    public void setDisagree(double disagree) {
        this.disagree = disagree;
    }
}
