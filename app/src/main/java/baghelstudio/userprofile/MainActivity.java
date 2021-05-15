package baghelstudio.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void on_contact(View view) {
        intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.setType("message/rfc822");
        String[] send_to = {"erumeshbaghel@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL, send_to);
        //intent.putExtra(Intent.EXTRA_BCC, address);
        //intent.putExtra(Intent.EXTRA_CC, address);

        intent.putExtra(Intent.EXTRA_SUBJECT, "App Feedback!");
        intent.putExtra(Intent.EXTRA_TEXT, "Dear Developer,");
        chooser = Intent.createChooser(intent, "Select Email App...");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }
    }
}
