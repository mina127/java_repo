package com.korit.study.ch02;

public class ComplexSalaryCalculator {
    public static void main(String[] args) {
        // 테스트 데이터
        int baseSalary = 4000000;
        int workYears = 12;
        int position = 3;
        int overtimeHours = 15;

        // 여기에 삼항 연산자를 사용한 계산 로직을 작성하세요
        // 직급수당 계산
        int positionAllowance = position == 1 ? 0 :
                position == 2 ? 500000 :
                position == 3 ? 1000000 :
                position == 4 ? 2000000 : -1;
        System.out.println(positionAllowance);

        double yearRate = workYears < 3 ? 0.0 : workYears < 7 ? 0.05 :
                        workYears < 15 ? 0.1 : 0.2;

        // 연차수당 계산 (기본급 기준 %)
        int yearAllowance = (int) (baseSalary * yearRate);

        // 야근수당 계산
        boolean isOverTime = overtimeHours - 10 > 0;
        int baseOvertime = isOverTime ? 10 : overtimeHours;
        int overTime = isOverTime ? overtimeHours - 10 : 0;
        int overtimePayment = isOverTime ? ((overtimeHours - 10) * 15000) + (10 * 10000) :
                overtimeHours * 10000;

        // 특별보너스 계산
        int specialBonus = position == 4 && workYears > 14 ? 500000 : 0;

        // 총 지급액 계산
        int totalSalary = baseSalary + positionAllowance +
                yearAllowance + overtimePayment + specialBonus;

        // 세금 계산
        double taxRate = totalSalary <= 5000000 ? 0.1 : 0.15;
        int tax = (int) (totalSalary * taxRate);

        // 실수령액 계산
        int finalSalary = totalSalary - tax;

        // 직급명 출력용
        String positionName = position == 1 ? "사원" :
                position == 2 ? "대리" :
                position == 3 ? "과장" :
                position == 4 ? "부장" : "미지정";

        // 결과 출력
        System.out.println("=== 급여 명세서 ===");
        System.out.println("기본급: " + String.format("%,d", baseSalary) + "원");
        System.out.println("직급: " + positionName);
        System.out.println("직급수당: " + String.format("%,d", positionAllowance) + "원");
        System.out.println(String.format("연차수당: %,d원", yearAllowance));
        System.out.printf("야근수당: %,d원 (기본 %d시간 + 초과 %d시간)\n", overtimePayment, baseOvertime, overTime);
        System.out.println("특별보너스: " + String.format("%,d", specialBonus) + "원");
//        기본급: 4,000,000원
//        직급: 과장
//        직급수당: 1,000,000원
//        연차수당: 400,000원 (10%)
//        야근수당: 175,000원 (기본 10시간 + 초과 5시간)
//        특별보너스: 0원
//        총 지급액: 5,575,000원
//        세금(15%): 836,250원
//        실수령액: 4,738,750원
    }
}
