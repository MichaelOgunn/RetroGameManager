package model;

import com.example.asgn2.GenList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GameMachineTest {

    @Test
    void getName() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        assertEquals("TestMachine", gameMachine.getName());
    }

    @Test
    void setName() {
        GameMachine gameMachine = new GameMachine("OriginalName", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        gameMachine.setName("NewName");

        assertEquals("NewName", gameMachine.getName());
    }

    @Test
    void getManufacturer() {
        GameMachine gameMachine = new GameMachine("TestMachine", "TestManufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        assertEquals("TestManufacturer", gameMachine.getManufacturer());
    }

    @Test
    void setManufacturer() {
        GameMachine gameMachine = new GameMachine("TestMachine", "OriginalManufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        gameMachine.setManufacturer("NewManufacturer");

        assertEquals("NewManufacturer", gameMachine.getManufacturer());
    }

    @Test
    void getDescription() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "TestDescription",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        assertEquals("TestDescription", gameMachine.getDescription());
    }

    @Test
    void setDescription() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "OriginalDescription",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        gameMachine.setDescription("NewDescription");

        assertEquals("NewDescription", gameMachine.getDescription());
    }

    @Test
    void getType() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "TestType", "Media", 2022, 49.99, "test-image.jpg");

        assertEquals("TestType", gameMachine.getType());
    }

    @Test
    void setType() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "OriginalType", "Media", 2022, 49.99, "test-image.jpg");

        gameMachine.setType("NewType");

        assertEquals("NewType", gameMachine.getType());
    }

    @Test
    void getMedia() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "TestMedia", 2022, 49.99, "test-image.jpg");

        assertEquals("TestMedia", gameMachine.getMedia());
    }

    @Test
    void setMedia() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "OriginalMedia", 2022, 49.99, "test-image.jpg");

        gameMachine.setMedia("NewMedia");

        assertEquals("NewMedia", gameMachine.getMedia());
    }

    @Test
    void getLaunchYear() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        assertEquals(2022, gameMachine.getLaunchYear());
    }

    @Test
    void setLaunchYear() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        gameMachine.setLaunchYear(2023);

        assertEquals(2023, gameMachine.getLaunchYear());
    }

    @Test
    void getInitialPrice() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        assertEquals(49.99, gameMachine.getInitialPrice(), 0.01);
    }

    @Test
    void setInitialPrice() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        gameMachine.setInitialPrice(59.99);

        assertEquals(59.99, gameMachine.getInitialPrice(), 0.01);
    }

    @Test
    void setImageUrl() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "original-image.jpg");

        gameMachine.setImageUrl("new-image.jpg");

        assertEquals("new-image.jpg", gameMachine.getImageUrl());
    }


    @Test
    void testToString() {
        GameMachine gameMachine = new GameMachine("TestMachine", "Manufacturer", "Description",
                "Type", "Media", 2022, 49.99, "test-image.jpg");

        String expectedString = "GameMachine{name='TestMachine', manufacturer='Manufacturer', " +
                "description='Description', type='Type', media='Media', launchYear=2022, " +
                "initialPrice=49.99, imageUrl='test-image.jpg'}";

        assertEquals(expectedString, gameMachine.toString());
    }
}
