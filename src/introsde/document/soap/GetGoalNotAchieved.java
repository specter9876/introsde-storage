
package introsde.document.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalNotAchieved complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalNotAchieved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalNotAchieved", propOrder = {
    "userId"
})
public class GetGoalNotAchieved {

    protected long userId;

    /**
     * Recupera il valore della proprietà userId.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Imposta il valore della proprietà userId.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

}
