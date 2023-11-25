public class GradeActivity{
    String name;
    double score;
    char grade;
    GradeActivity(String n){
        name=n;
    }

    void setScore(double s){
        Score=s;
    }

    double getScore(){
        return Score;
    }

    char getGrade(){
        if(Score>=85)
		grade='A';
		else if(Score>=80)
		grade='AB';
		else if(Score>=70)
		grade='B';
		else if(Score>=65)
		grade='BC';
		else if(Score>=60)
		grade='C';
		else if(Score>=40)
		grade='D';
		else
		grade='E';
		return grades;
    }
}