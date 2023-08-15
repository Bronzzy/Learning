package coursegrade;

public class Main {
    public static void main(String[]args){
        CourseGrades grade=new CourseGrades();

        GradedActivity lab=new GradedActivity();
        lab.setScore(85);
        grade.setLab(lab);

        PassFailExam pfExam=new PassFailExam(10,2,70);
        pfExam.setScore(85);
        grade.setPassFailExam(pfExam);

        GradedActivity essay=new GradedActivity();
        essay.setScore(70);
        grade.setEssay(essay);

        FinalExam examFinal=new FinalExam(50,5);
        examFinal.setScore(70);
        grade.setFinalExam(examFinal);

        System.out.println(grade);
        GradedActivity high= grade.getHighest();
        System.out.println("Highest Score"+high.getScore());
        GradedActivity low= grade.getLowest();
        System.out.println("Lowest Score"+low.getScore());


    }
}
