#Overview
This is an express version of a checkout application scanning items and calculating the total value of them.

#Assumptions:
* List of items will be provided as a command-line argument in the format of upper-case APPLE/ORANGE strings separated by spaces
* As simplicity was an explicit requirement proper OOD was not followed 

#Corners cut:
* Price should be BigDecimal instead of int
* Command line parsing should be decoupled from the Item enums
* Promotions should be decoupled from the Till using strategies 

#Requirements
Java 8
