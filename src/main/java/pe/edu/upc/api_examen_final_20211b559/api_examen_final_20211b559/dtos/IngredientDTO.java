package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.dtos;

public class IngredientDTO {
    private int anvcIdIngredient;
    private String anvcNameIngredient;
    private int anvcQuantityIngredient;
    private String anvcUnitMeasurementIngredient;

    public IngredientDTO() {
        // Inicialización de atributos si es necesario
    }

    public IngredientDTO(int anvcIdIngredient, String anvcNameIngredient, int anvcQuantityIngredient, String anvcUnitMeasurementIngredient) {
        this.anvcIdIngredient = anvcIdIngredient;
        this.anvcNameIngredient = anvcNameIngredient;
        this.anvcQuantityIngredient = anvcQuantityIngredient;
        this.anvcUnitMeasurementIngredient = anvcUnitMeasurementIngredient;
    }

    public int getAnvcIdIngredient() {
        return anvcIdIngredient;
    }

    public void setAnvcIdIngredient(int anvcIdIngredient) {
        this.anvcIdIngredient = anvcIdIngredient;
    }

    public String getAnvcNameIngredient() {
        return anvcNameIngredient;
    }

    public void setAnvcNameIngredient(String anvcNameIngredient) {
        this.anvcNameIngredient = anvcNameIngredient;
    }

    public int getAnvcQuantityIngredient() {
        return anvcQuantityIngredient;
    }

    public void setAnvcQuantityIngredient(int anvcQuantityIngredient) {
        this.anvcQuantityIngredient = anvcQuantityIngredient;
    }

    public String getAnvcUnitMeasurementIngredient() {
        return anvcUnitMeasurementIngredient;
    }

    public void setAnvcUnitMeasurementIngredient(String anvcUnitMeasurementIngredient) {
        this.anvcUnitMeasurementIngredient = anvcUnitMeasurementIngredient;
    }

    @Override
    public String toString() {
        return "IngredientDTO{" +
                "anvcIdIngredient=" + anvcIdIngredient +
                ", anvcNameIngredient='" + anvcNameIngredient + '\'' +
                ", anvcQuantityIngredient=" + anvcQuantityIngredient +
                ", anvcUnitMeasurementIngredient='" + anvcUnitMeasurementIngredient + '\'' +
                '}';
    }
}
