package net.digiex.magiccarpet.plugins;

import java.util.Set;

import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.world.World;
import com.sk89q.worldguard.LocalPlayer;
import com.sk89q.worldguard.protection.flags.Flags;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import org.bukkit.Location;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.protection.ApplicableRegionSet;
import com.sk89q.worldguard.protection.managers.RegionManager;
import org.bukkit.entity.Player;

/*
 * Magic Carpet 2.4 Copyright (C) 2012-2014 Android, Celtic Minstrel, xzKinGzxBuRnzx
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
public class WorldGuard {

    private static WorldGuardPlugin worldGuard;

    public WorldGuard(final WorldGuardPlugin w) {
        worldGuard = w;
    }

    public static boolean canFlyHere(Player player, final Location location) {
        try {
            final RegionManager regionManager = com.sk89q.worldguard.WorldGuard.getInstance().getPlatform().getRegionContainer().get((World) location.getWorld());
            final ApplicableRegionSet set = regionManager.getApplicableRegions(BlockVector3.at(location.getX(), location.getY(), location.getZ()));

            LocalPlayer localPlayer = WorldGuardPlugin.inst().wrapPlayer(player);

            final Set<String> flag = set.queryValue(localPlayer, Flags.BLOCKED_CMDS);
            for (final String blocked : flag) {
                if (blocked == null)
                    continue;
                if (blocked.contains("/mc") || blocked.contains("/magiccarpet"))
                    return false;
            }
        } catch (final Exception e) {
            return true;
        }
        return true;
    }
}
