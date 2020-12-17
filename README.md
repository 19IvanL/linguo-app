# linguo-app

Linguo app for Android smartphones.


## About this app

With this app, users can play on any of Linguo's courses.

This app's GUI is currently only available in Spanish.


## Technical requeriments

To be able to run the app, your system will need the following requeriments:

* **Java 11** to compile the whole program. Other versions of Java could work, but they haven't been tested yet.

* **linguo-lib** to access Linguo's datamodels and ultimately its database. It's a Git submodule already packed in this repository. You can also find it in its own [GitHub](https://github.com/19IvanL/linguo-lib) repository.

* **LipeRMI** to retrieve data from Linguo's servers. It's a Java jar already packed in this repository. You can also find it in its official [SourceForge](lipermi.sourceforge.net) website.


## How to run it

This project is structured as an Android Studio Java project, and ideally, it should be run as such.

Once it's imported into your IDE, make sure you have the above mentioned **required dependencies** added to your build path.

On a side note, always use the same linguo-lib version around this app's version, or else errors and inconsistencies could occur.

If the compilation doesn't throw any error during or after its process (and it shouldn't if you followed the steps carefully), you are ready to go.


## Credits

linguo-app it's mainly developed by [19IvanL](https://github.com/19IvanL) and [OscarD01](https://github.com/OscarD01) as a high school project. 
