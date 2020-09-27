# CMSC203 Lab4 – Classes and Objects

## TV Instances

## Lab Objectives

+ Be able to declare a new class

+ Be able to write a constructor

+ Be able to write instance methods that return a value

+ Be able to write instance methods that take arguments

+ Be able to instantiate an object

+ Be able to use calls to instance methods to access and change the state of an object

## Introduction

Everyone is familiar with a television. It is the object we are going to create in this lab.

First we need a blueprint. All manufacturers have the same basic elements in the televisions they produce as well as many options. We are going to work with a few basic elements that are common to all televisions. Think about a television in general. It has a brand name (i.e. it is made by a specific manufacturer). The television screen has a specific size. It has some basic controls. There is a control to turn the power on and off. There is a control to change the channel. There is also a control for the volume. At any point in time, the television’s state can be described by how these controls are set. We will write the television class. Each object that is created from the television class must be able to hold information about that instance of a television in fields. So a television object will have the following attributes:

+ __manufacturer:__ The manufacturer attribute will hold the brand name. This cannot change once the television is created, so will be a named constant.

+ __screenSize:__ The screenSize attribute will hold the size of the television screen. This cannot change once the television has been created so will be a named constant.

+ __powerOn:__ The powerOn attribute will hold the value true if the power is on, and false if the power is off.

+ __channel:__ The channel attribute will hold the value of the station that the television is showing.

+ __volume:__ The volume attribute will hold a number value representing the loudness (0 being no sound).

These attributes become fields in our class.

The television object will also be able to control the state of its attributes. These controls become methods in our class.

+ __setChannel:__ The setChannel method will store the desired station in the channel field.

+ __power:__ The power method will toggle the power between on and off, changing the value stored in the powerOn field from true to false or from false to true.

+ __increaseVolume:__ The increaseVolume method will increase the value stored in the volume field by 1.

+ __decreaseVolume:__ The decreaseVolume method will decrease the value stored in the volume field by 1.

+ __getChannel:__ The getChannel method will return the value stored in the channel field.

+ __getVolume:__ The getVolume method will return the value stored in the volume field.

+ __getManufacturer:__ The getManufacturer method will return the constant value stored in the MANUFACTURER field.

+ __getScreenSize:__ The getScreenSize method will return the constant value stored in the SCREEN_SIZE field.

We will also need a constructor method that will be used to create an instance of a Television.
