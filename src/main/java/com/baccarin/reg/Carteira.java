package com.baccarin.reg;

import com.baccarin.ativos.FundoImobiliario;
import com.baccarin.ativos.FundoInvestimento;
import java.util.ArrayList;

/**
 *
 * @author baccarin
 */
public class Carteira {

    private ArrayList<FundoImobiliario> fundosImobiliarios = new ArrayList<FundoImobiliario>();
    private ArrayList<FundoInvestimento> fundosInvestimentos = new ArrayList<FundoInvestimento>();
    private Corretora corretora;
}
