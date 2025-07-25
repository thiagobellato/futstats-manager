package br.com.bellato.gerenciador_fifa.dto.estatistica_atleta;

import com.fasterxml.jackson.annotation.JsonInclude;

public class EstatisticaAtletaRequestDTO {

   @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer gols;
    private Integer assistencias;
    private Long atletaId;
    private Long ClubeId;

    public Long getAtletaId() {
        return atletaId;
    }

    public void setAtletaId(Long atletaId) {
        this.atletaId = atletaId;
    }

    public Long getClubeId() {
        return ClubeId;
    }

    public void setClubeId(Long clubeId) {
        ClubeId = clubeId;
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(Integer assistencias) {
        this.assistencias = assistencias;
    }

}
