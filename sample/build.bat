@echo off

%JDK_HOME%/jdk1.5/bin/javac -cp ../lib/nitro.jar;../lib/gson.jar set_config.java
%JDK_HOME%/jdk1.5/bin/javac -cp ../lib/nitro.jar;../lib/gson.jar get_config.java
%JDK_HOME%/jdk1.5/bin/javac -cp ../lib/nitro.jar;../lib/gson.jar stats.java
%JDK_HOME%/jdk1.5/bin/javac -cp ../lib/nitro.jar;../lib/gson.jar rm_config.java
%JDK_HOME%/jdk1.5/bin/javac -cp ../lib/nitro.jar;../lib/gson.jar MyFirstNitroApplication.java