package basicCal.calculadora


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suma()
        resta()
        multiplicacion()
        dividir()
        iva()
        edad()
        numprimo()

    }
    fun suma(){
        var ingresoA=findViewById<EditText>(R.id.numA)
        var ingresoB=findViewById<EditText>(R.id.numB)
        var res=findViewById<TextView>(R.id.resultado)
        var botonS=findViewById<Button>(R.id.button_suma)

        botonS.setOnClickListener(){

            var n1: Int = (ingresoA.text.toString()).toInt()
            var n2: Int = (ingresoB.text.toString()).toInt()
            var total: String = (n1+n2).toString()

            res.setText( total )

        }
    }

    fun resta(){
        var ingresoA=findViewById<EditText>(R.id.numA)
        var ingresoB=findViewById<EditText>(R.id.numB)
        var res=findViewById<TextView>(R.id.resultado)
        var botonR=findViewById<Button>(R.id.button_resta)

        botonR.setOnClickListener(){

            var n1: Int = (ingresoA.text.toString()).toInt()
            var n2: Int = (ingresoB.text.toString()).toInt()
            var total: String = (n1-n2).toString()

            res.setText( total )

        }
    }

    fun multiplicacion(){
        var ingresoA=findViewById<EditText>(R.id.numA)
        var ingresoB=findViewById<EditText>(R.id.numB)
        var res=findViewById<TextView>(R.id.resultado)
        var botonM=findViewById<Button>(R.id.button_multi)

        botonM.setOnClickListener(){

            var n1: Int = (ingresoA.text.toString()).toInt()
            var n2: Int = (ingresoB.text.toString()).toInt()
            var total: String = (n1*n2).toString()

            res.setText( total )

        }

    }

    fun dividir(){
        var ingresoA=findViewById<EditText>(R.id.numA)
        var ingresoB=findViewById<EditText>(R.id.numB)
        var res=findViewById<TextView>(R.id.resultado)
        var botonD=findViewById<Button>(R.id.button_div)

        botonD.setOnClickListener(){

            var n1: Int = (ingresoA.text.toString()).toInt()
            var n2: Int = (ingresoB.text.toString()).toInt()
            var total: String = (n1/n2).toString()

            res.setText( total )

        }

    }

    fun iva(){
        var ingresoC = findViewById<EditText>(R.id.numVal)
        //resulltadoValidacion
        var validacion = findViewById<TextView>(R.id.resulltadoValidacion)
        var botonV =findViewById<Button>(R.id.boton_Iva)

        botonV.setOnClickListener(){
            var n1: Int = (ingresoC.text.toString()).toInt()
            var total: String = (n1+ (n1 * 0.12)).toString()

            validacion.setText( total )

        }



    }

    fun edad(){

        var ingresoC = findViewById<EditText>(R.id.numVal)
        //resulltadoValidacion
        var validacion = findViewById<TextView>(R.id.resulltadoValidacion)
        var botonY =findViewById<Button>(R.id.boton_mayormenor)

        botonY.setOnClickListener(){
            var n1: Int = (ingresoC.text.toString()).toInt()

            if (n1 >= 18 ){
                validacion.setText("Usted es mayor de edad")

            }else{
                validacion.setText("Usted es menor de edad")
            }

        }

    }


    fun numprimo(){

        var ingresoC = findViewById<EditText>(R.id.numVal)
        //resulltadoValidacion
        var validacion = findViewById<TextView>(R.id.resulltadoValidacion)
        var botonM =findViewById<Button>(R.id.boton_validar)

        botonM.setOnClickListener(){
            var n1: Int = (ingresoC.text.toString()).toInt()
            var total: Int = 0

            for (i in 2..n1 / 2){
                if (n1 % i == 0){
                    total+=i
                }

            }
            if (total == 0){
                validacion.setText("Primo")

            }else{
                validacion.setText("No primo")
            }

        }


    }



}