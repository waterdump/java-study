package basic;

public class AcountingMethodApp {
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    public static void main(String[] args) {
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;

        double vat = getVAT();
        double total = getTotal();
        double expense = getExpense();
        double income = getIncome();
        double dividend1 = getDividend1();
        double dividend2 = getDividend2();
        double dividend3 = getDividend3();

        print(vat, total, expense, income, dividend1, dividend2, dividend3);
    }

    public static void print(double vat, double total, double expense, double income,
                             double dividend1, double dividend2, double dividend3) {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
    }

    public static double getVAT() {
        return valueOfSupply * vatRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    public static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static double getIncome() {
        return valueOfSupply - getExpense();
    }

    public static double getDividend1() {
        return getIncome() * 0.5;
    }

    public static double getDividend2() {
        return getIncome() * 0.3;
    }

    public static double getDividend3() {
        return getIncome() * 0.2;
    }
}