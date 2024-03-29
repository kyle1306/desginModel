package com.atguigu.demo.state;

// 发放奖品的状态
public class DispenseState extends State {
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    // 发放奖品
    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            // 改变中奖状态为不能抽奖
            activity.setState(activity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发完了");
            // 改变状态为奖品发送完毕,后面就不可以发放奖品了
            activity.setState(activity.getDispenseOutState());
            //System.out.println("游戏结束");
            //System.exit(0);// 退出程序
        }
    }
}
