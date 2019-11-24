package com.atguigu.demo.builder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子吊顶");
    }
}
