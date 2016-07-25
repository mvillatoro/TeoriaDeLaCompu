class DFA(){

    var states : MutableList<State> = mutableListOf()
    var transitions: MutableList<Transition> = mutableListOf()

    fun addNewState(stateName: String){
        var newState: State
        var stateType: String

        if(states.isEmpty())
            stateType = "I"
        else if(true)
            stateType = "N"
        else
            stateType = "F"

        newState = State(stateName, stateType)
        states.add(newState)
    }

    fun addNewTransition(transitionCharacter: String, transitionOrigin: State, transitionDestiny: State){
        if(states.size>1){
            val transition = Transition(transitionCharacter, transitionOrigin, transitionDestiny)
            if(!transitionExists(transition))
                transitions.add(transition)
        }
        else{
            //TODO: Send error
        }
    }

    fun stateExists(state: State): Boolean{
        for(stateD in states){
            if(stateD.stateName == state.stateName)
                if(stateD.stateType == state.stateType)
                    return true
        }
        return false
    }

    fun transitionExists(transition: Transition): Boolean{
        for(transitionD in transitions){
            if(transitionD.transitionChar == transition.transitionChar)
                if(transitionD.transitionOrigin != transition.transitionOrigin){
                    if(transitionD.transitionDestiny == transition.transitionDestiny)
                        return true
                }
            return false
        }
        return false
    }
}





























