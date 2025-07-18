package br.com.bellato.gerenciador_fifa.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estatisticas_atleta")
public class EstatisticaAtleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "atleta_id", nullable = false)
    private Atleta atleta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clube_id", nullable = false)
    private Clube clube;

    @Column(name = "atletaGols")
    private Integer gols;

    @Column(name = "atletaAssistencias")
    private Integer assistencias;

    @Column(name = "atletaDataInicio")
    private LocalDate dataInicio;

    @Column(name = "atletaDataFim")
    private LocalDate dataFim;

    public EstatisticaAtleta() {
    }

    public EstatisticaAtleta(Long id, Atleta atleta, Clube clube, Integer gols, Integer assistencias,
            LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.atleta = atleta;
        this.clube = clube;
        this.gols = gols;
        this.assistencias = assistencias;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "EstatisticaAtleta [id=" + id + ", atleta=" + atleta + ", clube=" + clube + ", gols=" + gols
                + ", assistencias=" + assistencias + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + "]";
    }

}
