/**
 * Created by mvill on 24/07/2016.
 */

class Transition(character : String, origin: State, destiny : State ){
    var transitionChar: String
    var transitionOrigin: State
    var transitionDestiny: State

    init{
        transitionChar = character
        transitionOrigin = origin
        transitionDestiny = destiny
    }
}