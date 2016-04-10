package com.fixyourcar.fixyourcar;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Hilton on 09/04/2016.
 */
public class CarroActivity extends Activity{

    //Declarando a ação e a categoria dessa activity para usar em intents:
    public static final String ACAO_CARRO = "com.fixyourcar.fixyourcar.ACAO_CARRO";
    public static final String CATEGORIA_CARRO =
            "com.fixyourcar.fixyourcar.CATEGORIA_CARRO";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulariocarro);
    }
}
