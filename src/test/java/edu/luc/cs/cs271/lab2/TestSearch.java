package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  ArrayList<Team> makeListFixture(final int size){
    final ArrayList<Team> arrayList = new ArrayList<>();
    for (int i = 0; i < size; i++){
      final String s = Integer.toString(i);
      arrayList.add(new Team("Team " + s, "Coach " + s, i * 100 +50));
    }
    return arrayList;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }

  @Test
  public void testFindPositionList0() {
    final ArrayList<Team> arrayList = makeListFixture(0);
    assertFalse(Search.findTeamPosition(arrayList, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10s(){
    final ArrayList<Team> arrayList = makeListFixture(10);
    assertTrue(Search.findTeamPosition(arrayList, "Team 10").isPresent());
  }

  @Test
  public void testFindPositionList10f(){
    final ArrayList<Team> arrayList = makeListFixture(10);
    assertFalse(Search.findTeamPosition(arrayList, "Team 11").isPresent());
  }

  @Test
  public void testFindMinFundingArray(){
   final Team[] arr = makeArrayFixture(0);
   assertFalse(Search.findTeamMinFunding(arr,500).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFast(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 500).isPresent());
  }

}
