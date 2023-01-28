package git.myapplication.recyclerviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val dataSet: ArrayList<List<String>> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData()

        recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recycler_view.adapter = RecyclerViewAdapter(dataSet)
    }

    private fun addData(){
        for(i in 0 .. 99){
            dataSet.add(listOf("$i th main", "$i th sub"))
        }
    }
}