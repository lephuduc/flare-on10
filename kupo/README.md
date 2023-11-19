Kupo
====

This challenge will likely require some reading.  To begin with, it's for
2.11BSD on the PDP-11.  It's also embedded in a tape image.  And it's a Forth
interpreter.  There's a lot going on here.

Bootstrapping the emulator
--------------------------
You're welcome to try bootstrapping your own 2.11BSD installation, of course;
there's nothing particularly special needed, and the installation tapes and
instructions are readily available. But it's a long process with a lot of
pitfalls and I am not trying to give you _too_ much homework here.  So I'm
including a ready-to-go system along with a SIMH configuration file (SIMH is
a very good emulator for many systems, and it is easily available on most modern
package managers).  Just run `pdp11 mog.cfg` (or `simh-pdp11`, if your install
is prefixed) and read the config file and the manual to figure out how to boot
from the disk.  Hit enter once you're in the bootloader, then once you're at
the root prompt, hit Ctrl-D to finish booting into user mode (otherwise your
terminal will be funkier than you're used to).

Of course, if you have a real PDP-11 with 2.11 BSD, you won't need to fool with
an emulator, but you will need to get the image onto a tape.  Let me know if you
need that, I can write one out for you.

Booting
-------

The root password is `Flare-On`.

You'll also need to mount the tape to tape drive TS0 and extract the executable.
There's a welcome message in the first file on the tape; just `cat /dev/rmt12`
to read it.  Beyond that, see the man page for `mt` and branch out from there!

Other notes
-----------

The entire challenge, Forth engine and everything, is written in less than a
thousand lines of assembler (with macros, and with a significant amount of
Forth code embedded in the assembly).  I hope you enjoy pulling it apart as much
as I enjoyed writing it!

- Dave

Welcome to MoogleForth!

This may be an interesting challenge for you.  The next file on this tape is an
executable Forth environment which contains a secret and the means for decoding
and decrypting that secret.  You'll need Ken Thompson's password, which I trust
you'll be able to find.  Beyond that, you'll need to figure out how the various
Forth words want their input, which will require some detective work on your
part.

You can solve this challenge with nothing but the tools available to you on a
standard 2.11BSD system, such as nm and adb (and if you're not familiar, you
should read their man pages).  You may find it easier to use a more modern
disassembler, though you'll need to be able to extract the file from the tape
for that.  And, of course, you need to know (or learn) how Forth works.  On the
bright side, I did leave all the symbols in the executable for you, I'm not a
monster.

The Forth environment is fairly stripped down, but where possible, I've tried
to conform to standard behaviors for all the standard words.  You can find much
documentation for Forth 2012 online, with an excellent reference at:

http://lars.nocrew.org/forth2012/alpha.html

Some caveats:

- There's very little error checking here.  You'll probably crash a lot if you
  provide unexpected input (or fail to provide expected input).  Sometimes,
  especially if you underflow the stack, the interpreter can get confused.
  You can always ctrl-C to quit if 'bye' isn't working for you.

- I've basically implemented just enough of the words to build this challenge.
  In particular, there's no compiler system, so you can't write your own colon
  definitions.  Sorry!  There was only so much time.

- Some of the words are defined in assembly, most are defined as more Forth.
  This may make disassembly interesting, but doable.

- It is dark.  You are likely to be eaten by a grue.