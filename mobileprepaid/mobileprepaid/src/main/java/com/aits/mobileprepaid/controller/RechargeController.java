package com.aits.mobileprepaid.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/auth")
public class RechargeController {

    @PostMapping("/recharge")
    public ResponseEntity<?> recharge(
        @RequestParam("userId") Long userId,
        @RequestParam("planId") Long planId,
        @RequestParam("PaymentMethod") String paymentMethod
    ) {
        // You can process the recharge here
        String message = "Recharge successful! " ;
        return ResponseEntity.ok(message);
    }
}