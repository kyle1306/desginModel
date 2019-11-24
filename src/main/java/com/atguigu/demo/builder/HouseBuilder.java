package com.atguigu.demo.builder;

public abstract class HouseBuilder { // 抽象建造者
    protected House house = new House();

    // 将建造的流程写好，抽象方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoofed();

    // 建造房子，将产品返回
    public House buildHouse(){
        return house;
    }

    //public void buildBasic() {
    //    house.buildBasic();
    //}
    //
    //public void buildWall() {
    //    house.buildWall();
    //}
    //
    //public void roofed() {
    //    house.roofed();
    //}

    //public void build() {
    //    buildBasic();
    //    buildWall();
    //    roofed();
    //}
}
