package com.iafenvoy.ganymede;

//? fabric {
import com.iafenvoy.ganymede.fabric.FabricPlatformImpl;
//?}
//? neoforge {
/*import com.iafenvoy.ganymede.neoforge.NeoforgePlatformImpl;
*///?}

public interface Platform {

    //? fabric {
    Platform INSTANCE = new FabricPlatformImpl();
    //?}
    //? neoforge {
    /*Platform INSTANCE = new NeoforgePlatformImpl();
    *///?}


    boolean isModLoaded(String modid);
    String loader();

}
