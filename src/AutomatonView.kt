import javax.swing.JTabbedPane.*
import java.awt.Toolkit
import javax.swing.*
import javax.swing.border.*

fun mainWindow(){

    var frame = JFrame("Automatons in Kotling - Mario V. 21021072")
    val screenSize = Toolkit.getDefaultToolkit().screenSize
    var tabsFrame = JTabbedPane()

    var dfaPanel = JPanel(false)
    dfaPanel.setLocation(20,20)
    dfaPanel.setSize(10,10)
    dfaPanel.border = BorderFactory.createLoweredBevelBorder()
    tabsFrame.addTab("DFA",dfaPanel)



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