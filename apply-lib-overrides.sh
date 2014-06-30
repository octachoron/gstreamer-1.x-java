#!/bin/bash

echo 'Applying auto-detected overrides and skip patterns to JNAerator config template...'
sed -e "/\/\/!probed-lib-overrides/r _lib_overrides.in" \
    -e "//d" config.template.jnaerator > config.jnaerator
echo 'Done'
