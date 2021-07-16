public class Model {

    private int consumo, costo;
    private byte estrato;
    private float descuento, total, descuentoTotal, impuestoTotal, totalTotal;

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public float getCosto() {
        return (float) costo;
    }

    public void setCosto(String servicio) {
        switch (servicio) {
            case "Energia":
                this.costo = 6200;
                break;
            case "Acueducto":
                this.costo = 9256;
                break;
            case "GasNatural":
                this.costo = 5234;
                break;
            default:
                this.costo = 0;
        }
    }

    public byte getEstrato() {
        return estrato;
    }

    public void setEstrato(byte estrato) {
        this.estrato = estrato;
    }

    public void setDescuento(byte estrato) {
        switch (estrato) {
            case 1:
            case 2:
                this.descuento = 0.5f;
                break;
            case 3:
            case 4:
                this.descuento = 0.1f;
                break;
            case 5:
            case 6:
                this.descuento = -0.25f;
                break;
            default:
                this.descuento = 0f;
        }
    }

    public float getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = this.consumo * this.costo;
    }

    public float getDescuentoTotal() {
        return descuentoTotal;
    }

    public float getImpuestoTotal() {
        return impuestoTotal;
    }

    public void setTotalDI() {
        this.descuentoTotal = this.descuento * this.total;
        this.impuestoTotal = 0.01f * this.total;
    }

    public float getTotalTotal() {
        return totalTotal;
    }

    public void setTotalTotal() {
        this.totalTotal = this.total - this.descuentoTotal + this.impuestoTotal;
    }
}