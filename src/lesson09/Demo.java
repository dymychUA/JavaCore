package lesson09;

import lesson09.utils.Checker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company("", "");
        System.out.println(company.getCountryFounded());
        System.out.println(company.getName());

        //company.name = "IBM";

        Checker checker = new Checker();
        //System.out.println(checker.checkCompanyName(company.name));
        //System.out.println(checker.companyNamesValidatedCount);

    }
}
