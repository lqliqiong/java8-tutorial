package winterbe.java.treeMap;

/**
 * @author: lq
 * @CreateTime:2018-10-23 14:40
 * @Description:todo
 */
public class Person  implements Comparable {
    private String name;
    private Integer age;
    private String mind;



    @Override
    public int compareTo(Object o) {
        Person targetPerson = (Person)o;
        int ret = this.name.compareTo(targetPerson.getName());
        if(ret == 0){
            return Integer.compare(this.age,targetPerson.getAge());
        }
        if(ret == 0){
            return this.getMind().compareTo(targetPerson.getMind());
        }
        return ret;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String mind) {
        this.name = name;
        this.age = age;
        this.mind = mind;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mind='" + mind + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }
}

