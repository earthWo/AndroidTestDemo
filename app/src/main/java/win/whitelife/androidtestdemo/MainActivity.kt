package win.whitelife.androidtestdemo


import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*;
import java.util.concurrent.ConcurrentHashMap

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_click.setOnClickListener({
            Toast.makeText(this,"点击了按钮",Toast.LENGTH_SHORT).show()
        })
        var m=ConcurrentHashMap<String,String>()
        m.put("","")
        bt_click2.setOnClickListener({
            tv_main.setText("点击了按键2")
        })
    }

}
