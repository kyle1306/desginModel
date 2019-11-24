package com.atguigu.demo.state;

public class StateClient {
    public static void main(String[] args) {
        // 创建活动对象，奖品有1个
        RaffleActivity activity = new RaffleActivity(1);

        // 我们连续抽300次奖
        for (int i = 0; i < 300; i++) {
            System.out.println("----------第" + (i+1) + "次抽奖--------");
            // 参加抽奖，第一步：扣除积分
            activity.deductMoney();
            // 第二步 抽奖
            activity.raffle();
        }

    }
}
