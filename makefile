all: dev clean

dev:
	javac *.java
	jar cvfe RemoteControl.jar RemoteControl *

clean:
	rm *.class || continue

clean-all: clean
	rm RemoteControl.jar || continue
