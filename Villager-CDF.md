# Villager

This is the Class Definition File (CDF) for the Villager class.
--Purpose Descibe all neccesary attributes of the villager class and what all it will contain.


## Attributes

* Health double
* age int
* Job Job
* Inventory Product[] (size 10 ?)
* Hunger int ?
* Name string
* genecode ?
* gender bool (m,f)(t,f)

## Methods

### Constructors

TODO add constructors

### Private

* double breedAtempt()
  * Uses random factor based on
    * Age    V
    * Health ^
    * Hunger V
    * Current pop/max pop V
    * Current House fullness V
    * Num children V
  * returns random value
* bool breed(Villager vPartner)
  * Calls all breading functions
  * Return conditions
    * False
      * vPartner.gender = this.gender
      * breedAttempt < (some factor) //TODO add factor deatils
      * this.age < 20 //Becasue no pedo
    * True
      * this.breedAttempt > (some factor)
        AND vPartner.breedAttempt > (some factor)
  * If breed return value is ture ADDS new villager to children list

