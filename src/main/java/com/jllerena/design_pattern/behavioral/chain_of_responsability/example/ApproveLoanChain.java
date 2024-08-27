package com.jllerena.design_pattern.behavioral.chain_of_responsability.example;

public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void creditCardRequest(int totalLoan);
}
