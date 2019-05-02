All: Driver.class Employee.class SeniorTechnician.class StaffTechnician.class StaffPharmacist.class PharmacyManager.class

PharmacyManager.class: PharmacyManager.java
	javac PharmacyManager.java

StaffPharmacist.class: StaffPharmacist.java
	javac StaffPharmacist.java

StaffTechnician.class: StaffTechnician.java
	javac StaffTechnician.java

SeniorTechnician.class: SeniorTechnician.java
	javac SeniorTechnician.java

Employee.class: Employee.java
	javac Employee.java

Driver.class: Driver.java
	javac Driver.java

clean:
	rm -f *.class
