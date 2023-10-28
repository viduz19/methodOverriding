class School {
    public void learning(){
        System.out.println(" grade 10 Students");
    }
}
class highSchool extends School{
    public void learning (){
        System.out.println(" grade 12 Students");
    }
}
class Run{
    public static void main(String[] args){
        highSchool hs = new highSchool ();
        hs.learning();
    }
}