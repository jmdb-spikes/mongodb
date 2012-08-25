(defproject jmdb.spikes/mongodb "1.0.0-SNAPSHOT"

  :description "A simple mongodb spike"
  :dependencies [[log4j "1.2.15" :exclusions [[javax.mail/mail :extension "jar"]
                                              [javax.jms/jms :classifier "*"]
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]
                 [org.slf4j/slf4j-log4j12 "1.6.0"]
                 [org.slf4j/slf4j-api "1.6.0"]
                 [org.mongodb/mongo-java-driver "2.8.0"]]

  :java-source-paths ["src/main/java"]
  :resource-paths ["src/main/resource"]
  :compile-path "target/classes"
  :native-path "src/native"
  :target-path "target/"
  :jar-name "sample.jar"
  :uberjar-name "sample-standalone.jar"
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :omit-source false
  :main jmdb.spikes.mongodb.Application)

