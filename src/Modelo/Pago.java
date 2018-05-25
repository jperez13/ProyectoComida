/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jackw
 */
public class Pago {
    private int id_pago;
    private int monto_pagado;
    private Medio_Pago medio_pago_id_medio_pago;

    public Pago() {
    }

    public Pago(int id_pago, int monto_pagado, Medio_Pago medio_pago_id_medio_pago) {
        this.id_pago = id_pago;
        this.monto_pagado = monto_pagado;
        this.medio_pago_id_medio_pago = medio_pago_id_medio_pago;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getMonto_pagado() {
        return monto_pagado;
    }

    public void setMonto_pagado(int monto_pagado) {
        this.monto_pagado = monto_pagado;
    }

    public Medio_Pago getMedio_pago_id_medio_pago() {
        return medio_pago_id_medio_pago;
    }

    public void setMedio_pago_id_medio_pago(Medio_Pago medio_pago_id_medio_pago) {
        this.medio_pago_id_medio_pago = medio_pago_id_medio_pago;
    }
    
    
}
