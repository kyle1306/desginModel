package com.atguigu.demo.builder;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基10米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }
    
    @Override
    public void buildRoofed() {
        System.out.println("高楼吊顶");
    }
}
