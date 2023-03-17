package com.serenitydojo.banking;

import com.serenitydojo.banking.InterestYieldingBonds;
import com.serenitydojo.banking.Portfolio;
import com.serenitydojo.banking.SavingsAccount;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenCalculatingMonthlyInterest {

    @Test
    public void shouldCalculateForSavingsAccounts(){

        //GIVEN
        SavingsAccount savingsAccount = new SavingsAccount(1200,0.01);

        //WHEN
        double earnedInterest =  savingsAccount.calculateMonthlyInterest();

        //THEN
        assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test
    public void shouldCalculateInterestForBonds(){

        //GIVEN
        InterestYieldingBonds bonds = new InterestYieldingBonds(1200.0, 0.01);

        //WHEN
        double earnedInterest = bonds.calculateMonthlyInterest();

        //THEN
        assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test
    public void calculateInterestEarnedInPortfolio(){

        //GIVEN
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(1200,0.01));
        portfolio.add(new InterestYieldingBonds(1200.0, 0.01));

        //WHEN
        double totalEarnedInterest = portfolio.calculateMonthlyInterest();

        //THEN
        assertThat(totalEarnedInterest).isEqualTo(2.0);

    }
}
