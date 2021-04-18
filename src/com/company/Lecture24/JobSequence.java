package com.company.Lecture24;

import java.util.ArrayList;
import java.util.Comparator;

public class JobSequence {

    private static class Job{
        private String name;
        private int deadline;
        private int value;

        public Job(String name, int deadline, int value) {
            this.name = name;
            this.deadline = deadline;
            this.value = value;
        }
    }


    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();

        String[] job_names = {"a","b","c","d","e"};
        int[] deadlines = {1,3,2,1,2};
        int[] values = {10,80,50,20,40};

        for (int i = 0; i < job_names.length; i++) {
            jobs.add(new Job(job_names[i], deadlines[i], values[i]));
        }

        jobs.sort((o1, o2) -> {
            if(o1.deadline != o2.deadline){
                return o1.deadline - o2.deadline;
            }else {
                return o2.value - o1.value;
            }
        });
    }
}
