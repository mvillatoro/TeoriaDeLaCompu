import java.awt.Toolkit
import javax.swing.*

fun mainWindow(){

    val frame = JFrame("Automatons in Kotling - Mario V. 21021072")
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    val tabsFrame = JTabbedPane()

    val dfaPanel = JPanel(false)
    dfaPanel.layout = null
    tabsFrame.addTab("DFA",dfaPanel)

    val dfaDisplay = JPanel(false)
    dfaDisplay.layout = null
    dfaDisplay.setBounds(150,10, 610,440)
    dfaDisplay.border = BorderFactory.createLoweredBevelBorder()

    val newStateButton = JButton("New State")
    newStateButton.setBounds(10,10,120,30)

    val newFinalStateButton = JButton("Final State")
    newFinalStateButton.setBounds(10,50,120,30)

    val newTransitionButton = JButton("New Transition")
    newTransitionButton.setBounds(10,90,120,30)

    val clearButton = JButton("Clear")
    clearButton.setBounds(10,130,120,30)

    val testStringButton = JButton("Test!")
    testStringButton.setBounds(560,470,120,30)

    val testStringInput = JCTextField()
    testStringInput.setBounds(300, 470, 250, 30)
    testStringInput.placeholder = "Type in the string you'd like to test"


    dfaPanel.add(newStateButton)
    dfaPanel.add(newFinalStateButton)
    dfaPanel.add(newTransitionButton)
    dfaPanel.add(clearButton)
    dfaPanel.add(testStringButton)
    dfaPanel.add(testStringInput)
    dfaPanel.add(dfaDisplay)

    val width = screenSize.getWidth().toInt()
    val height = screenSize.getHeight().toInt()

    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setBounds(((width/2) - 400), ((height/2) - 300), 800,600)

    frame.add(tabsFrame)
    frame.isVisible = true
}

fun main(args: Array<String>) {
    mainWindow()
}