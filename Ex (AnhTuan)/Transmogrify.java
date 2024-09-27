package com.mycompany.app;

class Actor {
    public void act() {
        System.out.println("Actor is acting");
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor is acting");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor is acting");
    }
}

public class Transmogrify {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void perform() {
        actor.act();
    }
}
