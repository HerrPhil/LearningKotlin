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

