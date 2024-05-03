package models;

public class Titulo {
    private String name;
    private int strartDate;
    private double evaluation;
    private boolean includedInBasicPlan;
    private String synopsis;
    private int durationTimeperMinutes;

    public void sampleTechnicalSheet(){
        System.out.println("****Ficha TECNICA****");
        System.out.println("Nombre del titulo: " + name);
        System.out.println("Fecha de lanzamiento: " + strartDate);
        System.out.println("Tiempo de duracion: " + getDurationTimeperMinutes() + " minutos");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrartDate() {
        return strartDate;
    }

    public void setStrartDate(int strartDate) {
        this.strartDate = strartDate;
    }

    public boolean isIncludedInBasicPlan() {
        return includedInBasicPlan;
    }

    public void setIncludedInBasicPlan(boolean includedInBasicPlan) {
        this.includedInBasicPlan = includedInBasicPlan;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getDurationTimeperMinutes() {
        return durationTimeperMinutes;
    }

    public void setDurationTimeperMinutes(int durationTimeperMinutes) {
        this.durationTimeperMinutes = durationTimeperMinutes;
    }
}
