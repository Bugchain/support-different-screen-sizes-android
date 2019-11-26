package app.bugchain.supportscreensize

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val columns = resources.getInteger(R.integer.detail_item_column)
        val layoutManager = GridLayoutManager(this, columns)
        rvContent.layoutManager = layoutManager
        rvContent.adapter = CardAdapter()
    }
}