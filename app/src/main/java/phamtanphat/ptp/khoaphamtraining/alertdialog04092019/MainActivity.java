package phamtanphat.ptp.khoaphamtraining.alertdialog04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Order order = new FastFoodOrderBuilder()
                        .orderSauce(SauceType.SOY_SAUCE)
                        .build();
        Log.d("BBB",order.getBreadType().toString());

    }
}
