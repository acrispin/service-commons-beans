package com.unicon.api.commons.beans.obra;

import com.unicon.api.commons.beans.response.ResponseBean;

import java.io.Serializable;

public class ResponseObraBean extends ResponseBean implements Serializable {

    private static final long serialVersionUID = -6988192893617919087L;

    protected String cuadrante;

    public ResponseObraBean() {
        super();
    }

    public ResponseObraBean(String cuadrante) {
        super();
        this.cuadrante = cuadrante;
    }

    @Override
    public String toString() {
        return "ResponseObraBean{" +
                "cuadrante='" + cuadrante + '\'' +
                ", id=" + id +
                ", codigo='" + codigo + '\'' +
                ", estado=" + estado +
                ", mensaje='" + mensaje + '\'' +
                ", resultado=" + resultado +
                '}';
    }

    public String getCuadrante() {
        return cuadrante;
    }

    public void setCuadrante(String cuadrante) {
        this.cuadrante = cuadrante;
    }
}
