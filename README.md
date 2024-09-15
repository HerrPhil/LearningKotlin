# Journey to Learn Kotlin

Here is an app to write kotlin code in.

## Github Configuration

The code was generated locally by Android Studio, from its templates.

I chose a "Basic Activity" app from the new project wizard.

I created the remote repository as per usual.

Except, Android Studio created the .gitignore for Android.

I skipped that file in the repository creation.

## Learning about state of Android Studio on my MacBook Pro

I have encountered a resource deficit.

My laptop only has 16 GB of RAM.

When Android Studio launches, then it needs 2.3 GB of RAM.

When an emulator launches, then it needs approximately 7 GB of RAM.

The other apps needs from 6 GB to 9 GB, like Chrome.

Therefore Android Studio development is on hold.

I will not be able to use Android Studio as a way to learn Kotlin.

The average cost to upgrade to a modern MacBook Pro with enough memory
is between $3,500 and $4,600.

Here is the emulator tool command-line call to reveal the RAM requirements
that an emulator has. The average memory demands of an emulator process
is approximately 7.5 GB. The emulator name is whatever you call it when
it is created in Android Studio. Spaces are replaced with underscores.

/users/westworld/Library/Android/sdk/tools/emulator -avd Pixel_8_Pro_API_34 -verbose -show-kernel

## Focused language coding and testing

It was bothering me that there must be a way to only run Kotlin code.

Even on my legacy laptop with its minimum RAM allotment.

I did a google search and found this very helpful article.

[6 Ways to Run Kotlin Code in Android Studio](https://hackernoon.com/6-ways-to-run-kotlin-code-in-android-studio)

1. create an empty activity

I effectively tried this with a basic activity project. The emulator is too
memory-intensive for me to run

2. Use Kotlin REPL

The scripting window process is so slow that it appears frozen.
However, after a lot of waiting, the code does execute.

3. Create a separate file

This solution makes sense to me. It is performant.

Android Studio can recognize this is a Kotlin file, and can run it separately from the entire project.

This one can be tracked in git. The other two file-based options do not.

4. Use scratch + kotlin script

This is handy for quickly trying out a few lines of code.

This is accessed by pressing control + shift + N.

A new scratch.kts file is opened in the open files tab list.

5. Debugging

Pass - requires app to run.

6. Use the IDE  scripting console

This is similar to the scratch file.

Press command + shift + A. This is sometimes buggy. An alternative is to click the Help menu item,
and click "Find Action ...".

Type "IDE Scripting Console"

A new ide-scripting.kts file is opened in the open files tab list.
