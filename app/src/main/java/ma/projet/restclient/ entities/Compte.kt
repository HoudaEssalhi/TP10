package ma.projet.restclient.entities

import android.provider.DocumentsContract
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@DocumentsContract.Root(name = "item", strict = false)
class Compte {
    // Setters
    // Getters
    @get:javax.xml.bind.annotation.XmlElement(name = "id")
    @Element(name = "id")
    var id: Long? = null

    @get:javax.xml.bind.annotation.XmlElement(name = "solde")
    @Element(name = "solde")
    var solde: Double = 0.0

    @get:javax.xml.bind.annotation.XmlElement(name = "type")
    @Element(name = "type")
    var type: String? = null

    @get:javax.xml.bind.annotation.XmlElement(name = "dateCreation")
    @Element(name = "dateCreation")
    var dateCreation: String? = null

    // Constructeur par défaut
    constructor()

    // Constructeur avec paramètres
    constructor(id: Long?, solde: Double, type: String?, dateCreation: String?) {
        this.id = id
        this.solde = solde
        this.type = type
        this.dateCreation = dateCreation
    }

    // Méthode toString pour affichage et débogage
    override fun toString(): String {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", type='" + type + '\'' +
                ", dateCreation='" + dateCreation + '\'' +
                '}'
    }
}