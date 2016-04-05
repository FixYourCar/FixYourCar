package com.fixyourcar.fixyourcar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Hilton on 27/03/2016.
 */
public class MainActivity extends Activity {

    /*declaração da variável do tipo EditText, o mesmo tipo do objeto de entrada de dados do nosso
    *layout. Essa variável serve para armazenar a referencia ao objeto da tela, para podermos
    * realizar alteralções no mesmo.
    */
    private EditText nomeEditText;

    @Override   //Esse método é essencial
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Definindo qual será o layout dessa activity:
        setContentView(R.layout.activity_main);

        //Obtendo a referencia ao objeto nomeEditText (entrada de texto do layout activity_main)
        nomeEditText = (EditText) findViewById(R.id.nomeEditText);

    }

    //Esse método é executado quando o usuário clica no botão "Entrar"
    public void logar(View v) {
        /*Aqui, cria-se a intent que indica o desejo de se abrir outra activity. Para detalhar qual
        activity se quer abrir, no parâmetro do construtor da intent colocamos a ação da activity
        que queremos, ação esta que está registrada na tag <activity> referente a essa activity
        no arquivo AndroidManifest.xml. Nesse caso, queremos que quando esse método seja acionado, a
        activity FormularioActivity seja acionada.
         */
        Intent intent = new Intent(FormularioActivity.ACAO_CARREGAR);

        //Explicamos para o android qual a categoria da activity desejada através desse método:
        intent.addCategory(FormularioActivity.CATEGORIA_FORMULARIO);

        /*Pegamos o conteúdo do objeto nomeEditText e passamos para uma string. Essa string será
        passada como uma informação extra para a intent. Essa string contém nome do user, e a
        atividade FormularioActivity usará ela.
        */
        String nome = nomeEditText.getText().toString();

        //Enviando a informação extra:
        intent.putExtra(FormularioActivity.EXTRA_NOME_USUARIO, nome);

        //comando para iniciar a intent declarada acima:
        startActivity(intent);
    }
}
