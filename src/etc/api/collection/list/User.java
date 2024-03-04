package etc.api.collection.list;

public class User {

    private String name;
    private int age;

    public User(String name, int age) { //생성자 생성
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "이름='" + name + '\'' +
                ", 나이=" + age +
                '}';
    } //초기값 안나옴 @@@
}

/*내가 작성
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    */




