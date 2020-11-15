package com.company;
import ibcsutils.ReadViaURL;

public class Main
{
    public static void main(String[] args)
    {
        String addr = "http://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr);
        String key = "abaft";
        int lo = 0;
        int hi = words.length - 1;
        boolean found = false;
        while (!found && lo <= hi)
        {
            int mid = (lo + hi) / 2;
            String midval = words[mid];
            if (midval.equals(key))
                found = true;
            else if (midval.compareTo(key) < 0)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        System.out.println(found);
    }
}
