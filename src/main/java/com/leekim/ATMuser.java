package com.leekim;

import java.util.Scanner;

public class ATMuser {

    private final ATM atm = new ATM();

    int accountBalance = 0;

    Scanner sc = new Scanner(System.in);

    public void CardIn () {
        atm.cardIn();
    }

    public void Deposit () {
        if (atm.cardInserted) {
            System.out.print("출금할 금액을 입력해주세요 : ");
            int numD = sc.nextInt();
            atm.deposit(numD);
        } else {
            System.out.println("삽입되어 있는 카드가 없습니다. 카드를 삽입해 주세요.");
        }
    }
    public void Withdraw() {
        if (atm.cardInserted) {
            System.out.print("출금할 금액을 입력해주세요 : ");
            int numW = sc.nextInt();
            atm.withdraw(numW);
        } else {
            System.out.println("삽입되어 있는 카드가 없습니다. 카드를 삽입해주세요.");
        }
    }
    public void CardOut() {
        atm.cardOut();
    }
    public void End() {
        if (atm.cardInserted) {
            System.out.println("프로그램을 종료 할 수 없습니다.");
        }else {
            atm.cardInserted = false;
            System.out.println("프로그램을 종료합니다.");
        }
    }


}
