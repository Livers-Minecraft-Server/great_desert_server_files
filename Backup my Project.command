#!/bin/bash
clear
echo -n -e "\033]0;Backing up your project\007"
echo "Backing up your project"
echo

exitScript() {
    if [ "$YD_DEV" == "1" ]; then
        osascript -e 'tell application "Terminal" to close (every window whose name contains "Backing up your project")' &
    else
        killall Terminal &
    fi
    exit
}

# Get current path passed in by Eclipse from $0 and change to that folder
CURRENT_PATH=$(dirname "${0}")
cd "$CURRENT_PATH"

# Get the current folder name
CURRENT_FOLDER_NAME=${PWD##*/}

# Make sure the server is not running
number=$(ps aux | grep GradleStartServer | grep "$CURRENT_FOLDER_NAME" | wc -l)
if [ $number -gt 0 ]; then
    read -rsp $'It looks like your server is still running. Please shut down your server before making a backup.\n'
    exitScript
fi

# Do the backup
"/Users/mr.lucifitz/Desktop/Youth Digital/Server Design 1/Resources/Software/nodejs/bin/node" "/Users/mr.lucifitz/Desktop/Youth Digital/Server Design 1/Resources/Software/scripts/backup-files/index.js" \
    --include "src" \
    --include "run" \
    --backup-name "$CURRENT_FOLDER_NAME" \
    --restore-script-template "/Users/mr.lucifitz/Desktop/Youth Digital/Server Design 1/Resources/Software/scripts/Restore my Project.command" \
    --destination "/Users/mr.lucifitz/Desktop/Youth Digital/Server Design 1/Backups"

if [ $? -ne 0 ]; then
    read -rsp $'Press enter to continue...\n'
fi

exitScript
