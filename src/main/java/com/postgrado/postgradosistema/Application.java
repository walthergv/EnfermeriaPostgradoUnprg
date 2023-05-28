package com.postgrado.postgradosistema;

import com.postgrado.postgradosistema.cliente.FrmPrincipal;
import com.postgrado.postgradosistema.logic.*;
import com.postgrado.postgradosistema.modelo.*;
import login.FrmLogin1;

public class Application {
    public static void main(String[] args) {
       // FrmPrincipal frmPrincipal = new FrmPrincipal();
        FrmLogin1 frmLogin1 = new FrmLogin1();
        frmLogin1.setLocationRelativeTo(null);
        frmLogin1.setVisible(true);
    }
}
