package eup.mobi.demo;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean isReplace = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(MainActivity.this);
        findViewById(R.id.btn2).setOnClickListener(MainActivity.this);
    }

    private View.OnClickListener onclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn) {
//            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//
//            Bundle bundle = new Bundle();
//            bundle.putString("STR", "Hello");
//
//            intent.putExtra("BUN", bundle);
//            startActivity(intent);

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container, BlankFragment.newInstance("Replace"));
            fragmentTransaction.commit();

            isReplace = true;
        } else {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.container, BlankFragment.newInstance("Add"))
                    .addToBackStack("TAG");
            fragmentTransaction.commit();
            isReplace = false;
        }
    }

    @Override
    public void onBackPressed() {
        if (isReplace)
            super.onBackPressed();
        else
            getSupportFragmentManager().popBackStack("TAG", FragmentManager.POP_BACK_STACK_INCLUSIVE);

        isReplace = true;
    }
}
