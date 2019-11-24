package com.atguigu.demo.builder;
// 产品 -》 product
public class House {

    private String base;
    private String wall;
    private String roofed;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    //public void buildBasic() {
    //    System.out.println("打地基了");
    //}
    //
    //public void buildWall() {
    //    System.out.println("砌墙了");
    //}
    //
    //public void roofed() {
    //    System.out.println("封顶了");
    //}

}
