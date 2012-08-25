(defproject jmdb.spikes/mongodb "1.0.0-SNAPSHOT"
  :description "A simple mongodb spike"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]
                 [org.slf4j/slf4j-log4j12 "1.6.0"]
                 [org.slf4j/slf4j-api "1.6.0"]
                 [org.mongodb/mongo-java-driver "2.8.0"]]

  :dev-dependencies [[expectations "1.4.3"]]

  ;:library-path "target/lib"
  :java-source-path "src/main/java"
  :java-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :resources-path "src/main/resource"
  :compile-path "target/classes"
  :target-path "target"
  :jar-name "target/mongodb-spike.jar"
  :uberjar-name "target/mongodb-spike-standalone.jar"
  :omit-source true
  :main jmdb.spikes.mongodb.Application)

