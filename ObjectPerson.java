package Basic_Projects;

public class ObjectPerson {
    public static void main(String[] args) {
        Person[] familyMember = new Person[3];

        familyMember[0] = new Person("Mateo",57,75.2,false);
        familyMember[1] = new Person("Alicia", 54,65.5, true);
        familyMember[2] = new Person("Giovanny", 25,67.7,false);

        for (int i = 0; i< familyMember.length; i++){
            System.out.println("/---Member #"+(i+1)+"---/");
            System.out.println("Name: "+familyMember[i].getName());
            System.out.println("Age: "+familyMember[i].getAge());
            System.out.println("Weight: "+familyMember[i].getWeight());
            System.out.println("Retiree: "+familyMember[i].isRetiree());
        }
    }
}
