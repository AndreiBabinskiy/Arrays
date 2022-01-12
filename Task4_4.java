import java.util.Random;

public class Task4_4 {

    static final int MAP_WIDTH = 10;

    static final int MAP_HEIGHT = 10;

	static final int FULL_MAP_WIDTH = 12;

    static final int FULL_MAP_HEIGHT = 12;
	
    static final char FREE_CELL = '_';

    static final char SHIP_CELL = '0';

    static final char BORDER_CELL = '*';

	static final int RIGHT_DIRECTION = 1;

	static final int LEFT_DIRECTION = 2;

	static final int DOWN_DIRECTION = 3;

	static final int UP_DIRECTION = 4;

	public static void main(String[] args) {

		char[][] seaMap = new char[MAP_WIDTH][MAP_HEIGHT];
		int[] shipSizes = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

		for (int i = 0; i < seaMap.length; i++) {
            for (int j = 0; j < seaMap[i].length; j++) {
                seaMap[i][j] = FREE_CELL;
            }
        }
		
		int row;
		int col;
		boolean success;
		Random random = new Random();

		while(true) {
			boolean totalSuccess = true;

			for (int deskSize : shipSizes) {
				int direction = RIGHT_DIRECTION;
				int attemptCount = 0;
				while(true) {
					row = random.nextInt(10);
					col = random.nextInt(10);
					System.out.println("row = " + row + ", col = " + col + ", deskSize = " + deskSize);

					if (seaMap[row][col] == BORDER_CELL || seaMap[row][col] == SHIP_CELL) {
						System.out.println("BORDER OR SHIP");
						continue;
					}

					direction = RIGHT_DIRECTION;
					success = true;

					if (col + deskSize < MAP_WIDTH) {
						for (int i = 0; i < deskSize; i++) {
							if (seaMap[row][col + i] == BORDER_CELL) {
								System.out.println("BORDER IN " + row + ", " + (col + i));
								success = false;
								break;
							}
						}
					} else {
						success = false;
					}

					if (success == true) {
						break;
					}
					
					direction = DOWN_DIRECTION;
					success = true;

					if (row + deskSize < MAP_HEIGHT) {
						for (int i = 0; i < deskSize; i++) {
							if (seaMap[row + i][col] == BORDER_CELL) {
								System.out.println("BORDER IN " + (row + i) + ", " + col);
								success = false;
								break;
							}
						}
					} else {
						success = false;
					}

					if (success == true) {
						break;
					}

					direction = LEFT_DIRECTION;
					success = true;

					if (col - deskSize >= 0) {
						for (int i = 0; i < deskSize; i++) {
							if (seaMap[row][col - i] == BORDER_CELL) {
								System.out.println("BORDER IN " + row + ", " + (col - i));
								success = false;
								break;
							}
						}
					} else {
						success = false;
					}

					if (success == true) {
						break;
					}

					direction = UP_DIRECTION;
					success = true;

					if (row - deskSize >= 0) {
						for (int i = 0; i < deskSize; i++) {
							if (seaMap[row - i][col] == BORDER_CELL) {
								System.out.println("BORDER IN " + (row - i) + ", " + col);
								success = false;
								break;
							}
						}
					} else {
						success = false;
					}

					if (success == true) {
						break;
					}
					
					attemptCount++;
					if (attemptCount >= 1000) {
						break;
					}
				}
				
				if (success = false && attemptCount >= 1000) {
					totalSuccess = false;
					System.out.println("I tried to find palce 1000 times. And I can't :)");
					System.out.println("I can't find place for " + deskSize + " ship");
					break;
				}

				switch(direction) {
					case RIGHT_DIRECTION: {
						for (int i = 0; i < deskSize; i++) {
							seaMap[row][col + i] = SHIP_CELL;
						}
						break;
					}
					case LEFT_DIRECTION: {
						for (int i = 0; i < deskSize; i++) {
							seaMap[row][col - i] = SHIP_CELL;
						}
						break;
					}
					case DOWN_DIRECTION: {
						for (int i = 0; i < deskSize; i++) {
							seaMap[row + i][col] = SHIP_CELL;
						}
						break;
					}
					case UP_DIRECTION: {
						for (int i = 0; i < deskSize; i++) {
							seaMap[row - i][col] = SHIP_CELL;
						}
						break;
					}
				}

				for (int i = 0; i < seaMap.length; i++) {
					for (int j = 0; j < seaMap[i].length; j++) {
						if (seaMap[i][j] == SHIP_CELL) {
							for (int x = -1; x < 2; x++) {
								for (int y= -1; y < 2; y++) {
									if (i + x >= 0 && i + x < MAP_WIDTH && j + y >= 0 && j + y < MAP_HEIGHT) {
										if (seaMap[i + x][j + y] == FREE_CELL) {
											seaMap[i + x][j + y] = BORDER_CELL;
										}
									}
								}
							}
						}
					}
				}
			}

			if (totalSuccess == true) {
				break;
			}
		}
		
		// 3. Распечатать карту
        for (int i = 0; i < seaMap.length; i++) {
            for (int j = 0; j < seaMap[i].length; j++) {
                System.out.print(seaMap[i][j]);
            }

            System.out.println();
        }	
	}
}