#!/usr/bin/env bash

set -euxo pipefail

./gradlew --stop
./gradlew clean -p buildSrc --no-daemon --no-build-cache --no-configuration-cache

rm -rfv .gradle/build-cache
rm -rfv .gradle/configuration-cache

rm -rfv buildSrc/.gradle/build-cache
rm -rfv buildSrc/.gradle/configuration-cache

rm -rfv build
rm -rfv buildSrc/build
