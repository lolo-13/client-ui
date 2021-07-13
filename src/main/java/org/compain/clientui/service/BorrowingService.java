package org.compain.clientui.service;

import lombok.Data;
import org.compain.clientui.consumer.BorrowingProxy;
import org.compain.clientui.model.Borrowing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class BorrowingService {

    @Autowired
    private BorrowingProxy borrowingProxy;

    public List<Borrowing> getUserBorrowing(String token){
        return borrowingProxy.getUserBorrowing(token);
    }

    public void renewalBorrowing(String token, Long idBorrowing){
        borrowingProxy.renewalBorrowing(token, idBorrowing);
    }
}
