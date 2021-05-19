# Villager CDF

Villager Class

## General Description

A villager is an entity that HAS a job, inventory, health, age, children and parrents.

## Relationsips

* IS a
  * Object
* HAS a
  * job
  * Inventory
  * health
  * age
  * chilren
  * parents

## Details

### Dive

This villager class will have the following attributes

---
|Attriute|Type|Use|
|:--|:--|:--|
|Job|Job|Villagers Daily Task. Produces Product|
|Inventory|Product[Village.Constants.VILLAGER_MAX_INVENTORY]|Stores any product the Villager will use, namly food|
|Health|Double|Value to track villager health when 0 villager dies|
|Age|int|Age of the Villager increments with each Village cycle|
|Children|List\<Villager\>|List of all the villager children|
|Parents|Villager[2]|Array of villagers Parents|

### Methods

Villager class will need the following Methods

|Method|Desciption|Returns|
|:--|:--|:--|
|Age Up|Increments Age by One| N/A|
|CanBreed|Checks if Villager Meets requirements to breed|| Boolean|
|AttempBreed|Villager Attempts to breed| Boolean|
|Eat|Pulls Food Products from Inventory and uses them| N/A|
|UseItem|Uses an item from the inventory|Villager.Effect|
|
