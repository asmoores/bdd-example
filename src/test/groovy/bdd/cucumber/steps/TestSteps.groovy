package bdd.cucumber.steps

import cucumber.api.PendingException

this.metaClass.mixin(cucumber.api.groovy.EN)

Given(~/^we are interested in the serenity report$/) { ->
}

When(~/^we want to see a Passing test$/) { ->
}

Then(~/^we run a test that passes$/) { ->
    assert true
}

When(~/^we want to see a Pending test$/) { ->
}

Then(~/^we run a test that has a pending step$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}

When(~/^we want to see a Ignored test$/) { ->
}

Then(~/^we run a test that is being Ignored$/) { ->
    // Write code here that turns the phrase above into concrete actions
    throw new RuntimeException("the scenario that includes this step should not have been invoked.")
}

When(~/^we want to see a Failing test$/) { ->
}

Then(~/^we run a test that fails$/) { ->
    assert false
}

When(~/^we want to see a Error test$/) { ->
}

Then(~/^we run a test that errors$/) { ->
    throw new RuntimeException("fail")
}
