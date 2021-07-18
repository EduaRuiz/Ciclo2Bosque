public class Model {

    private int consumo, costo;
    private byte estrato;
    private float descuento, total, impuesto, totalPagar;

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public float getCosto() {
        return (float) costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public byte getEstrato() {
        return estrato;
    }

    public void setEstrato(byte estrato) {
        this.estrato = estrato;
    }

    public void setDescuento(float porcentaje) {
        this.descuento = this.total * porcentaje;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.consumo * this.costo;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto() {
        this.impuesto = this.total * 0.01f;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar() {
        this.totalPagar = this.total - this.descuento + this.impuesto;
    }
}