package projetomps.com.notech.model;

import android.arch.persistence.room.Entity;

import java.io.Serializable;

@Entity(tableName = "denuncia_table")
public class Denuncia implements Serializable {
    private int quantidadeDeDenuncias;
    private String texto;
    private String tipoDaDenuncia;

    public Denuncia(int quantidadeDeDenuncias, String texto, String tipoDaDenuncia) {
        this.quantidadeDeDenuncias = quantidadeDeDenuncias;
        this.texto = texto;
        this.tipoDaDenuncia = tipoDaDenuncia;
    }


    //GETs

    public int getQuantidadeDeDenuncias() {
        return quantidadeDeDenuncias;
    }

    public String getTexto() {
        return texto;
    }

    public String getTipoDaDenuncia() {
        return tipoDaDenuncia;
    }


    //SETs
    public void setQuantidadeDeDenuncias(int quantidadeDeDenuncias) {
        this.quantidadeDeDenuncias = quantidadeDeDenuncias;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setTipoDaDenuncia(String tipoDaDenuncia) {
        this.tipoDaDenuncia = tipoDaDenuncia;
    }
}
