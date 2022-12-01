public class Generic <T, P>{
    T name;

    P age;

    public T method(T soz,P san){
        return soz;
    }

    public Generic(T name, P age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public P getAge() {
        return age;
    }

    public void setAge(P age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
    public <R> R met(R maani){
        return maani;
    }
}
