package Modle.entity;

public class Person extends Entity {
    private byte age;
    private Sexuality sexuality;

    public void setAge(byte age) {
        this.age = age;
    }

    public void setSexuality(Sexuality sexuality) {
        this.sexuality = sexuality;
    }
}
