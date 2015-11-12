package test;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Frederic on 20/01/14.
 */
@Entity
@javax.persistence.Table(name = "legal_customer", schema = "", catalog = "crm")
public class LegalCustomerEntity {
    private long id;

    @Id
    @javax.persistence.Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Short active;

    @Basic
    @javax.persistence.Column(name = "active")
    public Short getActive() {
        return active;
    }

    public void setActive(Short active) {
        this.active = active;
    }

    private String activityBranchCode;

    @Basic
    @javax.persistence.Column(name = "activity_branch_code")
    public String getActivityBranchCode() {
        return activityBranchCode;
    }

    public void setActivityBranchCode(String activityBranchCode) {
        this.activityBranchCode = activityBranchCode;
    }

    private String financialNote;

    @Basic
    @javax.persistence.Column(name = "financial_note")
    public String getFinancialNote() {
        return financialNote;
    }

    public void setFinancialNote(String financialNote) {
        this.financialNote = financialNote;
    }

    private String nationalCode;

    @Basic
    @javax.persistence.Column(name = "national_code")
    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    private BigDecimal outstandingAmount;

    @Basic
    @javax.persistence.Column(name = "outstanding_amount")
    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    private Byte payementIncident;

    @Basic
    @javax.persistence.Column(name = "payement_incident")
    public Byte getPayementIncident() {
        return payementIncident;
    }

    public void setPayementIncident(Byte payementIncident) {
        this.payementIncident = payementIncident;
    }

    private String type;

    @Basic
    @javax.persistence.Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Integer version;

    @Basic
    @javax.persistence.Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    private String address1;

    @Basic
    @javax.persistence.Column(name = "address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    @Basic
    @javax.persistence.Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String address3;

    @Basic
    @javax.persistence.Column(name = "address3")
    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    private String countryCode;

    @Basic
    @javax.persistence.Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    private String fax;

    @Basic
    @javax.persistence.Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;

    @Basic
    @javax.persistence.Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String town;

    @Basic
    @javax.persistence.Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    private String zipCode;

    @Basic
    @javax.persistence.Column(name = "zip_code")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private BigDecimal turnover;

    @Basic
    @javax.persistence.Column(name = "turnover")
    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LegalCustomerEntity that = (LegalCustomerEntity) o;

        if (id != that.id) return false;
        if (active != null ? !active.equals(that.active) : that.active != null) return false;
        if (activityBranchCode != null ? !activityBranchCode.equals(that.activityBranchCode) : that.activityBranchCode != null)
            return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (financialNote != null ? !financialNote.equals(that.financialNote) : that.financialNote != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nationalCode != null ? !nationalCode.equals(that.nationalCode) : that.nationalCode != null) return false;
        if (outstandingAmount != null ? !outstandingAmount.equals(that.outstandingAmount) : that.outstandingAmount != null)
            return false;
        if (payementIncident != null ? !payementIncident.equals(that.payementIncident) : that.payementIncident != null)
            return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (town != null ? !town.equals(that.town) : that.town != null) return false;
        if (turnover != null ? !turnover.equals(that.turnover) : that.turnover != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (active != null ? active.hashCode() : 0);
        result = 31 * result + (activityBranchCode != null ? activityBranchCode.hashCode() : 0);
        result = 31 * result + (financialNote != null ? financialNote.hashCode() : 0);
        result = 31 * result + (nationalCode != null ? nationalCode.hashCode() : 0);
        result = 31 * result + (outstandingAmount != null ? outstandingAmount.hashCode() : 0);
        result = 31 * result + (payementIncident != null ? payementIncident.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (town != null ? town.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (turnover != null ? turnover.hashCode() : 0);
        return result;
    }
}
