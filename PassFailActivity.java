class PassFailActivity extends GradeActivity{
    double minimumPassingScore;

    PassFailActivity(double min){
        minimumPassingScore=min;
    }

    char getGrade(){
        return super.getGrade();
    }
}