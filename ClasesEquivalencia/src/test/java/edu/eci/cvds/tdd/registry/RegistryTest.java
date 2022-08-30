package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
	private Registry registry = new Registry();
	
	@Test
    public void should_dropVALID_when_AllTheParamsAreRigth() {
		//arrange
        Person person = new Person("Ana",32662323,24,Gender.UNIDENTIFIED,true);
        //act
        RegisterResult result = registry.registerVoter(person);
        //assert
        Assert.assertEquals(RegisterResult.VALID, result);
    }
	
    @Test
    public void should_dropDUPLICATED_when_TheRegisterIsDuplicate() {
    	//arrange
        Person person = new Person("Diego",31672324,21,Gender.MALE,true);
        //act
        registry.registerVoter(person);
        RegisterResult duplicateR = registry.registerVoter(person);
        //assert
        Assert.assertEquals(RegisterResult.DUPLICATED, duplicateR);
    }

    @Test
    public void should_dropDEAD_when_ThePersonIsNotAlive() {
    	//arrange
        Person person = new Person("Victoria",12434723,36,Gender.FEMALE,false);
        //act
        RegisterResult result = registry.registerVoter(person);
        //assert
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void should_dropUNDERAGE_when_ThePersonIsUnder18() {
    	//arrange
        Person person = new Person("Tomas",94434723,12,Gender.UNIDENTIFIED,true);
        //act
        RegisterResult result = registry.registerVoter(person);
        //assert
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void should_dropINVALID_AGE_when_ThePersonHasNotAValidCharAsItsAge() {
    	//arrange
        Person person = new Person("Diana",34334221,-13,Gender.FEMALE,true);
        //act
        RegisterResult result = registry.registerVoter(person);
        //assert
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
}
