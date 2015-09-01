
package tr.gov.ptt.tahsilatprj.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@RequestScoped

public class DummyBean {
    private String ad;
    private String sifre;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    public String sayfayaGit()
    {
        return "";
    }
    
}
