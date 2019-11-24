package com.atguigu.demo.exam1;

import org.junit.Test;

import java.util.Objects;

public class HashTest {

    @Test
    public void testHashCode(){
        String str = "abc";
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }

    @Test
    public void testHashCode2(){
        Person p1 = new Person(1, "张三");
        Person p2 = new Person(1, "张三");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode()); // 重写自定义对象的equals()方法，必须重写hashCode()方法

    }


}
class Person{
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() &&
                getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}