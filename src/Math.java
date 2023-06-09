public class Math {
    String name;
    int age;
    Laptop laptop;


    public Math (String name, int age, Laptop laptop) {
        this.name = name;
        this.age = age*2;
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Math{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", laptop='" + laptop + '\'' +
                '}';
    }

    public Math(){
  }


}
