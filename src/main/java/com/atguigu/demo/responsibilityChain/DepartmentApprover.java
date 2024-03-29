package com.atguigu.demo.responsibilityChain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <=5000){
            System.out.println("请求编号id=" +purchaseRequest.getId() + "被" + this.name +"处理");
        }else {
            // 交给下一个处理者处理
            approver.processRequest(purchaseRequest);
        }
    }
}
