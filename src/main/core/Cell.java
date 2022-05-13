package main.core;

import main.enums.CellStatus;

public class Cell {
    public int row;
    public int col;
    private boolean isMine;
    private CellStatus cellStatus;
    private int numAdjacentMines = 0;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        isMine = false;
        cellStatus = CellStatus.HIDDEN;
    }

    public boolean isMine() {
        return isMine;
    }

    public boolean isHidden() {
        return cellStatus == CellStatus.HIDDEN;
    }

    public boolean isFlagged() {
        return cellStatus == CellStatus.FLAGGED;
    }

    public void setCellStatus(CellStatus status) {
        this.cellStatus = status;
    }

    public void setMine(boolean bool) {
        this.isMine = bool;
    }

    public void setNumAdjacentMines(int num) {
        this.numAdjacentMines = num;
    }

    public int getNumAdjacentMines() {
        return this.numAdjacentMines;
    }
}
