all: build run

build:
	javac -d bin Main.java
	javac -d bin aulas/aula*.java
	javac -d bin libs/*

run:
	@java -cp bin Main


clear:
	rm bin/*

git:
	git config --global user.email "gustavoprechlakbenv@gmail.com"
	git config --global user.name "GustavoAquele"


t3: t3-build
	java -cp bin CorrecaoT3
	
t3-build:
	javac -d bin CorrecaoT3.java trabalhos/T3.java

clear:
	rm -rf bin




