package ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_recyclerview.Add1
import com.example.homework_recyclerview.Currency
import com.example.homework_recyclerview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupFun()
    }

    private fun setupFun(){
        val currencyAdapter = Adapter()
        val currencyManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        findViewById<RecyclerView>(R.id.recyclerView).apply {
            adapter = currencyAdapter
            layoutManager = currencyManager
        }

        val currencyList = listOf(
            Currency("1 500 000", "Тенге, Казахстан ", R.drawable.image_1),
            Currency("23450","Доллары, США", R.drawable.image_1_2),
            Currency("23450","Лира, Турция", R.drawable.image_1_3),
            Currency("23450","Евро, EC", R.drawable.image_1_4),
            Currency("23450","Доллары, США", R.drawable.image_1_5),
            Currency("23450","Доллары, США", R.drawable.image_1_2),
            Currency("23450","Доллары, США", R.drawable.image_1_2),
            Currency("23450","Лира, Турция", R.drawable.image_1_3),
            Currency("23450","Евро, EC", R.drawable.image_1_4),
                    Add1("Добавить", R.drawable.path837),
        )
        currencyAdapter.setItems(currencyList)
    }
}