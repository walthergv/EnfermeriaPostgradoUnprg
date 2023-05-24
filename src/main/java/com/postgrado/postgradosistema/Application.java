package com.postgrado.postgradosistema;

import com.postgrado.postgradosistema.cliente.FrmPrincipal;
import com.postgrado.postgradosistema.logic.*;
import com.postgrado.postgradosistema.modelo.*;

public class Application {
    public static void main(String[] args) {
        FrmPrincipal frmPrincipal = new FrmPrincipal();
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.setVisible(true);
    }
}
