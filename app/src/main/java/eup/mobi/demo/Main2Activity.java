package eup.mobi.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("BUN");
        assert bundle != null;
        if (bundle.containsKey("STR"))
            ((TextView) findViewById(R.id.textView)).setText(bundle.getString("STR"));
    }
}
