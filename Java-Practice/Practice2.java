// example of encapsulation

class Special {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public Special() {
    }

    public Special(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println(this); // the sout of this here & in line number 31 is same...because 'this' is
                                  // referring to obj's address
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Practice2 {
    public static void main(String[] args) {
        Special spc = new Special();
        spc.setAge(10);
        System.out.println(spc);
        System.out.println(spc.getAge());

        Special spc2 = new Special(13, "Nitin"); // example of parameterized constructor
        System.out.println(spc2.getAge() + " : " + spc2.getName());
    }
}
