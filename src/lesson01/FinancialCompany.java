package lesson01;

import lesson09.Company;

public class FinancialCompany extends Company {

    public FinancialCompany(String name, String countryFounded) {
        super(name, countryFounded);
    }

    void demostrateProtectedModifier() {
        System.out.println(this.code);
    }

}
