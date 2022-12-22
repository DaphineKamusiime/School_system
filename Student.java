class Student{
    String name;
    int age;
    int yearofentry;
    String course;
    String residenceStatus;
//constructor 
    public Student(String name, int age, int yearofentry, String course, String residenceStatus){
        this.name=name;
        this.age=age;
        this.yearofentry=yearofentry;
        this.course=course;
        this.residenceStatus=residenceStatus;

    }
//getter and setter methods

    public String getname(){
        return name;
    }
    public void setName(String newname){
        this.name= newname;
    }

    public int age(){
        return age;
    }
    public void setage(String newage){
        this.name= newage;
    }

    public int yearofentry (){
        return yearofentry;
    }
    public void setyearofentry(String newyearofentry){
        this.name= newyearofentry;
    }
    
    public String getresidenceStatus(){
        return residenceStatus;
    }
    public void setresidenceStatus(String newresidenceStatus){
        this.name= newresidenceStatus;
    }

    public void course(String course){
        if(course=="Computer Science"){
            System.out.println("_______");
        }
        else{
            System.out.println("=====");
        }
    }
}
