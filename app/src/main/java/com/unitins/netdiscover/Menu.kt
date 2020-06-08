package com.unitins.netdiscover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.unitins.netdiscover.fragments.LogsFragment
import com.unitins.netdiscover.fragments.MonitorarFragment
import com.unitins.netdiscover.fragments.RecursosFragment
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val logsFragment = LogsFragment()
        val monitorarFragment = MonitorarFragment()
        val recursosFragment = RecursosFragment()

        makeCurrentFragment(recursosFragment)

        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.log -> makeCurrentFragment(logsFragment)
                R.id.monitorar -> makeCurrentFragment(monitorarFragment)
                R.id.recursos -> makeCurrentFragment(recursosFragment)
            }
        true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}