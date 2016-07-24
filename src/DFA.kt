class DFA(){

    var states : MutableList<State> = mutableListOf()
    var transitions: MutableList<Transition> = mutableListOf()

    fun addNewState(stateName: String, stateType: String){
        if(states.isEmpty()){
            val state = State(stateName,"I")
            if(!stateExists(state))
                states.add(state)
        }
        else if(stateType == "F"){
            val state = State(stateName,"F")
            if(!stateExists(state))
                states.add(state)
        }
        else{
            val state = State(stateName, "N")
            if(!stateExists(state))
                states.add(state)
        }
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





























