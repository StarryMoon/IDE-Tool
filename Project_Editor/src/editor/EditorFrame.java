package editor;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class EditorFrame extends JFrame {

	private JTabbedPane tabPane;
	private JDesktopPane deskPane;
	private Box box;
	
	private JSplitPane editorSplitPane;
	private JTextArea infoArea;
	private JScrollPane infoScrollPane;
	
	
	public EditorFrame(String title) {
		super(title);//调用父类的构造方法
	    pack();	    
	}
	
	public void initiFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabPane=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
	    deskPane=new JDesktopPane();
	    deskPane.setBackground(Color.WHITE);
	    box=new Box(BoxLayout.Y_AXIS);
	    box.add(tabPane);
	    box.add(deskPane);
	    
	    infoArea=new JTextArea(" ",5,50);
	    infoScrollPane=new JScrollPane(infoArea);
	    infoArea.setEditable(false);
	    
	    editorSplitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT,box,infoScrollPane);//只能是两个容器 
	    editorSplitPane.setDividerSize(10);
	    editorSplitPane.setDividerLocation(500);
	    this.add(editorSplitPane);
	    this.pack();
	    this.setVisible(true);
	}
}
