package com.springbank.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springbank.api.model.Loans;
import com.springbank.api.repository.LoanRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@AllArgsConstructor
@RestController
public class LoansController {


    private LoanRepository loanRepository;
    @GetMapping("/loans")
    public List<Loans> getLoanDetails(@RequestParam int id) {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(id);
        if (loans != null ) {
            return loans;
        }else {
            return null;
        }
    }
}
