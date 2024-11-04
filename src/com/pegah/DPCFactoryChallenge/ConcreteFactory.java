package com.pegah.DPCFactoryChallenge;

class ConcreteFactory extends AnimalFactoryInterface {
    @Override
    public AnimalInterface GetAnimalType(String type) throws Exception {
        return switch (type) {
            case "Duck" -> new Duck();
            case "Tiger" -> new Tiger();
            default -> throw new Exception("Animal type: " + type + " cannot be instantiated");
        };
    }
}
