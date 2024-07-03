# StackOverflowError reproducer

```
$ wget https://github.com/pmd/pmd/releases/download/pmd_releases%2F7.3.0/pmd-dist-7.3.0-bin.zip
$ unzip pmd-dist-7.3.0-bin.zip
$ PMD_JAVA_OPTS="-Dpmd.error_recovery" pmd-bin-7.3.0/bin/pmd check -d test/ -R ruleset.xml -f text
```
