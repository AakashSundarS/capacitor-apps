package com.jeep.app.ionic.angular;

import android.os.Bundle;

import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;

import com.jeep.plugin.capacitor.CapacitorVideoPlayer;
import com.jeep.plugin.capacitor.CapacitorDataStorageSqlite;
import com.jeep.plugin.capacitor.CapacitorSQLite;

import java.util.ArrayList;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Initializes the Bridge
    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      // Ex: add(TotallyAwesomePlugin.class);
      add(CapacitorVideoPlayer.class);
      add(CapacitorDataStorageSqlite.class);
      add(CapacitorSQLite.class);
    }});
  }
}
