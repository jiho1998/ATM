package com.leekim;

public class ATM {

    private int accountBalance = 10000000;
    public boolean cardInserted;


    public void cardIn() {
        if (cardInserted) {
            System.out.println("이미 삽입되어 있는 카드가 있습니다.");
        } else {
            this.cardInserted = true;
            System.out.println("카드가 삽입되었습니다.");
        }
    }

    public void withdraw(int withdrawAmount) {
        if (!cardInserted) {
            System.out.println("카드를 먼저 삽입해주세요.");
            return;
        }
        if (withdrawAmount > accountBalance){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        accountBalance -= withdrawAmount;
        totalAccount();

    }
    public void deposit (int depositAmount) {
        if (!cardInserted){
            System.out.println("카드를 먼저 삽입해주세요. ");
            return;
        }
        accountBalance += depositAmount;
        totalAccount();

    }
    public void cardOut(){
        if (!cardInserted) {
            System.out.println("카드가 없습니다. ");
        }else {
            cardInserted = false;
            System.out.println("카드가 나왔습니다. 감사합니다.");
        }
    }
    private void totalAccount() {
        System.out.println("현재 계좌 잔액 : " + accountBalance + "원");
    }
}
