package com.example.verificationInera.soap;

import java.util.HashMap;
import java.util.List;
//Vad var tanken med detta?

public class DataSoapRequest {
    private List<String> personId;
    private List<String> personType;
    private List<String> careUnitHsaId;
    private HashMap<String,String> fromDateToDate;
    private List<String> sourceSystemHsaId;
    private List<String> careContactId;


    public List<String> getPersonId() {
        return personId;
    }

    public void setPersonId(List<String> personId) {
        this.personId = personId;
    }

    public List<String> getPersonType() {
        return personType;
    }

    public void setPersonType(List<String> personType) {
        this.personType = personType;
    }

    public List<String> getCareUnitHsaId() {
        return careUnitHsaId;
    }

    public void setCareUnitHsaId(List<String> careUnitHsaId) {
        this.careUnitHsaId = careUnitHsaId;
    }

    public HashMap<String, String> getFromDateToDate() {
        return fromDateToDate;
    }

    public void setFromDateToDate(HashMap<String, String> fromDateToDate) {
        this.fromDateToDate = fromDateToDate;
    }

    public List<String> getSourceSystemHsaId() {
        return sourceSystemHsaId;
    }

    public void setSourceSystemHsaId(List<String> sourceSystemHsaId) {
        this.sourceSystemHsaId = sourceSystemHsaId;
    }

    public List<String> getCareContactId() {
        return careContactId;
    }

    public void setCareContactId(List<String> careContactId) {
        this.careContactId = careContactId;
    }
}
