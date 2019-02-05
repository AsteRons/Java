ZMIANA WYGLĄDU I WRAŻENIA APLIKACJI:

Program zmienia wyglą aplikacji

1. Menadżer do ustawiania aplikacji na Windows:

  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  
 2.  Należy odświeżyć aplikacje:
         
		 SwingUtilities.updateComponentTreeUI(this);
		 
3. Do wybierania wyglądu posłużymy się porównywaniem stringów

com.sun.java.swing.plaf.morif.MotifLookAndFeel - String wyglądu dla Windowsa

