# 3311SoftwareProject2
Software Project 2 for EECS3311(Mini Soccer-game) by Farnad Kazem-Zadeh, Bryce Cooke, Jasleen Chagger and Angelo Alcober.

A Striker controlled by the player attempts to score on a goalkeeper moving in a randomzied manner, with several rules:
- Use the Arrow Keys to control the movement of the striker.
- The goal keeper moves randomly in a gaussian distribution fashion, where the center of the gate acts as the mean value.
- The striker and the goal keeper cannot cross the penalty line.
- Use the space bar to make the striker shoot the ball
- The goal keeper will pick up the ball if the ball falls within its side of the penalty line and not in the gate.
- GamePlayer will pick up the soccer ball if they're within 55 radius of each other. 
- If the ball shot by the striker lands in the gate area, the goal of the current game will increment by 1, game will set to pause, and the position of ball, 
striker and goal keeper will be reset.
- If the ball shot by the striker lands in its side of the penalty line, nothing will happen.
- If the soccer ball shot by the striker lands in the other side of the penalty line, and not in the gate area, the goal keeper will catch the soccer ball 
automatically and is considered to have caught 1 ball. The goal keeper will then kick the SoccerBall back to the Striker side of the penalty line.
- Game is over if and only if the remaining time is 0.
- If the game is on pause, neither the game player nor the soccer ball can move.
- If the game is over, the statistics of each game player will be sorted and displayed, while all controls, including pause and resume will be disabled until a new soccer game is started.
