# jdk-demo


`cf push`

`cf set-env controller-test JBP_CONFIG_OPEN_JDK_JRE '{ jre: { version: 11.+ }, memory_calculator: { stack_threads: 25 } }'`

`cf restage controller-test`
