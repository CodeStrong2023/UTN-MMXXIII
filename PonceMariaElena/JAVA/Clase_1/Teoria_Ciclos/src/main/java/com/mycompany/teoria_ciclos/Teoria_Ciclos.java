

package com.mycompany.teoria_ciclos;

import BreakAndContinue.BreakAndContinue;
import CicloDoWhile.CicloDoWhile;
import CicloFor.CicloFor;
import CicloWhile.CicloWhile;
import Labels.Labels;

public class Teoria_Ciclos {
/*Ciclos*/
public static void main(String[] args) {
    CicloWhile cicloWhile = new CicloWhile();
    cicloWhile.cicloWhile();

    CicloDoWhile cicloDoWhile = new CicloDoWhile();
    cicloDoWhile.cicloDoWhile();

    CicloFor cicloFor = new CicloFor();
    cicloFor.cicloFor();

    BreakAndContinue breakAndContinue = new BreakAndContinue();
    breakAndContinue.breakContinue();

    Labels labels = new Labels();
    labels.labels();


}
    
}
