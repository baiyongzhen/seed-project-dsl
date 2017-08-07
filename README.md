# seed-project-dsl

```bash
#!/bin/bash
mkdir -p libs && cd libs

if [ ! -f "snakeyaml-1.17.jar" ]; then
    wget https://repo1.maven.org/maven2/org/yaml/snakeyaml/1.17/snakeyaml-1.17.jar
fi
```