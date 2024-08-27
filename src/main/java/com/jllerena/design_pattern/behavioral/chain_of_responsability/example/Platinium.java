package com.jllerena.design_pattern.behavioral.chain_of_responsability.example;

public class Platinium implements ApproveLoanChain {

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if(totalLoan > 10000 && totalLoan <= 50000) {
            System.out.println("This card request can be managed by Platinium Card");
        } else {
            next.creditCardRequest(totalLoan);
        }
    }
}
