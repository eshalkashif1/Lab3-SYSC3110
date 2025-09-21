public class buddyInfo {

    private String name;
    private int age;

    public buddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public buddyInfo() {
        name="Friend";
        age=20;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }




    public static void main(String[] args) {
        buddyInfo bud1 = new buddyInfo("Lily", 21);
        System.out.println(("Hello " + bud1.getName()));

    }

}
