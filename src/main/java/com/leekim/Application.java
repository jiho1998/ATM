package com.leekim;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 사람이 ATM을 사용하는 프로그램 */
        /* 시스템 요구사항
        *  1. 계좌 잔고를 설정해준다.
        *  2. 사람은 카드삽입, 입금, 출금, 카드사출 을 할 수 있다.
        *  3. ATM은 카드 받기, 입금, 출금, 카드사출 이 가능하다.
        *  4. ATM은 처음에 카드가 없는 상태이다.
        *  5. 입금, 출금시 총 잔액이 나오게 설정한다.
        *  5. 사람이 먼저 카드를 넣는다. (카드가 들어있는 경우 "이미 삽입되어 있는 카드가 있습니다" 라는 문구 출력)
        *  6. ATM 출금은 계좌 잔액을 넘어갈 수 없다.
        *  7. 사람이 카드를 뽑으면 ATM은 "감사합니다" 라는 문구를 출력한다.
        *  8. 출금, 입금 중 일 때 카드를 사출 할 수 없다.
        * */

        /* 사람이 수신할 수 있는 메세지 (사람이 해야 할 일) */
        /* 1. 카드를 넣는다.
        *  2. 입금을 한다.
        *  3. 출금을 한다.
        *  4. 카드를 뽑는다.
        * */

        /* ATM이 수신할 수 있는 메세지 (ATM이 해야 할 일) */
        /* 1. 카드를 받는다.
        *  2. 입금을 받는다.
        *  3. 출금을 해준다.
        *  4. 잔액을 알려준다.
        *  5. 카드를 뽑아준다.
        * */

        ATMuser user = new ATMuser();
        Scanner sc = new Scanner(System.in);
        user.accountBalance = 0;

        while (true) {
            System.out.println("========= ATM =========");
            System.out.println("1. 카드 삽입");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 카드 사출");
            System.out.println("8. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    user.CardIn();
                    break;
                case 2:
                    user.Deposit();
                    break;
                case 3:
                    user.Withdraw();
                    break;
                case 4:
                    user.CardOut();
                    break;
                case 8:
                    user.End();
                    break;
                case 9:
                    System.out.println("감사합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");

            }
        }
    }
}
