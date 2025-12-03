Throughout this project there is a basic design. This is outlined below.

First the data is gather from the text file through the io package. After,
it is passed up to the processing layer, where calculations for statistics
are made.

Finally, the data is passed up to the Display layer, where in the ui package,
through the swing GUI package is displayed or can be manipulated by the user.


<-----Classes----->
Data Layer:
    - DataLoader
    - DataSaver

Processing Layer:
    - Side
    - Statistics
    - SummaryCalculator
    - Transaction

Display Layer:
    - AddRowDialog
    - DatasetTableModel
    - MainFrame
    - TransactionTable

Github: github.com/daviddoherty10/Java-Swing-Project
