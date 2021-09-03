package ywl.dto;

public class GspwPreparation {
    private Integer preparationId;

    private Integer preparationConstructionplanId;

    private String preparationJiaodi;

    private String preparationLantu;

    private String preparationPiao;

    private String preparationJiedi;

    public Integer getPreparationId() {
        return preparationId;
    }

    public void setPreparationId(Integer preparationId) {
        this.preparationId = preparationId;
    }

    public Integer getPreparationConstructionplanId() {
        return preparationConstructionplanId;
    }

    public void setPreparationConstructionplanId(Integer preparationConstructionplanId) {
        this.preparationConstructionplanId = preparationConstructionplanId;
    }

    public String getPreparationJiaodi() {
        return preparationJiaodi;
    }

    public void setPreparationJiaodi(String preparationJiaodi) {
        this.preparationJiaodi = preparationJiaodi == null ? null : preparationJiaodi.trim();
    }

    public String getPreparationLantu() {
        return preparationLantu;
    }

    public void setPreparationLantu(String preparationLantu) {
        this.preparationLantu = preparationLantu == null ? null : preparationLantu.trim();
    }

    public String getPreparationPiao() {
        return preparationPiao;
    }

    public void setPreparationPiao(String preparationPiao) {
        this.preparationPiao = preparationPiao == null ? null : preparationPiao.trim();
    }

    public String getPreparationJiedi() {
        return preparationJiedi;
    }

    public void setPreparationJiedi(String preparationJiedi) {
        this.preparationJiedi = preparationJiedi == null ? null : preparationJiedi.trim();
    }
}