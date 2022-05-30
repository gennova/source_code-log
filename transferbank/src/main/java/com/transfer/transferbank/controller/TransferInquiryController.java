package com.transfer.transferbank.controller;

import com.transfer.transferbank.entity.TransferInquiryDto;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class TransferInquiryController {


    @GetMapping("/transfer/inquiry")
    public List<TransferInquiryDto> getData(){
        return Arrays.asList(new TransferInquiryDto("rina","4755321","localhost","500000","IDR","7500","014"));
    }

    @PostMapping("/transfer")
    public List<TransferInquiryDto> postBody(@RequestBody String idAddrs, String amount, String admFee, String bankDestination, String toAcc) {
        return Arrays.asList(new TransferInquiryDto("rina","4755321","localhost","500000","IDR","7500","014"));
    }
/*
    public ResponseEntity transferInquiry(@RequestBody TransferInquiryDto transferInquiryDto){
        TransferInquiryImpl transferInquiryImplementation = new TransferInquiryImpl();
        transferInquiryDto.setIpAddress("localhost");
        transferInquiryDto.setAmount("500000");
        transferInquiryDto.setAdminFee("7500");
        transferInquiryDto.setBankDestinantionCode("014");
        transferInquiryDto.setToAccount("4755321");
        return transferInquiryImplementation.getInquiry(transferInquiryDto);
    }

 */
}
