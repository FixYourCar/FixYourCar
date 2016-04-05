package com.fixyourcar.fixyourcar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Hilton on 04/04/2016.
 */
public class FormularioActivity extends Activity {

    /*Essas constantes declaram a ação, categoria e a informação extra dessa activity caso alguém
    queira acessá-la através de uma intent. Esses mesmos dados estão registrados com o mesmo nome
    no arquivo AndroidManifest na tag desta activity.
    */
    public static final String ACAO_CARREGAR =
            "com.fixyourcar.fixyourcar.ACAO_CARREGAR";

    public static final String EXTRA_NOME_USUARIO =
            "com.fixyourcar.fixyourcar.EXTRA_NOME_USUARIO";

    public static final String CATEGORIA_FORMULARIO =
            "com.fixyourcar.fixyourcar.CATEGORIA_FORMULARIO";

    private TextView msgTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //definindo qual será o layout usado por essa activity:
        setContentView(R.layout.formulario);

        //obtendo a intent que foi chamada
        Intent intent = getIntent();
        String saudacao = "Olá, ";
        msgTextView = (TextView) findViewById(R.id.msgTextView);
        /*mostra na tela uma mensagem de saudação com a string do nome do usuário, a qual é
        passada como informação extra através da intent da activity do login e recuperada por meio
        do método getStringExtra:
        */
        msgTextView.setText(saudacao + intent.getStringExtra(EXTRA_NOME_USUARIO));
    }

}
