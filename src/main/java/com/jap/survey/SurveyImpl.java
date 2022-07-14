package com.jap.survey;

import java.io.*;
import java.util.Arrays;

public class SurveyImpl {
    Survey survey = null;
    int countLines = 0;
    public Survey[] readFile(String fileName){
        try(FileReader f = new FileReader(fileName);
            BufferedReader br = new BufferedReader(f)){

            String line = br.readLine();
            while((line = br.readLine())!=null) {
                countLines++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("count - "+countLines);
        Survey[] surveys = new Survey[countLines];
        try(
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);

        )
        {

            String line = br.readLine();
            int index = 0;
            while((line = br.readLine())!=null)
            {
                String [] data = line.split(",");
                survey = new Survey();
                survey.setYear(Integer.parseInt(data[0]));
                survey.setType(data[1]);
                survey.setSurveyQuestionNumber(data[2]);
                survey.setSurveyQuestion(data[3]);
                survey.setOrganizationalSupportResource(data[4]);
                survey.setAgree(Double.parseDouble(data[5]));
                survey.setNeutral(Double.parseDouble(data[6]));
                survey.setDisagree(Double.parseDouble(data[7]));
                surveys[index] = survey;
                index++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return surveys;
    }
    public void writeToTheFile(String fileName, String data){
        File file= new File(fileName);
        try(FileWriter fw = new FileWriter(file,true);) {
            fw.append(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SurveyImpl fw = new SurveyImpl();
        fw.writeToTheFile("D:\\Java-Course-Revamp-Demo-Code\\Course4\\Sprint3\\Demonstrations\\" +
                "demo-2-survey-information\\demo-2-survey-information\\src\\main\\resources\\employee-survey.csv","\n2019, " +
                "Survey Response, Q3-5, The following adequately support my work-related needs:, " +
                "Risk Management/Worker’s Compensation, 45.9, 40.7, 4.6");
        System.out.println("read from the file");
        Survey [] surveys = fw.readFile("D:\\Java-Course-Revamp-Demo-Code\\Course4\\Sprint3\\Demonstrations\\" +
                "demo-2-survey-information\\demo-2-survey-information\\src\\main\\resources\\employee-survey.csv");
        System.out.println("surveys"+surveys.length);
        for(Survey s : surveys){
            System.out.println(s);
        }



    }
}
