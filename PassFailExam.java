class PassFailExam extends PassFailActivity{
    int numberOfQuestions, numberMissed;
    double pointsPerQuestion;

    PassFailExam(int questions, int missed, double minPassing){
        super(minPassing);
        numberOfQuestions=questions;
        numberMissed=missed;
    }

    double getPointsEach(){
        return numberOfQuestions;
    }

    int getNumberMissed(){
        return numberMissed;
    }
}