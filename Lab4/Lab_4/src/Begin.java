import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Begin {
	public static void main (String [] args) {
		Display display = new Display ();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(2, false));
		
		
		Button addStudent = new Button(shell, SWT.PUSH);
		addStudent.setText("Add Student");
		addStudent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				Student student = new Student(Library.library);
				student.start();
			}
		});
		addStudent.pack();

		Text numberOfBooksInLibrary = new Text(shell, SWT.BORDER);
		numberOfBooksInLibrary.pack();
		
		Button refresh = new Button(shell, SWT.PUSH);
		refresh.setText("refresh");
		refresh.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numberOfBooksInLibrary.setText(((Integer)Library.library.GetNumberOfBooks()).toString());
			}
		});
		refresh.pack();
		

		
		shell.pack();
		shell.setSize(400, 400);
		shell.open();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose();
	}
}