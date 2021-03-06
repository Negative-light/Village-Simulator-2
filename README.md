# Village-Simulator-2

This is a remake of my old village simulator that will be used to test my current programing skills. The premise of this project is to create an active village simulation that includes features like breeding, structures, life cycles and skilled work.

## Other things of Note

1. This will be used in part to test my programing skills for school so do not expect anything specacular out of it YET.
2. This is my first personal prject on GitHub and my first major public one.
3. I am not an expert just want to have some fun.

## Premise

Make a Village Simulation with the following features.
* Breeding Mechanics
  * Inbreeding discouaged
* Villager Jobs
  * The more a villager works the better they become
* Buildings
  * Storage
  * Work
  * Living
* Aging
  * Cap at 500
  * Breedable at 20 (There is no comfortable way to put that is there)

## Challenges

* Attempt to add UI
* Add Saving and Data storage

## Project Needs

### Classes (Neccesary)

#### Abstract/Interface

* Job (work)
  * Each class must have a connected building
  * Producest a list of products
  * Usees randomness
  * Internal Leveling system
* Building
  * Extends product
  * Made by Builder Job
  * Gives bonus to workers based on level
  * Has list of products needed to be built
* Product
  * made by some job
  * has some usage (making a building or feeding)
 * Food
   * Extends Product
   * Has amount of food value
   * Has experation, ie each day it is in storage it looses some of its food value

### General Classes

* Villager
  * Has a job
  * Has a home (building)
  * Health
  * Age
  * Children
  * Name
  * Gene code  <-- This needs to be thought through
  * Parents
  * Food inventory
* Farmer
  * Extends Job
  * Produces Food
  * XP based on # of food items produced
  * XP/Level = 50
 * Miner
   * Extends Job
   * Produces
     * Stone
     * Coal
     * Iron
     * Gold
    * xp based on raised rarity of items level
* Builder
  * Extends Job
  * Prodces Buildings
  * xp based on building costs
* Woodcutter
  * Extends Job
  * Produces wood
  * xp total amount of wood produced
* House
  * Extend Building
  * Increases population by 5
 * Farm
   * Extends building
   * INcreases max farmers by 5
   * Increases max population by 3
   * has chance to double crop output from a villager who works there
   * Storse food (reduces rot rate) (max 50)
 * Mine
   *  Extends building
   *  Increases max Miners by 10
   *  Has random chance to double product of one villager that works in it
   *  Increase max population by 1
   *  Stores Coal, Iron, Gold (max 100)
 *  Town Center
    *  Extend building
    *  Stores any product (max 1000) (double rot rate)
    *  infinate housing value (reduces health of all villagers housed in it by 1/villager/day)
    *  Work place for builders
 *  Storage
    *  Stores Items (max 1000)
    *  0 Population increase
    *  No buffs
  
  
 ## Devopment Proccess
 
 ### Sage 0
 
 * Create General definitions of all classes
 
 ### Stage 1
 
 * Make abstract classes

### Stage 2

* Make extended classes

### Stage 3

* Work toward completing challenges

### Stage 4

* Add specializtion features
