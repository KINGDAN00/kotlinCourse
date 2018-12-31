package TravailPratique

fun main(args:Array<String>){
    val pers=clsPersonne("Baruka","Dan","M","Goma/himbi")
    val parent=clsParent("Gestiion Informatique",4)
    val agent=clsAgent(2000.0,"Licence","Service")
}

open class clsPersonne(var nom:String, var postnom:String, var sexe:String, var adresse:String){
    open fun AffichePers(){
        println("le Nom : $nom")
        println("le PostNom : $postnom")
        println("le PreNom : $sexe")
        println("L'Adresse : $adresse")
    }
}

class  clsParent(var fonction:String,var nombreEnfant:Int):clsPersonne(nom="BARAKA",postnom = "CLAUDE",sexe = "M",adresse = "Himbi"){
    override fun AffichePers() {
        super.AffichePers()
        println("Fonction= $fonction")
        println("NombreEnfant:=$nombreEnfant")
    }
}

class  clsAgent(var salaireBase:Double,var Grade:String,var Affectation:String):clsPersonne(nom="BARUKA",postnom = "DAN",sexe = "M",adresse = "Himbi"){
    override fun AffichePers() {
        super.AffichePers()
        println("Salaire: $salaireBase")
        println("Grade : $Grade")
        println("Affectation : $Affectation")
    }
}

