import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[]args){
    try(Scanner InputScore = new Scanner(System.in)){
    //統計三個班成績情況，每個班有5個同學
    //求出每一個班的平均分和所有班級的平均分
    //統計三個班及格人數，每個班有5個人
    double AllClassScore =0;
    int SaveStudent = 0;
    int AllClass = 3;
    int AllStudents = 5;
    double SaveLine = 60;
    for(int Class = 1; Class<=AllClass; Class++){
        double Score  = 0;
        for(int Student = 1 ; Student <= AllStudents; Student++){
            System.out.println("請輸入第"+Class+"班第"+Student+"位的成績:");
            double score = InputScore.nextDouble();
            Score += score;
            if(score>=SaveLine){
                SaveStudent++;
            }}
    double NewScore = Score/5;
    System.out.println("第"+AllClass+"班級的平均分為:"+NewScore);

    AllClassScore += NewScore;
        }    
    System.out.println("三個班的總平均分數為: "+ AllClassScore/3);
    System.out.println("三個班的總及格人數為: "+ SaveStudent);
}
}
}
