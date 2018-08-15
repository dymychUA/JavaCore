package lesson12;

public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {

        if (!checkWithdraw(user, amount))
            return;
        withdrawFromUserBalance(user, amount);
    }

    @Override
    public void fund(User user, int amount) {
        if (!checkFunding(user, amount))
            return;
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (!checkWithdraw(fromUser, amount))
            return;

        if (!checkFunding(toUser, amount))
            return;

        withdrawFromUserBalance(fromUser, amount);
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary() - user.getBank().getCommission(user.getSalary()));
    }

    private boolean checkFunding(User user, int amount) {
        return checkFundingLimits(user, amount, user.getBank().getLimitOfFunding());
    }

    private boolean checkFundingLimits(User user, int amount, double limit) {
        if (amount > limit) {
            printFundingErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printWithdrawErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printFundingErrorMsg(int amount, User user) {
        System.out.println("Can't fund money " + amount + " for user " + user.toString());
    }

    private void printWithdrawErrorMsg(int amount, User user) {
        System.out.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private void withdrawFromUserBalance(User user, int amount) {
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }
}