# Gopher-Hunting-Game

The game is played by two worker threads contained in the app, running different algorithms and playing
against each other. (There is no human input once the game is started.) There are exactly 100 holes in the
field; the holes are arranged as a 1010 matrix and equally spaced with respect to each other. The first thread
to find gopher wins the game.

The app supports a continuous-play mode whereby the two threads play without interruption until one
thread wins the game. Each time a player makes a guess at to the location of the gopher, it receives feedback
indicating how close the guess was to the gopher’s location, including whether the gopher’s location was
discovered correctly.

