MagicCarpet - Maintained Fork
======

A Bukkit Minecraft Server Mod.

[https://www.spigotmc.org/resources/magiccarpet-maintained-fork.85813/](https://www.spigotmc.org/resources/magiccarpet-maintained-fork.85813/)

Compilation
-----------

We use maven to handle our dependencies.

* Install [JDK 6+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Install [Maven 2](http://maven.apache.org/download.html)
* Check out this repo and: `mvn clean compile jar:jar`

Info
----

This is a maintained Fork of the original Magiccarpet Plugin

Original Description : https://dev.bukkit.org/projects/magiccarpet

MagicCarpet
is a plugin that allows the user to fly away on a carpet made of glass. By using the command /mc <size>, a carpet is created. If no size is specified, a 5x5 carpet is created by default. By entering /mc again, the carpet disappears from the world. To go down, the user simply has to crouch down or do /mcs then look down to go down. This plugin makes a great donator perk if your running a large server and you would like to reward your members.


The Plugin includes everything below.

WorldGuard support. (block players from using the carpet in certain areas)
Vault support. (economy)
NoCheatPlus support.
Tons of customization through the config.
and much more!
Commands
Master

/magiccarpet OR /mc - Enables / disables the MagicCarpet.

/magiclight OR /ml - Lights up your MagicCarpet.

/carpetswitch OR /mcs - Switches how the Carpet goes down. (shift or by looking down)

/magicreload OR /mr - Reloads MagicCarpet.

/magiccarpetbuy OR /mcb - Is used to buy the carpet if charge is enabled.

/magictools OR /mct - Draws a enderchest and workbench on the players magic carpet.

There are also some hidden features to /mc, for example. /mc <size>, /mc <material>, /mc give <player>, /mc take <player>, /mc <color>. Also /ml can also be used for /ml <material>.
  
/magiccarpet or /mc - Enables / disables the MagicCarpet.

Permissions
-----------

magiccarpet.mc - Allows a player to use MagicCarpet.

magiccarpet.mc.SIZE - Allows the carpet to operate at the specified size.

magiccarpet.ml - Allows a player to light there carpet up.

magiccarpet.mcs - Allows a player to switch the way they go down.

magiccarpet.mr - Allows a player to reload MagicCarpet.

magiccarpet.mct - Allows a player to have a ender chest and workbench on there MagicCarpet.

magiccarpet.np - Allows a player to not pay time based charges or one time fees.

magiccarpet.* - Allows a player to have access to every MagicCarpet permission.

magiccarpet.mc - Allows the player to use MagicCarpet.


Custom Materials
If your server allows custom carpets, you can use these custom materials to give your carpet a bit more style. This is for the full version only.

Carpet:

STONE, GRASS, DIRT, COBBLESTONE, WOOD, BEDROCK, GOLD ORE, IRON ORE, COAL ORE, LOG, LEAVES, SPONGE, GLASS, LAPIS ORE, LAPIS BLOCK, SANDSTONE, WOOL, GOLD BLOCK, IRON BLOCK, DOUBLE STEP, BRICK, BOOKSHELF, MOSSY COBBLESTONE, OBSIDIAN, DIAMOND ORE, DIAMOND BLOCK, SNOW BLOCK, CLAY, PUMPKIN, NETHERRACK, MYCEL, NETHER BRICK, ENDER STONE, HUGE MUSHROOM 1, HUGE MUSHROOM 2, MELON BLOCK, COAL BLOCK, EMERALD BLOCK, HARD CLAY, QUARTZ BLOCK, STAINED GLASS, STAINED CLAY

Light:

GLOWSTONE, JACK O LANTERN

Colors
Some materials have support for materialData. This allows the players to change the color of the material. You can do this with...

WOOL, STAINED GLASS, STAINED CLAY

Here is a list of supported colors...

white, orange, magenta, light blue, yellow, lime, pink, gray, light gray, cyan, purple, blue, brown, green, red, black

Make sure to enable custom-carpets in the config. Then just type /mc lime stained glass. If lights is enabled in the config do /ml. This will cause the carpet to light up. However if your using stained glass the carpet has a glowing effect which seems to get more intense at night.

Configuration

\# Be sure to use /mr if you change any settings here while the server is running.
pvp-hide: true
charge-timebased: false
charge-amount: 20.0
default-size: 5
pvp: false
light-material: glowstone
change-liquids: 'true'
center-light: false
charge-packages:
- alpha:3600:5.0
- beta:7200:10.0
physics-fun: false
lights: false
save-carpets: true
magic: true
tools: false
custom-lights: false
charge: false
charge-time: 1800
crouch-descent: true
max-size: 7
carpet-material: glass
custom-carpets: false

crouch-descent - Crouch to descend by default?

center-light - Light the carpet up with the magic light by default?

default-size - The default size for all carpets.

carpet-material - The carpet material.

light-material - The magic light material.

max-size - The max size for all carpets.

custom-carpets - Allow carpets to use custom materials?

custom-lights - Allows the magic light to use custom materials?

lights - Allow the magic light to be used?

save-carpets - Saves stuff, like if a player has a carpet and its size, material, etc.

charge - Charge players to use magic carpet?

charge-amount - The amount that should be charged.

change-liquids - This allows or prevents the carpet from replacing water or lava. To only replace water change 'true' to 'water'.

tools - This allows players to get a ender chest and workbench on there MagicCarpet.

charge-time - This is the default time that is given for initial payment. (in seconds)

charge-packages - This specifies the default packages available. For instance "alpha:3600:5.0". Alpha is the package name, 3600 the time (in seconds), and 5.0 the cost.

charge-timebased - If enabled will charge players to use magiccarpet on a time basis.

magic - If enabled will display fireworks when enabling / disabling the Magic Carpet.

physics-fun - This allows MagicCarpet to mess with in-game physics. I wouldn't enable this. As it can result in floating torches and such.

pvp - This prevents entity damage when using the carpet to damage or get damaged by other entities (players and mobs)

pvp-hide - This hides the carpet when a player gets attacked or is attacking other entities (players and mobs)


Notes
-----

In order to prevent a carpet from entering a specific area with WorldGuard. Do this...

Create a region. (/region define test player)

Block the carpet (/region flag test blocked-cmds /mc /magiccarpet)

Enjoy! Now carpets cannot enter or be activated in this area.

Please report any suggestions or bugs you find as Issue.
