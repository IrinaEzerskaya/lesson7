package com.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.println("Сумма 1+2+3 = "+c1.sumAll(1,2,3));
        System.out.println("Всего создано "+c2.getInstanceCount()+" классов");

        Contract someContract = new Contract();
        someContract.number = 123;
        someContract.date = "01.01.2021";
        someContract.items = new String[] { "A", "B", "C"};

        Act newAct = Contract2Act(someContract);
        System.out.println("Сконвертирован контракт в акт от "+newAct.date);

    }

    /**
     * Статический метод конвертации договора в акт (на вход передаем договор, на выходе получаем акт).
     * @param contract
     * @return
     */
    public static Act Contract2Act(Contract contract) {

        Act newAct = new Act();
        newAct.number = contract.number;
        newAct.date = contract.date;
        newAct.items = contract.items;

        return newAct;
    }
}
