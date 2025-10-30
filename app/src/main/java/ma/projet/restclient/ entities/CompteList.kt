package ma.projet.restclient.entities

import android.provider.DocumentsContract
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@DocumentsContract.Root(name = "List", strict = false)
class CompteList {
    @ElementList(inline = true, entry = "item")
    var comptes: MutableList<Compte?>? = null
}