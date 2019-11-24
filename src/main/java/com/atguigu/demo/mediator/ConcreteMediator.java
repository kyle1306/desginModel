package com.atguigu.demo.mediator;

import java.util.HashMap;

// 具体的中介者对象
public class ConcreteMediator extends Mediator {
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);

        if(colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine",colleagueName);
        }else if (colleague instanceof Curtains){
            interMap.put("Curtains",colleagueName);
        }else if (colleague instanceof TV){
            interMap.put("TV",colleagueName);
        }

    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {

        if (colleagueMap.get(colleagueName) instanceof Alarm){//
            if (stateChange == 0){
                ((CoffeeMachine)colleagueMap.get(interMap.get("CoffeeMachine"))).startCoffee();
                ((TV)colleagueMap.get(interMap.get("TV"))).startTV();
            }else if (stateChange == 1){
                ((TV)colleagueMap.get(interMap.get("TV"))).stopTV();
            }
        }else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)colleagueMap.get(interMap.get("Curtains"))).upCurtains();
        }else if (colleagueMap.get(colleagueName) instanceof TV){
            //如果TV发出的消息，在此处理
        }else if (colleagueMap.get(colleagueName) instanceof Curtains){
            //如果窗帘发出的消息，在此处理
        }

    }

    @Override
    public void sendMessage() {

    }
}
