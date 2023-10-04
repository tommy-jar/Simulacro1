package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.dtos;

public class DessertDTO {
    private int anvcIdDessert;
    private String anvcNameDessert;
    private String anvcDescriptionDessert;
    private int anvcPreparationTimeDessert;
    private String anvcDifficultyDessert;
    private String anvcCategoryDessert;

    public DessertDTO() {
        // Inicialización de atributos si es necesario
    }

    public DessertDTO(int anvcIdDessert, String anvcNameDessert, String anvcDescriptionDessert, int anvcPreparationTimeDessert, String anvcDifficultyDessert, String anvcCategoryDessert) {
        this.anvcIdDessert = anvcIdDessert;
        this.anvcNameDessert = anvcNameDessert;
        this.anvcDescriptionDessert = anvcDescriptionDessert;
        this.anvcPreparationTimeDessert = anvcPreparationTimeDessert;
        this.anvcDifficultyDessert = anvcDifficultyDessert;
        this.anvcCategoryDessert = anvcCategoryDessert;
    }

    public int getAnvcIdDessert() {
        return anvcIdDessert;
    }

    public void setAnvcIdDessert(int anvcIdDessert) {
        this.anvcIdDessert = anvcIdDessert;
    }

    public String getAnvcNameDessert() {
        return anvcNameDessert;
    }

    public void setAnvcNameDessert(String anvcNameDessert) {
        this.anvcNameDessert = anvcNameDessert;
    }

    public String getAnvcDescriptionDessert() {
        return anvcDescriptionDessert;
    }

    public void setAnvcDescriptionDessert(String anvcDescriptionDessert) {
        this.anvcDescriptionDessert = anvcDescriptionDessert;
    }

    public int getAnvcPreparationTimeDessert() {
        return anvcPreparationTimeDessert;
    }

    public void setAnvcPreparationTimeDessert(int anvcPreparationTimeDessert) {
        this.anvcPreparationTimeDessert = anvcPreparationTimeDessert;
    }

    public String getAnvcDifficultyDessert() {
        return anvcDifficultyDessert;
    }

    public void setAnvcDifficultyDessert(String anvcDifficultyDessert) {
        this.anvcDifficultyDessert = anvcDifficultyDessert;
    }

    public String getAnvcCategoryDessert() {
        return anvcCategoryDessert;
    }

    public void setAnvcCategoryDessert(String anvcCategoryDessert) {
        this.anvcCategoryDessert = anvcCategoryDessert;
    }

    @Override
    public String toString() {
        return "DessertDTO{" +
                "anvcIdDessert=" + anvcIdDessert +
                ", anvcNameDessert='" + anvcNameDessert + '\'' +
                ", anvcDescriptionDessert='" + anvcDescriptionDessert + '\'' +
                ", anvcPreparationTimeDessert=" + anvcPreparationTimeDessert +
                ", anvcDifficultyDessert='" + anvcDifficultyDessert + '\'' +
                ", anvcCategoryDessert='" + anvcCategoryDessert + '\'' +
                '}';
    }
}
