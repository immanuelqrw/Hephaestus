# Metis

YAML to dataclass converter

## Overview

Script which converts a template into a dataclass file for many languages

## Supported Languages

- Kotlin
- TypeScript


## YAML Structure

Examples are in the example folder

- name: String
- fields: List<Field>
  - Field:
    - name: **String**
    - type: **String**
    - default: **Any** (*Optional*)
    - mutable: **Boolean** (*Optional*)
    - lastField: **Boolean** (*Optional*)
