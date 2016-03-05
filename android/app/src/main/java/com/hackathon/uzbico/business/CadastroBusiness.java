package com.hackathon.uzbico.business;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.hackathon.uzbico.model.Cadastro;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.Response;

public class CadastroBusiness {

    public static boolean add(Context context, String cpf, String nome, String senha, String email, String fone) {
        Cadastro cad = new Cadastro(cpf, nome, senha, email, fone, 5);

        JsonObject json = new JsonObject();
        json.addProperty("cpf", cpf);
        json.addProperty("nome", nome);
        json.addProperty("senha", senha);
        json.addProperty("email", email);
        json.addProperty("telefone", fone);

        Ion.with(context).load("http://example.com/post")
                .setJsonObjectBody(json)
                .asJsonObject()
                .withResponse()
                .setCallback(new FutureCallback<Response<JsonObject>>() {
                    @Override
                    public void onCompleted(Exception e, Response<JsonObject> result) {

                    }
                });

        return true;
    }

    public static Cadastro add(String cpf, String nome, String senha, String email, String fone) {
        Cadastro cad = null;
        // cad = getBy(id);
        cad.setCpf(cpf);
        cad.setNome(nome);
        cad.setSenha(senha);
        cad.setEmail(email);
        cad.setFone(fone);
        return cad;
    }

}
