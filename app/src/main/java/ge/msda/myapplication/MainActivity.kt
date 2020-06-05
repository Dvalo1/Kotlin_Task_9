package ge.msda.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import ge.msda.myapplication.adapters.ViewPagerFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewpager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabLayout, viewpager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> { tab.setIcon(R.drawable.ic_add_shopping_cart_black_24dp)}
                    1 -> { tab.setIcon(R.drawable.ic_card_giftcard_black_24dp)}
                    2 -> { tab.setIcon(R.drawable.ic_credit_card_black_24dp)}
                }
            }).attach()



    }

}