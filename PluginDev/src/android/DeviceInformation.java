package iskw.tatsuya.device_information;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.os.Build;
import android.util.Log;

public class DeviceInformation extends CordovaPlugin {
    public static final String ACTION_GET_DEVICE_INFORMATION = "action_get_device_information";

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        try {
            if (ACTION_GET_DEVICE_INFORMATION.equals(action)) { 
                // Do something here
                JSONObject responseJson = new JSONObject();
                responseJson.put("serial", Build.SERIAL);

                callbackContext.success(responseJson);
                return true;
            }

            callbackContext.error("Invalid action");
            return false;
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());

            callbackContext.error(e.getMessage());
            return false;
        } 
    }
}
