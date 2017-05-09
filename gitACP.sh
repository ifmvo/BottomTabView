#!/bin/bash
echo "--- BEGIN ---"
git add .
git commit -m $1
git push origin $2
echo $1 "推送到" $2
echo "--- END ---"