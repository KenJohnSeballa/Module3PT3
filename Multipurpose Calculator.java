import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    TextView resultTextView;
    double num1, num2;
    String operator, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        resultTextView = findViewById(R.id.resultTextView);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSub = findViewById(R.id.buttonSub);
        Button buttonMul = findViewById(R.id.buttonMul);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonClear = findViewById(R.id.buttonClear);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                editText.append("0");
                break;
            case R.id.button1:
                editText.append("1");
                break;
            case R.id.button2:
                editText.append("2");
                break;
            case R.id.button3:
                editText.append("3");
                break;
            case R.id.button4:
                editText.append("4");
                break;
            case R.id.button5:
                editText.append("5");
                break;
            case R.id.button6:
                editText.append("6");
                break;
            case R.id.button7:
                editText.append("7");
                break;
            case R.id.button8:
                editText.append("8");
                break;
            case R.id.button9:
                editText.append("9");
                break;
            case R.id.buttonAdd:
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "+";
                editText.setText("");
                break;
            case R.id.buttonSub:
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "-";
                editText.setText("");
                break;
            case R.id.buttonMul:
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "*";
                editText.setText("");
                break;
            case R.id.buttonDiv:
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "/";
                editText.setText("");
                break;
            case R.id.buttonEqual:
                num2 = Double.parseDouble(editText.getText().toString());
                switch (operator) {
                    case "+":
                        result = String.valueOf(num1 + num2);
                        break;
                    case "-":
                        result = String.valueOf(num1 - num2);
                        break;
                    case "*":
                        result = String.valueOf(num1 * num2);
                        break;
                    case "/":
                        result = String.valueOf(num1 / num2);
                        break;
                }
                resultTextView.setText(result);
                break;
            case R.id.buttonClear:
                editText.setText("");
                resultTextView.setText("");
                break;
        }
    }
}
