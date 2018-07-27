/**
 * Java1 homework5
 * @Arkhipov Aleksandr
 * @version Jul 26, 2018
 */
public class Collaborator {

    public String fullname;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;


    public Collaborator(String fullname, String position, String email, String phone, int salary, int age){
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        System.out.println ( "Object data:"+"\nfullname:"+fullname+"\nposition:"+position+"\nemail:"+email+"\nphone:"+phone+"\nsalary:"+salary+"\nage:"+age ) ;
    }

}

class CreateBase{
    static Collaborator[] base1 = new Collaborator[5];

    public static void main(String[] args) {

        base1[0] = new Collaborator("Aleksandr", "manager", "aleksandr@email.ru", "89030000001", 10000, 20);
        base1[1] = new Collaborator("Stepan", "engineer", "stepan@email.ru", "89030000002", 10000, 20);
        base1[2] = new Collaborator("Petya", "developer", "petya@email.ru", "89030000003", 600000, 75);
        base1[3] = new Collaborator("Vladimir", "direktor", "vladimir@email.ru", "89030000004", 80000, 40);
        base1[4] = new Collaborator("Viktor", "boss", "viktor_boss@email.ru", "89030000005", 100000, 60);
        boolean flag1=true;
        System.out.print ("This person older 40:");
        for (int i = 0; i < base1.length; i++){
            if (base1[i].age>40){
                System.out.print ("\n\tFull name: "+base1[i].fullname+"\tPosition: "+base1[i].position+"\n\te-mail: "+base1[i].email+"\n\tphone: "+base1[i].phone+"\n\tsalary: "+base1[i].salary+"\n\tAge: "+base1[i].age+"\n");
                flag1 &= false;
            }
        }
        if (flag1 != false)
            System.out.print("\rThe person older 40 is absent");
    }
}
