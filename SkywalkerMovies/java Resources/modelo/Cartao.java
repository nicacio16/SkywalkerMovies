
package modelo;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cartao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCard;
    @Column(nullable = false, unique=true)
    private int numCartao;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date validade;
    @Column(nullable = false)
    private int codSeguranca;

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }
  
    
}
