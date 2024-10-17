package com.library.restpostgress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cnp;
    private String name;
    private int age;

    public Person(long cnp, String name, int age) {
        this.cnp = cnp;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
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
        return "Person{" +
                "cnp=" + cnp +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Person) {
            return (((Person) obj).cnp == this.cnp);
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return Math.toIntExact(7 * this.cnp);
    }
}
