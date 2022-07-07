package com.studentportal.studentportal.services;

import com.studentportal.studentportal.model.Transaction;
import com.studentportal.studentportal.repository.TransactionRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TransactionServiceImplem implements  TransactionServiceInterface {

  @Autowired
  private TransactionRepositoryInterface transactionRepository ;




  public Transaction saveTransaction(Transaction transaction){


    return transactionRepository.save(transaction);


  }


  public long numberOfTransactions(){


    return transactionRepository.count();
  }



  public List<Transaction>showAllRegistration(){


    return transactionRepository.findAll();


  }


}
