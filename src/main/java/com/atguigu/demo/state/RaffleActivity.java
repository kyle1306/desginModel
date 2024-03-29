package com.atguigu.demo.state;

import com.google.errorprone.annotations.Var;

public class RaffleActivity {
    //
    State state = null;
    // 奖品数量
    int count = 0;
    // 四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count) {
        // 初始化当前状态为noRaffleState(即不能抽奖的状态)
        // 初始化奖品的数量
        this.state = getNoRaffleState();
        this.count = count;
    }

    // 扣分，调用当前状态的deductMoney()
    public void deductMoney() {
        state.deductMoney();
    }

    // 抽奖
    public void raffle() {
        // 如果当前状态是抽奖成功
        if (state.raffle()) {
            state.dispensePrize();
        }
    }
    // 这里大家注意，每领取一次奖品，cout--
    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
