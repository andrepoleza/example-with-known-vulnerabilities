(defproject example-with-known-vulnerabilities "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 ; No known vulnerabilities, but have dependencies
                 [org.clojure/data.json "0.2.6"]
                 [korma "0.4.3"]
                 [com.amazonaws/aws-lambda-java-core "1.2.0"],

                 ; Sub-dependency has MEDIUM rated-vulnerabilities
                 [org.apache.maven.wagon/wagon-http "2.2"]

                 ; Has HIGH severity vulnerabilities
                 [com.fasterxml.jackson.core/jackson-databind "2.4.2"]
                 [com.fasterxml.jackson.core/jackson-annotations "2.4.0"]

                 [org.slf4j/slf4j-api "1.7.25"]]
  :repl-options {:init-ns example-with-known-vulnerabilities.core})
