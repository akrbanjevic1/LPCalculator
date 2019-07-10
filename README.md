# LPCalculator
A simple Android App I built for the purpose of playing Yu-Gi-Oh more efficiently.

This is my first Android App, and I am using this to synthesize what I have learned from self-studying Android Development.

That being said, here is what the app is about:

It features a MainActivity with lots of information on it (in the form of different views) On this activity, we have:

  1.A TextView in the center that displays total Life Points. The number present
  changes depending on what buttons are clicked (or input given).
  
  2.We have 4 LP buttons in all four corners. These serve the function of quickly being
  able to deduct a certain amount of lifepoints. On the top of the activity, we have
  buttons to deduct and add 100 lifepoints. On the bottom, we have buttons to deduct and
  add 25 lifepoints. 
  
  3. We have 2 textviews, 1 above and 1 below the lifepoint textview that allow the 
  user to input a custom amount of lifepoints to be deducted. 
  
  4. We have 2 buttons, 1 above and 1 below the lifepoints textview that serve the purpose
  of submitting the amount of lifepoints input by the user.
  
  5. A coinflip button, near the top of the activity, serves the purpose of taking
  the user to another activity. This activity handles the flipping of a coin, which is 
  set to be random. 
  
  The CoinFlip activity shows a random image of a coin (heads or tails), and a textview
  displays text telling the user if it's a head or tails.
  
 Overall, this app was a great learning experience for me. It allowed me to practice
 having 2 activities interact with one another, and it allowed me to put to practice
 everything I have learned about Views and receiving user input. While the constraints
 might be a bit wacky due to my first time developing with ConstraintLayout, best 
 results were achieved using:
 
 A Pixel Emulator (API 26)
 and 
 A Galaxy S5
 
 Thanks for taking the time to look at my application; I hope that you enjoy it 
 as much as I did developing it!
