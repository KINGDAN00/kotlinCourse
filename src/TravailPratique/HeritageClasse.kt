package TravailPratique

fun main(args:Array<String>){
    val pers=clsPersonne("Binja","Marie","M","Katoyi")
    val parent=clsParent("Maintenance Informatique",4)
    val agent=clsAgent(100.0,"Moyen","Service Informatique")
}




open class clsPersonne(var nom:String, var postnom:String, var sexe:String, var adresse:String){
    open fun AffichePers(){

        println("1. Nom : $nom")
        println("2. Post-Nom : $postnom")
        println("3. PreNom : $sexe")
        println("4. Adresse : $adresse")
    }
}

class  clsParent(var fonction:String,var nombreEnfant:Int):clsPersonne(nom="Bahati",postnom = "Lunba",sexe = "M",adresse = "Himbi"){
    override fun AffichePers() {
        super.AffichePers()
        println("Fonction= $fonction")
        println("NombreEnfant:=$nombreEnfant")
    }
}

class  clsAgent(var salaireBase:Double,var Grade:String,var Affectation:String):clsPersonne(nom="Kaseke",postnom = "Grace",sexe = "M",adresse = "Himbi"){
    override fun AffichePers() {
        super.AffichePers()
        println("Salaire: $salaireBase")
        println("Grade : $Grade")
        println("Affectation : $Affectation")
    }
}

