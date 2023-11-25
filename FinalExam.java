class FinalExam extends GradeActivity{
    int numberOfQuestions, numberMissed;
    double pointPerQuestion;

    FinalExam(int questions, int missed){
        numberOfQuestions=questions;
        numberMissed=missed;
    }

    double getPointsPerQuestion(){
        return numberOfQuestions;
    }
    int getNumberMissed(){
        return numberMissed;
    }
}