package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    /**
     * RG-11515 (code de la fonctionnalité, numéro ticket Jira par exemple)
     * @param amount Le montant à prélever
     * @return bla bla
     */
    public ServiceResponseDTO<Float> debit(Float amount){
        // 2300 €
        // CAS : Erreur 789

        if(amount > 2300){
            return ServiceResponseDTO.buildResponse("789", "Solde insuffisant");
        }

        // on met tous les if qui traitent les cas erreur
        // Technique : Guard Close (early Return)

        // CAS : Succès 207
        return ServiceResponseDTO.buildResponseWithData("207", "Prélèvement effectué", 2300-amount);


    }

}
