package au.com.alexh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void maths (View view){
        EditText editVal1 = (EditText) findViewById(R.id.editText3);
        EditText editVal2 = (EditText) findViewById(R.id.editText4);
        Double val1 = Double.parseDouble(editVal1.getText().toString());
        Double val2 = Double.parseDouble(editVal2.getText().toString());
        Spinner operatorVal = (Spinner) findViewById (R.id.spinner2);
        String operator = operatorVal.getSelectedItem().toString();
        TextView answer = (TextView) findViewById(R.id.textView);

        if (operator.equals("*")) {
            answer.setText(String.valueOf(val1 * val2));
        } else if (operator.equals("-")) {
            answer.setText(String.valueOf(val1 - val2));
        } else if (operator.equals("/")) {
            answer.setText(String.valueOf(val1 / val2));
        } else if (operator.equals("+")) {
            answer.setText(String.valueOf(val1 + val2));
        }
    }
}
