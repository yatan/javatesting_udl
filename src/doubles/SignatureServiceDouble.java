/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

import data.Signature;
import data.Vote;
import services.SignatureService;

/**
 *
 * @author Francisco Romero Batallé
 */
public class SignatureServiceDouble implements SignatureService{

    @Override
    public Signature sign(Vote vote) {
        return new Signature(vote.getOption().getBytes());
    }
    
}
