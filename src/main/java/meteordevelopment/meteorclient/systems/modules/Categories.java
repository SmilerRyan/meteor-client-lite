/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client).
 * Copyright (c) Meteor Development.
 */

package meteordevelopment.meteorclient.systems.modules;

import meteordevelopment.meteorclient.addons.AddonManager;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import net.minecraft.item.Items;

public class Categories {
    public static final Category Meteor = new Category("Meteor", Items.TNT.getDefaultStack());

    public static boolean REGISTERING;

    public static void init() {
        REGISTERING = true;

        // Meteor
        Modules.registerCategory(Meteor);

        // Addons
        AddonManager.ADDONS.forEach(MeteorAddon::onRegisterCategories);

        REGISTERING = false;
    }
}
