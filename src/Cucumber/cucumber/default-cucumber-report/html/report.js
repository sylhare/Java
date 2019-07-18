import * as CucumberHTML from "./formatter";

$(document).ready(function () {
    var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));
    formatter.uri("./src/test/resources/features/belly.feature");
    formatter.feature({
        "name": "Belly",
        "description": "",
        "keyword": "Feature"
    });
    formatter.background({
        "name": "",
        "description": "",
        "keyword": "Background"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "Belly is empty",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_an_empty_belly()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 0 \"cucumbers\"",
        "keyword": "And "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.scenario({
        "name": "001 - A few cakes in an hour",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.step({
        "name": "I have 42 cakes in my belly",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_cakes_in_my_belly(int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I wait 1 hour",
        "keyword": "When "
    });
    formatter.match({
        "location": "Steps.I_wait_x_hours(int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "My belly should growl",
        "keyword": "Then "
    });
    formatter.match({
        "location": "Steps.Is_belly_growling()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.background({
        "name": "",
        "description": "",
        "keyword": "Background"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "Belly is empty",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_an_empty_belly()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 0 \"cucumbers\"",
        "keyword": "And "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.scenario({
        "name": "002 - Many cakes in an hour",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.step({
        "name": "I have 100 cakes in my belly",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_cakes_in_my_belly(int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I wait 0 hour",
        "keyword": "When "
    });
    formatter.match({
        "location": "Steps.I_wait_x_hours(int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "My belly should not growl",
        "keyword": "Then "
    });
    formatter.match({
        "location": "Steps.Is_belly_not_growling()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenarioOutline({
        "name": "003 - Eating cucumbers",
        "description": "",
        "keyword": "Scenario Outline"
    });
    formatter.step({
        "name": "There are \u003cstart\u003e \"cucumbers\"",
        "keyword": "Given "
    });
    formatter.step({
        "name": "I eat \u003ceat\u003e \"cucumbers\"",
        "keyword": "When "
    });
    formatter.step({
        "name": "I should have \u003cleft\u003e \"cucumbers\"",
        "keyword": "Then "
    });
    formatter.examples({
        "name": "",
        "description": "",
        "keyword": "Examples",
        "rows": [
            {
                "cells": [
                    "start",
                    "eat",
                    "left"
                ]
            },
            {
                "cells": [
                    "12",
                    "5",
                    "7"
                ]
            },
            {
                "cells": [
                    "20",
                    "5",
                    "15"
                ]
            }
        ]
    });
    formatter.background({
        "name": "",
        "description": "",
        "keyword": "Background"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "Belly is empty",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_an_empty_belly()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 0 \"cucumbers\"",
        "keyword": "And "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.scenario({
        "name": "003 - Eating cucumbers",
        "description": "",
        "keyword": "Scenario Outline"
    });
    formatter.step({
        "name": "There are 12 \"cucumbers\"",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I eat 5 \"cucumbers\"",
        "keyword": "When "
    });
    formatter.match({
        "location": "Steps.I_eat_x_cucumbers(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I should have 7 \"cucumbers\"",
        "keyword": "Then "
    });
    formatter.match({
        "location": "Steps.I_have_x_cucumbers_left(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.background({
        "name": "",
        "description": "",
        "keyword": "Background"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "Belly is empty",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_an_empty_belly()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 0 \"cucumbers\"",
        "keyword": "And "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.scenario({
        "name": "003 - Eating cucumbers",
        "description": "",
        "keyword": "Scenario Outline"
    });
    formatter.step({
        "name": "There are 20 \"cucumbers\"",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I eat 5 \"cucumbers\"",
        "keyword": "When "
    });
    formatter.match({
        "location": "Steps.I_eat_x_cucumbers(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I should have 15 \"cucumbers\"",
        "keyword": "Then "
    });
    formatter.match({
        "location": "Steps.I_have_x_cucumbers_left(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.background({
        "name": "",
        "description": "",
        "keyword": "Background"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "Belly is empty",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_have_an_empty_belly()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 0 \"cucumbers\"",
        "keyword": "And "
    });
    formatter.match({
        "location": "Steps.there_are_x_things(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.scenario({
        "name": "004",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.step({
        "name": "I eat 6 \"cucumbers\"",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.I_eat_x_cucumbers(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I wait 1 hour",
        "keyword": "When "
    });
    formatter.match({
        "location": "Steps.I_wait_x_hours(int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I have 50 cakes in my belly",
        "keyword": "But "
    });
    formatter.match({
        "location": "Steps.I_have_cakes_in_my_belly(int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "My belly should not growl",
        "keyword": "Then "
    });
    formatter.match({
        "location": "Steps.Is_belly_not_growling()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.uri("./src/test/resources/features/veggieshop.feature");
    formatter.feature({
        "name": "Regular expressions in step definitions",
        "description": "  As a developer\n  I want to see examples of regular expressions in step definitions\n  So that I can write powerful Cucumber steps",
        "keyword": "Feature"
    });
    formatter.scenario({
        "name": "101 - Exact match",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "I have a cucumber step",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_a_cucumber_step()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenario({
        "name": "102 - Non-capturing group",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "I have a tasty cucumber step",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_a_X_cucumber_step()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I have a nasty cucumber step",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_a_X_cucumber_step()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "I have a rusty cucumber step",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_a_X_cucumber_step()"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenario({
        "name": "103 - Capture integers and strings",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "I have 5 carrots in my basket",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_in_my_basket(int,String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenario({
        "name": "104 - Singular and plural",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "There is 1 cat fed by 1 person",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.animals_fed_by_people(int,int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 2 cats fed by 1 person",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.animals_fed_by_people(int,int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 2 cats fed by 2 persons",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.animals_fed_by_people(int,int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 2 cats fed by 3 people",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.animals_fed_by_people(int,int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There is 1 ox fed by 4 persons",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.animals_fed_by_people(int,int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.step({
        "name": "There are 3 oxen fed by 5 people",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.animals_fed_by_people(int,int)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenario({
        "name": "105 - Data tables",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "I have the following order",
        "rows": [
            {
                "cells": [
                    "vegetable",
                    "amount",
                    "cost"
                ]
            },
            {
                "cells": [
                    "cucumber",
                    "4",
                    "10"
                ]
            },
            {
                "cells": [
                    "carrot",
                    "5",
                    "6"
                ]
            },
            {
                "cells": [
                    "potato",
                    "6",
                    "4"
                ]
            }
        ],
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_the_following_order(DataTable)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenario({
        "name": "106 - List of domain objects",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "I have another order",
        "rows": [
            {
                "cells": [
                    "vegetable",
                    "amount",
                    "cost"
                ]
            },
            {
                "cells": [
                    "cucumber",
                    "4",
                    "10"
                ]
            },
            {
                "cells": [
                    "carrot",
                    "5",
                    "6"
                ]
            },
            {
                "cells": [
                    "potato",
                    "6",
                    "4"
                ]
            }
        ],
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_another_order(VeggieShop\u003e)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
    formatter.scenario({
        "name": "107 - Get and keep the double quotes",
        "description": "",
        "keyword": "Scenario"
    });
    formatter.before({
        "status": "passed"
    });
    formatter.step({
        "name": "I have a shop named \"\"VeggieShop\"\"",
        "keyword": "Given "
    });
    formatter.match({
        "location": "Steps.i_have_a_shop_named(String)"
    });
    formatter.result({
        "status": "passed"
    });
    formatter.after({
        "status": "passed"
    });
});