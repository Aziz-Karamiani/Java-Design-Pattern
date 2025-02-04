package com.pegah.DPBIteratorImplementationChallenge;

class Arts implements SubjectInterface {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Bengali";
        subjects[1] = "English";
    }

    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}
