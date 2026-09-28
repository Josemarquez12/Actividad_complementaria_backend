package modelo;

/**
 Un empleado comercial ES UN EmpleadoBase, pero además recibe una comisión
 porcentual sobre su salario base.
 */
public class EmpleadoComercial extends EmpleadoBase {

    private double porcentajeComision; // atributo exclusivo de la clase hija

    public EmpleadoComercial(String cedula, String nombre,
                             double salarioBase, double porcentajeComision) {
        super(cedula, nombre, salarioBase); // llama al constructor del padre
        this.porcentajeComision = porcentajeComision;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    @Override
    public double calcularSalarioTotal() {
        // Salario base + el porcentaje de comisión calculado sobre ese salario
        return super.calcularSalarioTotal() + getSalarioBase() * porcentajeComision / 100;
    }

    @Override
    public String getTipo() {
        return "Comercial";
    }
}
