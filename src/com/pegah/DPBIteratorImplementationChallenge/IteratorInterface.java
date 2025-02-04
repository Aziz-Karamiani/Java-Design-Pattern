package com.pegah.DPBIteratorImplementationChallenge;


import java.util.LinkedList;

interface IteratorInterface {
    void first();//Reset to first element
    String next();//get next element
    boolean isDone();//End of collection check
    String currentItem();//Retrieve Current Item
}

