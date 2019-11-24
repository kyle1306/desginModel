package com.atguigu.demo.state;
// 奖品方法完毕的状态
// 说明 当我们activity 改变成DispenseOutState,抽奖活动结束
public class DispenseOutState extends State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {

    }

    @Override
    public boolean raffle() {
        return false;
    }

    @Override
    public void dispensePrize() {

    }
}
