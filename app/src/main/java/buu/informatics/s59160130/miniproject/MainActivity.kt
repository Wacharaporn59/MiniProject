package buu.informatics.s59160130.miniproject

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var data1:data = data("","","")
    private var data2:data = data("","","")
    private var data3:data = data("","","")

    var blank01 = "blank"
    var blank02 = "blank"
    var blank03 = "blank"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.box01).setOnClickListener {
            showEdit01(it)

        }

        findViewById<TextView>(R.id.box02).setOnClickListener {
            showEdit02(it)
        }

        findViewById<TextView>(R.id.box03).setOnClickListener {
            showEdit03(it)
        }

        findViewById<Button>(R.id.update01).setOnClickListener {
            update01(it)
        }

        findViewById<Button>(R.id.update02).setOnClickListener {
            update02(it)
        }

        findViewById<Button>(R.id.update03).setOnClickListener {
            update03(it)
        }

        findViewById<Button>(R.id.delete01).setOnClickListener {
            delete01(it)
        }

        findViewById<Button>(R.id.delete02).setOnClickListener {
            delete02(it)
        }

        findViewById<Button>(R.id.delete03).setOnClickListener {
            delete03(it)
        }

        findViewById<Button>(R.id.back01).setOnClickListener {
            back01(it)
        }

        findViewById<Button>(R.id.back02).setOnClickListener {
            back02(it)
        }

        findViewById<Button>(R.id.back03).setOnClickListener {
            back03(it)
        }




    }


    private fun showEdit01(view:View){
        val License1 = findViewById<EditText>(R.id.licenceText01)
        val Brand1 = findViewById<EditText>(R.id.brandText01)
        val Name1 = findViewById<EditText>(R.id.nameText01)
        val Update1 = findViewById<Button>(R.id.update01)
        val Delete1 = findViewById<Button>(R.id.delete01)
        val Back1 = findViewById<Button>(R.id.back01)
        License1.visibility = View.VISIBLE
        Brand1.visibility = View.VISIBLE
        Name1.visibility = View.VISIBLE
        Update1.visibility = View.VISIBLE
        Delete1.visibility = View.VISIBLE
        Back1.visibility = View.VISIBLE

        val License2 = findViewById<EditText>(R.id.licenceText02)
        val Brand2 = findViewById<EditText>(R.id.brandText02)
        val Name2 = findViewById<EditText>(R.id.nameText02)
        val Update2 = findViewById<Button>(R.id.update02)
        val Delete2 = findViewById<Button>(R.id.delete02)
        val Back2 = findViewById<Button>(R.id.back02)
        License2.visibility = View.GONE
        Brand2.visibility = View.GONE
        Name2.visibility = View.GONE
        Update2.visibility = View.GONE
        Delete2.visibility = View.GONE
        Back2.visibility = View.GONE

        val License3 = findViewById<EditText>(R.id.licenceText03)
        val Brand3 = findViewById<EditText>(R.id.brandText03)
        val Name3 = findViewById<EditText>(R.id.nameText03)
        val Update3 = findViewById<Button>(R.id.update03)
        val Delete3 = findViewById<Button>(R.id.delete03)
        val Back3 = findViewById<Button>(R.id.back03)
        License3.visibility = View.GONE
        Brand3.visibility = View.GONE
        Name3.visibility = View.GONE
        Update3.visibility = View.GONE
        Delete3.visibility = View.GONE
        Back3.visibility = View.GONE

        licenceText01.requestFocus()


    }

    private fun showEdit02(view:View){
        val License = findViewById<EditText>(R.id.licenceText02)
        val Brand = findViewById<EditText>(R.id.brandText02)
        val Name = findViewById<EditText>(R.id.nameText02)
        val Update = findViewById<Button>(R.id.update02)
        val Delete = findViewById<Button>(R.id.delete02)
        val Back = findViewById<Button>(R.id.back02)
        License.visibility = View.VISIBLE
        Brand.visibility = View.VISIBLE
        Name.visibility = View.VISIBLE
        Update.visibility = View.VISIBLE
        Delete.visibility = View.VISIBLE
        Back.visibility = View.VISIBLE

        val License1 = findViewById<EditText>(R.id.licenceText01)
        val Brand1 = findViewById<EditText>(R.id.brandText01)
        val Name1 = findViewById<EditText>(R.id.nameText01)
        val Update1 = findViewById<Button>(R.id.update01)
        val Delete1 = findViewById<Button>(R.id.delete01)
        val Back1 = findViewById<Button>(R.id.back01)
        License1.visibility = View.GONE
        Brand1.visibility = View.GONE
        Name1.visibility = View.GONE
        Update1.visibility = View.GONE
        Delete1.visibility = View.GONE
        Back1.visibility = View.GONE

        val License3 = findViewById<EditText>(R.id.licenceText03)
        val Brand3 = findViewById<EditText>(R.id.brandText03)
        val Name3 = findViewById<EditText>(R.id.nameText03)
        val Update3 = findViewById<Button>(R.id.update03)
        val Delete3 = findViewById<Button>(R.id.delete03)
        val Back3 = findViewById<Button>(R.id.back03)
        License3.visibility = View.GONE
        Brand3.visibility = View.GONE
        Name3.visibility = View.GONE
        Update3.visibility = View.GONE
        Delete3.visibility = View.GONE
        Back3.visibility = View.GONE

        licenceText02.requestFocus()

    }

    private fun showEdit03(view:View){
        val License = findViewById<EditText>(R.id.licenceText03)
        val Brand = findViewById<EditText>(R.id.brandText03)
        val Name = findViewById<EditText>(R.id.nameText03)
        val Update = findViewById<Button>(R.id.update03)
        val Delete = findViewById<Button>(R.id.delete03)
        val Back = findViewById<Button>(R.id.back03)
        License.visibility = View.VISIBLE
        Brand.visibility = View.VISIBLE
        Name.visibility = View.VISIBLE
        Update.visibility = View.VISIBLE
        Delete.visibility = View.VISIBLE
        Back.visibility = View.VISIBLE

        val License1 = findViewById<EditText>(R.id.licenceText01)
        val Brand1 = findViewById<EditText>(R.id.brandText01)
        val Name1 = findViewById<EditText>(R.id.nameText01)
        val Update1 = findViewById<Button>(R.id.update01)
        val Delete1 = findViewById<Button>(R.id.delete01)
        val Back1 = findViewById<Button>(R.id.back01)
        License1.visibility = View.GONE
        Brand1.visibility = View.GONE
        Name1.visibility = View.GONE
        Update1.visibility = View.GONE
        Delete1.visibility = View.GONE
        Back1.visibility = View.GONE

        val License2 = findViewById<EditText>(R.id.licenceText02)
        val Brand2 = findViewById<EditText>(R.id.brandText02)
        val Name2 = findViewById<EditText>(R.id.nameText02)
        val Update2 = findViewById<Button>(R.id.update02)
        val Delete2 = findViewById<Button>(R.id.delete02)
        val Back2 = findViewById<Button>(R.id.back02)
        License2.visibility = View.GONE
        Brand2.visibility = View.GONE
        Name2.visibility = View.GONE
        Update2.visibility = View.GONE
        Delete2.visibility = View.GONE
        Back2.visibility = View.GONE

        licenceText03.requestFocus()

    }

    private fun update01(view:View){
        val License1 = findViewById<EditText>(R.id.licenceText01)
        val Brand1 = findViewById<EditText>(R.id.brandText01)
        val Name1 = findViewById<EditText>(R.id.nameText01)
        val Update1 = findViewById<Button>(R.id.update01)
        val Delete1 = findViewById<Button>(R.id.delete01)
        val Back1 = findViewById<Button>(R.id.back01)
        data1.license = License1.toString()
        data1.brand = Brand1.toString()
        data1.name = Name1.toString()

        blank01 = "unblank"
        License1.visibility = View.GONE
        Brand1.visibility = View.GONE
        Name1.visibility = View.GONE
        Update1.visibility = View.GONE
        Delete1.visibility = View.GONE
        Back1.visibility = View.GONE

        box01.text = blank01

        val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)

    }

    private fun update02(view:View){
        val License2 = findViewById<EditText>(R.id.licenceText02)
        val Brand2 = findViewById<EditText>(R.id.brandText02)
        val Name2 = findViewById<EditText>(R.id.nameText02)
        val Update2 = findViewById<Button>(R.id.update02)
        val Delete2 = findViewById<Button>(R.id.delete02)
        val Back2 = findViewById<Button>(R.id.back02)
        data2.license = License2.toString()
        data2.brand = Brand2.toString()
        data2.name = Name2.toString()


        blank02 = "unblank"
        License2.visibility = View.GONE
        Brand2.visibility = View.GONE
        Name2.visibility = View.GONE
        Update2.visibility = View.GONE
        Delete2.visibility = View.GONE
        Back2.visibility = View.GONE
        box02.text = blank02
        val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun update03(view:View){
        val License3 = findViewById<EditText>(R.id.licenceText03)
        val Brand3 = findViewById<EditText>(R.id.brandText03)
        val Name3 = findViewById<EditText>(R.id.nameText03)
        val Update3 = findViewById<Button>(R.id.update03)
        val Delete3 = findViewById<Button>(R.id.delete03)
        val Back3 = findViewById<Button>(R.id.back03)
        data3.license = License3.toString()
        data3.brand = Brand3.toString()
        data3.name = Name3.toString()

        blank03 = "unblank"
        License3.visibility = View.GONE
        Brand3.visibility = View.GONE
        Name3.visibility = View.GONE
        Update3.visibility = View.GONE
        Delete3.visibility = View.GONE
        Back3.visibility = View.GONE
        box03.text = blank03

        val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)

    }

    private fun delete01(view:View){
        val License1 = findViewById<EditText>(R.id.licenceText01)
        val Brand1 = findViewById<EditText>(R.id.brandText01)
        val Name1 = findViewById<EditText>(R.id.nameText01)
        val Update1 = findViewById<Button>(R.id.update01)
        val Delete1 = findViewById<Button>(R.id.delete01)
        val Back1 = findViewById<Button>(R.id.back01)
        data1.license = ""
        data1.brand = ""
        data1.name = ""
        License1.text.clear()
        Brand1.text.clear()
        Name1.text.clear()
        License1.text.clear()
        License1.visibility = View.GONE
        Brand1.visibility = View.GONE
        Name1.visibility = View.GONE
        Update1.visibility = View.GONE
        Delete1.visibility = View.GONE
        Back1.visibility = View.GONE

        blank01 = "blank"
        box01.text = blank01

        val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun delete02(view:View){
        val License2 = findViewById<EditText>(R.id.licenceText02)
        val Brand2 = findViewById<EditText>(R.id.brandText02)
        val Name2 = findViewById<EditText>(R.id.nameText02)
        val Update2 = findViewById<Button>(R.id.update02)
        val Delete2 = findViewById<Button>(R.id.delete02)
        val Back2 = findViewById<Button>(R.id.back02)
        data1.license = ""
        data1.brand = ""
        data1.name = ""
        License2.text.clear()
        Brand2.text.clear()
        Name2.text.clear()
        License2.text.clear()
        License2.visibility = View.GONE
        Brand2.visibility = View.GONE
        Name2.visibility = View.GONE
        Update2.visibility = View.GONE
        Delete2.visibility = View.GONE
        Back2.visibility = View.GONE

        blank02 = "blank"
        box02.text = blank02
        val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)

    }

    private fun delete03(view:View){
        val License3 = findViewById<EditText>(R.id.licenceText03)
        val Brand3 = findViewById<EditText>(R.id.brandText03)
        val Name3 = findViewById<EditText>(R.id.nameText03)
        val Update3 = findViewById<Button>(R.id.update03)
        val Delete3 = findViewById<Button>(R.id.delete03)
        val Back3 = findViewById<Button>(R.id.back03)
        data1.license = ""
        data1.brand = ""
        data1.name = ""
        License3.text.clear()
        Brand3.text.clear()
        Name3.text.clear()
        License3.text.clear()
        License3.visibility = View.GONE
        Brand3.visibility = View.GONE
        Name3.visibility = View.GONE
        Update3.visibility = View.GONE
        Delete3.visibility = View.GONE
        Back3.visibility = View.GONE

        blank03 = "blank"
        box03.text = blank03

        val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun back01(view:View){
        val License1 = findViewById<EditText>(R.id.licenceText01)
        val Brand1 = findViewById<EditText>(R.id.brandText01)
        val Name1 = findViewById<EditText>(R.id.nameText01)
        val Update1 = findViewById<Button>(R.id.update01)
        val Delete1 = findViewById<Button>(R.id.delete01)
        val Back1 = findViewById<Button>(R.id.back01)
        License1.visibility = View.GONE
        Brand1.visibility = View.GONE
        Name1.visibility = View.GONE
        Update1.visibility = View.GONE
        Delete1.visibility = View.GONE
        Back1.visibility = View.GONE
    }

    private fun back02(view:View){
        val License2 = findViewById<EditText>(R.id.licenceText02)
        val Brand2 = findViewById<EditText>(R.id.brandText02)
        val Name2 = findViewById<EditText>(R.id.nameText02)
        val Update2 = findViewById<Button>(R.id.update02)
        val Delete2 = findViewById<Button>(R.id.delete02)
        val Back2 = findViewById<Button>(R.id.back02)
        License2.visibility = View.GONE
        Brand2.visibility = View.GONE
        Name2.visibility = View.GONE
        Update2.visibility = View.GONE
        Delete2.visibility = View.GONE
        Back2.visibility = View.GONE

    }

    private fun back03(view:View){
        val License3 = findViewById<EditText>(R.id.licenceText03)
        val Brand3 = findViewById<EditText>(R.id.brandText03)
        val Name3 = findViewById<EditText>(R.id.nameText03)
        val Update3 = findViewById<Button>(R.id.update03)
        val Delete3 = findViewById<Button>(R.id.delete03)
        val Back3 = findViewById<Button>(R.id.back03)
        License3.visibility = View.GONE
        Brand3.visibility = View.GONE
        Name3.visibility = View.GONE
        Update3.visibility = View.GONE
        Delete3.visibility = View.GONE
        Back3.visibility = View.GONE
    }

}
