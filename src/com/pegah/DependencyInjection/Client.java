package com.pegah.DependencyInjection;

class Client {
    private Service myService;

    // injects via the constructor
    public Client(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message");
    }

    public void setService(Service service) {
        this.myService = service;
    }

}
