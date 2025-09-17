public class SalaryCalculator {

    public static double salaryMultiplier(int daysSkipped) {
        if (daysSkipped >= 5) {
            return 0.85;
        } else {
            return 1.0;
        }
    }

    public static int bonusMultiplier(int productsSold) {
        if (productsSold >= 20) {
            return 13;
        } else {
            return 10;
        }
    }

    public static double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public static double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.0;
        double salary = baseSalary * salaryMultiplier(daysSkipped);
        salary += bonusForProductsSold(productsSold);

        if (salary > 2000.0) {
            salary = 2000.0;
        }
        return salary;
    }

}
