xke-sonar
=========

Prepare your stuff
------------------

Download sonar 3.2 at http://dist.sonar.codehaus.org/sonar-3.2.zip

Clone the exercices

`git clone git://github.com/jsmadja/xke-sonar.git`

Unpack Sonar 3.2 

`unzip sonar-3.2.zip`

Start Sonar 

`sonar-3.2/bin/macosx-universal-64/sonar.sh start`

Download whole universe with Maven 

`./sonar-all.sh`

Now, you're ready to listen to me for a while :)

Learn stuff with Sonar 3
------------------------

Slides ares available here: www

Now let's go. Take your favorite IDE and prepare to fight.

Quest #1 - Fight the LCOM4
--------------------------

You have to find LCOM4 problem to solve.

Remember the initial value and start refactoring.

When you're done, launch a Sonar analysis and look if you improved the code.

You must be able to teach what you learn!

Quest #2 - Fight the Cyclomatic Complexity
------------------------------------------

You have to find a high cyclomatic complexity problem to solve.

Remember the initial value and start refactoring.

When you're done, launch a Sonar analysis and look if you improved the code.

Quest #3 - Fight the Tangle Package Index
-----------------------------------------

You have to find a dependency cycle problem to solve.

Remember the initial value and start refactoring.

When you're done, launch a Sonar analysis and look if you improved the code.

Quest #4 - Build your own dashboard
-----------------------------------

Customize Sonar to adapt it to your needs:
- You can add plugins
- Add or remove widgets
- Change violation levels
- ...

Quest #5 - Trap your enemies / Outsmart the traps
-------------------------------------------------
Fork the repository
In the petclinic project, add some booby trap (LCOM4, Package Tangle Index, Cyclomatic Complexity), push your traps and throw them to your enemies.

Your enemies prepared some gifts for you! Clone their repositories and fix the bugs. Your custom dashboard should help you to identify the traps.

Quest #6 - Write your memories
------------------------------

What's your favorites skills ?

Show us your dashboard!

What would you do in your everyday work ?