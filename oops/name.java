public class name {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String a){
        firstName = a;
    }
    public void setLastName(String a){
        lastName = a;
    }
    public void setAge(int a){
        if (a >0 && a<=100){
            age = a;
        }else{
            age = 0;
        }
    }
    public name( String a, String b, int t){
        System.out.println("Three argument constructor is called");
        this ("None" , "None" , 0);
        firstName = a;
        lastName = b;
        age = t;
    }
    public String getFirstName(){
        boolean IsFirstNameEmpty = firstName.isEmpty();
        if (IsFirstNameEmpty){
            return "First name is Empty";
        }
        return firstName;
    }
    public String getLastName(){
        boolean IsLastNameEmpty =  lastName.isEmpty();
        if (IsLastNameEmpty){
            return "Last name is Empty";
        }
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getFullName(){
        boolean IsFirstNameEmpty = firstName.isEmpty();
        boolean IsLastNameEmpty =  lastName.isEmpty();
        if (IsFirstNameEmpty){
            return "Sorry can't print coz First name is Empty";
        }
        if (IsLastNameEmpty){
            return "Sorry can't print coz Last name is Empty";
        }
        return firstName+" "+lastName;
    }

}
