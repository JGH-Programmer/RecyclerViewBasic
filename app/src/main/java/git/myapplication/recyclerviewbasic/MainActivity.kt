package git.myapplication.recyclerviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import git.myapplication.recyclerviewbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dataSet: ArrayList<List<String>> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addData()

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = RecyclerViewAdapter(dataSet)
    }

    private fun addData(){
        for(i in 0 .. 99){
            dataSet.add(listOf("$i th main", "$i th sub"))
        }
    }
}