package com.transfer.transferbank.logic;

import com.transfer.transferbank.entity.TransferInquiryDto;
import com.transfer.transferbank.entity.TransferInquiryResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class TransferInquiryImpl {
    

    public ResponseEntity getInquiry(TransferInquiryDto transferInquiryDto){

        filterDestinationAccount(transferInquiryDto);

        TransferInquiryResponseDto inquiryResult = sendToDestinationBank(transferInquiryDto);
        
        if(inquiryResult.getCode() == 404){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    private TransferInquiryResponseDto sendToDestinationBank(TransferInquiryDto transferInquiryDto){
        /**
         * Fungsi ini melanjutkan ke pihak bank yang di tuju 
         */
        
        return new TransferInquiryResponseDto();
    }

    private void filterDestinationAccount(TransferInquiryDto transferInquiryDto){
        if(transferInquiryDto.getToAccount().startsWith("4")){
            transferInquiryDto.setToAccount("");
        }
    }


}
