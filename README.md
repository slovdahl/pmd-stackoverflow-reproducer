# StackOverflowError reproducer

```
$ wget https://github.com/pmd/pmd/releases/download/pmd_releases%2F7.3.0/pmd-dist-7.3.0-bin.zip
$ unzip pmd-dist-7.3.0-bin.zip
$ PMD_JAVA_OPTS="-Dpmd.error_recovery" pmd-bin-7.3.0/bin/pmd check -d test/ -R ruleset.xml -f text
```

```
$ java -version
openjdk version "21.0.3" 2024-04-16 LTS
OpenJDK Runtime Environment Temurin-21.0.3+9 (build 21.0.3+9-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.3+9 (build 21.0.3+9-LTS, mixed mode, sharing)

$ PMD_JAVA_OPTS="-Dpmd.error_recovery" pmd-bin-7.3.0/bin/pmd check -d test/ -R ruleset.xml -f text
[WARN] Progressbar rendering conflicts with reporting to STDOUT. No progressbar will be shown. Try running with argument -r <file> to output the report to a file instead.
[WARN] This analysis could be faster, please consider using Incremental Analysis: https://docs.pmd-code.org/pmd-doc-7.3.0/pmd_userdocs_incremental_analysis.html
test/Settings.java	-	StackOverflowError: null
[INFO] An error occurred while executing PMD.
Run in verbose mode to see a stack-trace.
If you think this is a bug in PMD, please report this issue at https://github.com/pmd/pmd/issues/new/choose
If you do so, please include a stack-trace, the code sample
 causing the issue, and details about your run configuration.
```
