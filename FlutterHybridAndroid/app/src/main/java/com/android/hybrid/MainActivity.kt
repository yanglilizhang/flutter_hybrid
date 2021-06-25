package com.android.hybrid

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.hybrid.flutter.FlutterCacheManager
import com.android.hybrid.flutter.MyFlutterActivity
import com.android.hybrid.util.IStatusBar
import kotlinx.android.synthetic.main.activity_main.*


/**
 * Author: 信仰年轻
 * Date: 2021-06-11 10:10
 * Email: hydznsqk@163.com
 * Des:执行git revert 回退到这个版本,解决了冲突，这条是新加的信息
 * 我是第五次提交-在第七次基础上执行回滚git revert 然后解决了bug和冲突，再提交一次作为第八次
 * 我是第六次提交
 * 我是第七次提交
 * 我是第九次提交-在第10次基础上执行回滚git revert 回到这里改一些东西
 * 再执行git reset --hard origin/master(这个操作相当于啥也没干又回到第10次提交上面)，这次我准备执行
 * git reset origin/master 看这次的备注东西还在不在（已确定东西还在！）
 * 我是第十次提交
 * 我是第十一次提交
 * 我是第十二次提交
 * 我是第13次提交
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.title).setText("FlutterHybridAndroid")
        IStatusBar.setStatusBar(this, true, Color.WHITE, false)

        //Android嵌套Flutter并通信
        tv_demo1.setOnClickListener {
            startActivity(Intent(this, Demo1Activity::class.java))
        }

        //Flutter嵌套Android(View)
        tv_demo2.setOnClickListener {
            val intent = Intent(this, MyFlutterActivity::class.java)
            intent.putExtra("moduleName", "nativeView")
            startActivity(intent)
        }
    }


}