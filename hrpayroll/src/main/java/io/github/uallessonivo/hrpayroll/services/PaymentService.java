package io.github.uallessonivo.hrpayroll.services;

import io.github.uallessonivo.hrpayroll.entities.Payment;
import io.github.uallessonivo.hrpayroll.entities.Worker;
import io.github.uallessonivo.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
