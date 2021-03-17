import java.util.List;
import java.util.ArrayList;

public class groupOfPeople extends People{

    List<People> peopleList= new ArrayList<>();



    public void addPerson(String name, String date, String favColor,String gender){
        peopleList.add(new People(name, date, favColor, gender));
    }

    public void getGroup(){ //Prints all the People objects from the peopleList
        for(People tmpName : peopleList){
            tmpName.printData();
        }
    }

    public void getByDate(String date){ //Prints the names of the people with their date==String date
       System.out.println(' ');
        System.out.println("---------------------------------------");
        System.out.println("People that are born in "+date+':');
            for(People tmpName : peopleList){
                if(tmpName.getDate().equals(date)){
                    System.out.println(tmpName.getName());
                }
            }
            System.out.println("---------------------------------------");
            System.out.println(' ');
        }

    public void getByName(String name){//Prints the data of the people that have the name== String name;

            for(People tmpName : peopleList){
                if(tmpName.getName().equals(name)){
                    tmpName.printData();
                }
            }
    }
    public void getByGender(String gender){//Prints the names of the people with the gender==String gender
        System.out.println(' ');
        System.out.println("---------------------------------------");
        System.out.println("People that are "+gender+':');
            for(People tmpName : peopleList){
                if(tmpName.getGender().equals(gender)){
                    System.out.println(tmpName.getName());
                }
            }
        System.out.println("---------------------------------------");
        System.out.println(' ');
    }
    public void getByFavoriteColor(String favColor){
        System.out.println(' ');
        System.out.println("---------------------------------------");
        System.out.println("People that like the color "+favColor+':');
        for(People tmpName : peopleList){
            if(tmpName.getFavColor()== favColor){
                System.out.println(tmpName.getName());
            }
        }
        System.out.println("---------------------------------------");
        System.out.println(' ');
    }


}
