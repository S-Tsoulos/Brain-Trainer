/**
 *Sotiris Tsoulos icsd13190
 * 
 */
package braintrainer.shapes;

/**
 * Interface pou periexei diathesimes leitourgies enos pinaka , stin prokeimeni tou GameBoard , voithaei sto flexibility kai kanei ton kodiko pio decoupled.
 */
public interface Gameboard_Fuctions {
    public void GameLoop();
     public void gameBoardInit(String diffLvl);
     public void gameBoardFill();
      public void deleteTilesPair();
       public void resetDraw();
       public void initMilestoneLabels();
}
