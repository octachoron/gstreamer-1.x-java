#!/bin/bash

sed -e "/\/\/!probed-lib-overrides/r _lib_overrides.in" \
    -e "//d" config.template.jnaerator > config.jnaerator
