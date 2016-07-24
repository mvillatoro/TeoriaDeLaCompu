/**
 * Created by mvill on 24/07/2016.
 */

class State(name: String, type: String){
    var stateName: String
    var stateType: String

    /*TYPES:
        I: initial
        N: Node
        F: Final
     */

    init{
        stateName = name
        stateType = type
    }
}