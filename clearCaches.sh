#!/usr/bin/env bash

set -euxo pipefail

./gradlew --stop
./gradlew clean -p plugins --no-daemon --no-build-cache --no-configuration-cache

rm -rfv .gradle/build-cache
rm -rfv .gradle/configuration-cache

rm -rfv plugins/.gradle/build-cache
rm -rfv plugins/.gradle/configuration-cache

rm -rfv build
rm -rfv plugins/build
