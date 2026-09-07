import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class FileExplorer extends JFrame {

    // =========================
    // GUI COMPONENTS
    // =========================

    private JTree directoryTree;
    private JList<String> fileList;

    private JButton backButton;
    private JButton forwardButton;
    private JButton upButton;

    private JTextField addressBar;
    private JTextField searchBar;

    private JLabel statusLabel;

    // =========================
    // CONSTRUCTOR
    // =========================

    public FileExplorer() {

        setTitle("Java File Explorer");
        setSize(1000, 650);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        createGUI();
    }

    // =========================
    // CREATE GUI
    // =========================

    private void createGUI() {

        // Main layout
        setLayout(new BorderLayout());


        // ==========================================
        // TOP TOOLBAR
        // ==========================================

        JPanel toolbar = new JPanel(new BorderLayout());

        // Navigation buttons
        JPanel navigationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        backButton = new JButton("←");
        forwardButton = new JButton("→");
        upButton = new JButton("↑");

        navigationPanel.add(backButton);
        navigationPanel.add(forwardButton);
        navigationPanel.add(upButton);


        // Address bar
        addressBar = new JTextField();

        addressBar.setText("C:\\Users\\YourName");

        addressBar.setPreferredSize(new Dimension(400, 30));


        // Search bar
        searchBar = new JTextField();

        searchBar.setText("Search");

        searchBar.setPreferredSize(new Dimension(180, 30));


        toolbar.add(navigationPanel, BorderLayout.WEST);
        toolbar.add(addressBar, BorderLayout.CENTER);
        toolbar.add(searchBar, BorderLayout.EAST);


        // Add toolbar to window
        add(toolbar, BorderLayout.NORTH);


        // ==========================================
        // LEFT SIDE - DIRECTORY TREE
        // ==========================================

        DefaultMutableTreeNode root =
                new DefaultMutableTreeNode("This PC");

        DefaultMutableTreeNode desktop =
                new DefaultMutableTreeNode("📁 Desktop");

        DefaultMutableTreeNode documents =
                new DefaultMutableTreeNode("📁 Documents");

        DefaultMutableTreeNode downloads =
                new DefaultMutableTreeNode("📁 Downloads");

        DefaultMutableTreeNode pictures =
                new DefaultMutableTreeNode("📁 Pictures");

        DefaultMutableTreeNode music =
                new DefaultMutableTreeNode("📁 Music");


        root.add(desktop);
        root.add(documents);
        root.add(downloads);
        root.add(pictures);
        root.add(music);


        directoryTree = new JTree(root);


        JScrollPane treeScrollPane =
                new JScrollPane(directoryTree);


        // ==========================================
        // RIGHT SIDE - FILE LIST
        // ==========================================

        DefaultListModel<String> fileModel =
                new DefaultListModel<>();

        fileModel.addElement("📄 Assignment.docx");
        fileModel.addElement("📄 Java Notes.txt");
        fileModel.addElement("📄 Project Proposal.pdf");
        fileModel.addElement("📁 Java Projects");
        fileModel.addElement("📁 GitHub Projects");
        fileModel.addElement("🖼️ Screenshot.png");


        fileList = new JList<>(fileModel);

        fileList.setFont(new Font(
                "Arial",
                Font.PLAIN,
                16
        ));

        fileList.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );


        JScrollPane fileScrollPane =
                new JScrollPane(fileList);


        // ==========================================
        // SPLIT PANE
        // ==========================================

        JSplitPane splitPane =
                new JSplitPane(
                        JSplitPane.HORIZONTAL_SPLIT,
                        treeScrollPane,
                        fileScrollPane
                );

        splitPane.setDividerLocation(280);

        splitPane.setOneTouchExpandable(true);


        // Add split pane to center
        add(splitPane, BorderLayout.CENTER);


        // ==========================================
        // STATUS BAR
        // ==========================================

        JPanel statusBar = new JPanel(
                new BorderLayout()
        );

        statusLabel =
                new JLabel("6 items");

        statusBar.add(
                statusLabel,
                BorderLayout.WEST
        );


        JLabel storageLabel =
                new JLabel("  Local Disk");

        statusBar.add(
                storageLabel,
                BorderLayout.EAST
        );


        add(statusBar, BorderLayout.SOUTH);
    }


    // =========================
    // MAIN METHOD
    // =========================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            FileExplorer explorer =
                    new FileExplorer();

            explorer.setVisible(true);
        });
    }
}