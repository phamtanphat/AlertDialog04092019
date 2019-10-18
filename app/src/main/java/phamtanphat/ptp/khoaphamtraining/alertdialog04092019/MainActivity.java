package phamtanphat.ptp.khoaphamtraining.alertdialog04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlertDialog = findViewById(R.id.buttonShowAlert);
//        Order order = new FastFoodOrderBuilder()
//                        .orderSauce(SauceType.SOY_SAUCE)
//                        .build();
        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Ban muon tat app hay khong ?");
                alert.setIcon(R.mipmap.ic_launcher);
                alert.setCancelable(false);

//                String[] arrayAnimal = {"Cat","Pig","Dog","Lion","Mouse"};
//                boolean[] arrayChecked = {false,false,false,false,false};
//                // mutiplechoice
//                alert.setMultiChoiceItems(arrayAnimal, arrayChecked, new DialogInterface.OnMultiChoiceClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
//                        if (b){
//                            Toast.makeText(MainActivity.this, "Đã check", Toast.LENGTH_SHORT).show();
//                        }else{
//                            Toast.makeText(MainActivity.this, "Bỏ check", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });

                String[] arrayAnimal = {"Cat","Pig","Dog","Lion","Mouse"};
                alert.setSingleChoiceItems(arrayAnimal, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                alert.show();

            }
        });



    }
}
