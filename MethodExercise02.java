public class MethodExercise02 {
    public static void main(String[]args){
    
    }
}

class person{
    String Name;
    int age;
}
class Mytools{
    public person copyperson(person p){
        person p2 = new person();
        p2.Name = p.Name;
        p2.age = p.age;
        return p2;
    }
}