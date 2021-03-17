public class Main{
    public static void main(String[] args){
        groupOfPeople group= new groupOfPeople();
group.addPerson("Olaf Farrington", "27.11.2004","Yellow","Male");
group.addPerson("Jarvis Akhtar","21.04.1994","Blue", "Male");
group.addPerson("Graham Moreno", "11.05.1988","Blue","Male");
group.addPerson("Lillie-Rose Madden", "27.11.2004","Purple","Female");

            // Tests for the code: 

//Printing the data from all of the people from the group:

group.getGroup();

//Print the information of a person by knowing their name:

group.getByName("Jarvis Akhtar");
group.getByName("Lillie-Rose Madden");
//Get the people that are born on a certain date:

group.getByDate("27.11.2004");
group.getByDate("11.05.1988");
//Get the people that have the same gender:

group.getByGender("Male");
group.getByGender("Female");
//Get the people that have the same favorite color:
group.getByFavoriteColor("Blue");
group.getByFavoriteColor("Purple");
    }
}