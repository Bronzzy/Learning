package coursegrade;

import java.util.Arrays;

public class CourseGrades implements Analyzable{
    private final int COUNT = 4;
    private GradedActivity[]grade=new GradedActivity[COUNT];


    public void setLab(GradedActivity lab){
        grade[0]=lab;
    }
    public void setPassFailExam(PassFailExam pfExam){
        grade[1]=pfExam;
    }
    public void setEssay(GradedActivity essay){
        grade[2]=essay;
    }
    public void setFinalExam(FinalExam finalExam){
        grade[3]=finalExam;
    }


    @Override
    public double getAverage() {
        double average=(grade[0].getScore()+grade[1].getScore()+grade[2].getScore()+grade[3].getScore())/4;
        return average;
    }

    @Override
    public GradedActivity getHighest() {
        int temp=0;
        for(int i=0;i<COUNT;i++){
            if(grade[i].getScore()>grade[temp].getScore())
                temp=i;
        }return grade[temp];
    }

    @Override
    public GradedActivity getLowest() {
        int temp=0;
        for(int i=0;i<COUNT;++i){
            if(grade[i].getScore()<grade[temp].getScore())
                temp=i;
        }return grade[temp];
    }
    @Override
    public String toString() {
        return "Lab score"+grade[0].getScore()+"\nPass Fail Exam"+grade[1].getScore()
                +"\nEssay Score"+grade[2].getScore()+"\nFinal Exam"+grade[3].getScore()+
                "\nAverage= "+getAverage()
                ;
    }
}
