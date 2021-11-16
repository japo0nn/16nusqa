package com.company;

public class Flower {
    private Petal petal;
    private Bud bud;
    private String name;
    private String Color;

    public Flower(String name, String col) {
        this.name = name;
        this.Color = col;
        this.petal = new Petal();
        this.bud = new Bud();
    }
    // расцвели

    public void blossom() {
        System.out.println(name + " расцвел");
    }

    public void wilt() {
        petal.bloss(name);
    }

    public void color() {
        bud.coll(name, Color);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        Flower flower = (Flower) obj;

        if (obj == null || getClass() != obj.getClass()) return false;

        if(!petal.equals(flower.petal))
            return false;

        if(!bud.equals(flower.bud))
            return false;

        return name.equals(flower.name);

    }

    @Override
    public int hashCode() {
        int result = petal.hashCode() + bud.hashCode();
        result = 23 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Цветок :" + name;
    }
}