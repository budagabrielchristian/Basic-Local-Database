public class People{

    String name;
    String date;
    String gender;
    String favColor;

    People(){
        this.name=null;
        this.date=null;
        this.gender=null;
        this.favColor=null;
    }
    People(String name, String date,String favColor ,String gender){
        this.name=name;
        this.date=date;
        this.favColor=favColor;
        this.gender=gender;
    }
    //---------------------------------------------------
    protected void setName(String name){
        this.name=name;
    }
    protected void setDate(String date){
        this.date=date;
    }
    protected void setFavColor(String favColor){
        this.favColor=favColor;
    }
    protected void setGender(String gender){
        this.gender=gender;
    }

    //---------------------------------------------------
    protected String getName(){
        return this.name;
    }
    protected String getGender(){
        return this.gender;
    }
    protected String getFavColor(){
        return this.favColor;
    }
    protected String getDate(){
        return this.date;
    }
    //---------------------------------------------------

    protected void printData(){
        System.out.println(' ');
        System.out.println("---------------------------------------------");
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Date Of Birth: "+this.date);
        System.out.println("---------------------------------------------");
        System.out.println(' ');
    }
}