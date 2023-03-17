package com.serenitydojo.people;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    Person sam = new Person("Sam", Person.Gender.FEMALE,30,"Green");
    Person bill = new Person("Bill", Person.Gender.MALE,40,"Blue");
    Person tim = new Person("Tim", Person.Gender.MALE,10,"Red");
    Person susan = new Person("Susan", Person.Gender.FEMALE,50,"Red");
    Person sarah = new Person("Sarah", Person.Gender.FEMALE,50,"Orange");
    Person paul = new Person("Paul", Person.Gender.FEMALE,50,"Blue");

    Predicate<Person> LIKE_BLUE = person -> person.getFavouriteColor().equals("Blue");

    Predicate<Person> LIKE_RED = person -> person.getFavouriteColor().equals("Red");
    Predicate<Person> UNDER_35
            = person -> person.getAge() < 35;

    Predicate<Person> BETWEEN_20_AND_40
            = person -> person.getAge() >= 20 && person.getAge() <=40;
    Predicate<Person> LIKE_RED_OR_UNDER_30
            = person -> person.getFavouriteColor().equals("Red") || person.getAge() <=30;
    Predicate<Person> LIKE_GREEN = person -> person.getFavouriteColor().equals("Green");



    List<Person> allThePeople = Arrays.asList(sam,bill,tim,susan,sarah,paul);

    @Test
    public void ICanSearchForPeopleByAge(){
        //Search for people under 35
        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> peopleUnder35 = people.findAllThePeopleWho(UNDER_35);

        assertThat(peopleUnder35).contains(sam,tim);
    }

    @Test
    public void ICanSearchForPeopleBetween20And40(){
        //Search for people between 20 and 40
        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> peopleUnder35 = people.findAllThePeopleWho(BETWEEN_20_AND_40);

        assertThat(peopleUnder35).contains(sam,bill);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeRed(){
        //Search for people who like Red
        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> peopleWhoLikeRed = people.findAllThePeopleWho(LIKE_RED);

        assertThat(peopleWhoLikeRed).contains(tim,susan);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeRedOrWhoAre30OrUnder(){
        PeopleDatabase people = new PeopleDatabase(allThePeople);

        List<Person> matchingPeople
                = people.findAllThePeopleWho(LIKE_RED_OR_UNDER_30);

        assertThat(matchingPeople).contains(sam,tim,susan);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeRedOrWhoLikeGreen(){
        PeopleDatabase people = new PeopleDatabase(allThePeople);

        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_GREEN);

        assertThat(matchingPeople).contains(sam);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeRedOrWhoLikeBlue(){
        PeopleDatabase people = new PeopleDatabase(allThePeople);

       /* PersonChecker likeBlue = new PersonChecker() {
            @Override
            public boolean test(Person person) {
                return person.getFavouriteColor().equals("Blue");
            }
        };*/

        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_BLUE);

        assertThat(matchingPeople).contains(bill);
    }

    @Test
    public void peopleCanEarnPoints(){
       OptionalInt totalNumberOfLetters = allThePeople.stream()
               .map(Person::getFavouriteColor)
               .filter(colour -> colour.equals("fuchia"))
               .sorted(Comparator.comparing((colour) -> colour.length()))
               .distinct()
               .mapToInt(colour -> colour.length())
               .min();
        System.out.println(totalNumberOfLetters);
    }




}
