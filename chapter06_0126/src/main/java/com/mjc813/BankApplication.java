package com.mjc813;

import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;

@Getter
@Setter
class Account {
    private String ano;
    private String owner;
    private int balance;

    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
    public void setBalance(int balance) {
        if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
            return;
        }
        this.balance = balance;
    }
}

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = 0;
            try {
                selectNo = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("----------\n계좌생성\n----------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(ano, owner, balance);
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println("----------\n계좌목록\n----------");
        for (Account account : accountArray) {
            if (account != null) {
                System.out.printf("%-10s %-10s %-10d\n", account.getAno(), account.getOwner(), account.getBalance());
            }
        }
    }

    private static void deposit() {
        System.out.println("----------\n예금\n----------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    private static void withdraw() {
        System.out.println("----------\n출금\n----------");
        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }

        int currentBalance = account.getBalance();
        if (currentBalance < money) {
            System.out.println("결과: 잔액이 부족합니다.");
        } else {
            account.setBalance(currentBalance - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    private static Account findAccount(String ano) {
        for (Account account : accountArray) {
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}