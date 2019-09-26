package work.newproject.asus.apurv.toastfirst;

import android.content.Context;
import android.widget.Toast;

public class ToastMsz {
    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
